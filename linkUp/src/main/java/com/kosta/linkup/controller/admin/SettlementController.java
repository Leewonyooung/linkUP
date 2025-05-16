/**
 * SettlementController.java
 * settlement.jsp, settlement_detail.jsp, settlement_info.jsp
 * GET : 파라미터에 따라 정산 대상 프로젝트 목록, 정산 내역, 정산하기 페이지를 라우팅
 * POST : 정산하기 페이지에서 받은 폼 데이터를 기반으로 정산 내역을 테이블에 저장 및 정산 내역으로 리다이렉트
 */
package com.kosta.linkup.controller.admin;

import com.kosta.linkup.dao.admin.*;
import com.kosta.linkup.dto.*;
import com.kosta.linkup.service.admin.ISettlementService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.sql.Date;
import java.util.*;

@Controller
@RequestMapping("/admin/settlement")
public class SettlementController {

    private final ISettlementService settlementService;
    private final SettlementDAO settlementDAO;

    @Autowired
    public SettlementController(ISettlementService settlementService, SettlementDAO settlementDAO) {
        this.settlementService = settlementService;
        this.settlementDAO = settlementDAO;
    }

    @GetMapping
    public String showSettleProjectList(HttpServletRequest request, Model model) {
        try {
            HashMap<Integer, AdminSettleProject> projectList = settlementService.filterProjectsWithUnsettled();
            model.addAttribute("projectList", projectList);
            request.getSession().setAttribute("projectList", projectList);
            return "admin/settlement";
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("정산 대상 프로젝트 조회 실패");
        }
    }

    @GetMapping(params = "contractid")
    public String showSettleDetail(@RequestParam("contractid") int projectId,
                                   HttpServletRequest request,
                                   Model model) {
        try {
            int totalAmount = 0, totalFee = 0;
            Map<String, Date> settleStartandEnd = settlementDAO.selectSettleStartandEnd(projectId);
            List<AdminSettleTarget> targetList = settlementDAO.selectFreelancersForSettlement(projectId,
                    settleStartandEnd.get("startDate"), settleStartandEnd.get("endDate"));
            for (AdminSettleTarget t : targetList) {
                totalAmount += t.getTotalPay();
                totalFee += t.getFee();
            }
            HashMap<Integer, AdminSettleProject> projectList =
                    (HashMap<Integer, AdminSettleProject>) request.getSession().getAttribute("projectList");
            if (projectList == null || !projectList.containsKey(projectId)) {
                projectList = settlementDAO.selectProjectsForSettlement();
            }
            AdminSettleProject selected = projectList.get(projectId);

            model.addAttribute("totalAmount", totalAmount);
            model.addAttribute("totalFee", totalFee);
            model.addAttribute("targetList", targetList);
            model.addAttribute("project", selected);
            return "admin/settlement_detail";
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("정산 상세 페이지 조회 실패");
        }
    }

    @GetMapping(params = {"slistid", "projectId", "format=json"})
    public String showSettleInfo(@RequestParam("slistid") String slistIdParam,
                                 @RequestParam("projectId") int projectId,
                                 @RequestParam("pay") int pay,
                                 Model model) {
        try {
            int slistId = slistIdParam.isEmpty() ?
                    settlementDAO.selectFirstSlistIdByProjectId(projectId) :
                    Integer.parseInt(slistIdParam);

            HashMap<Integer, AdminSettleHistory> projects = settlementDAO.selectSettlementHistoryDetail(slistId);
            AdminSettleHistory main = projects.values().stream().findFirst().orElse(null);
            if (main != null) {
                model.addAttribute("projectJson", new Gson().toJson(main));
            }
            List<SettledInfoDTO> doneList = settlementDAO.selectSettledFreelancers(slistId);
            List<SettledInfoDTO> waitList = settlementDAO.selectWaitingFreelancers(projectId, slistId);
            List<Map<String, Object>> settlementMonths = settlementDAO.selectAllSettlementMonthsByProjectId(projectId);

            model.addAttribute("settlementMonths", settlementMonths);
            model.addAttribute("doneList", doneList);
            model.addAttribute("waitList", waitList);
            model.addAttribute("totalAmount", pay);

            return "admin/settlement_info";
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("정산 내역 조회 실패");
        }
    }

    @PostMapping
    public String processSettlement(@RequestParam("projectId") Integer projectId,
                                    @RequestParam("jsonData") String jsonData,
                                    HttpServletRequest request,
                                    Model model) {
        try {
            PrepareSettleJson[] item = new Gson().fromJson(jsonData, PrepareSettleJson[].class);
            Settlelist settlelist = settlementService.createSettleList(item[0], projectId);
            if (settlelist == null) return "redirect:/admin/settlement";

            settlementService.createSettlement(settlelist, item, projectId);

            Integer slistId = settlelist.getSlistId();
            HashMap<Integer, AdminSettleHistory> projects = settlementDAO.selectSettlementHistoryDetail(slistId);
            AdminSettleHistory main = projects.values().stream().findFirst().orElse(null);
            if (main != null) {
                model.addAttribute("projectJson", new Gson().toJson(main));
            }
            List<SettledInfoDTO> doneList = settlementDAO.selectSettledFreelancers(slistId);
            List<SettledInfoDTO> waitList = settlementDAO.selectWaitingFreelancers(projectId, slistId);
            List<Map<String, Object>> settlementMonths = settlementDAO.selectAllSettlementMonthsByProjectId(projectId);

            model.addAttribute("settlementMonths", settlementMonths);
            model.addAttribute("doneList", doneList);
            model.addAttribute("waitList", waitList);
            model.addAttribute("totalAmount", 0);

            return "admin/settlement_info";
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("정산 처리 중 오류 발생");
        }
    }
}
