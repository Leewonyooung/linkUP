/**
 * @file : DashBoardController.java
 * GET : 관리자 대시보드 페이지로 이동
 */
package com.kosta.linkup.controller.admin;

import com.kosta.linkup.dto.AdminProject;
import com.kosta.linkup.service.admin.IDashboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import java.util.List;

/**
 * 관리자 대시보드로 이동하는 서블릿<br>
 * 보내는 데이터 : <br>
 *  이번달 총 거래액 : Integer <br>
 *  이번달 계약이 성사 된 프로젝트의 수 : Integer <br>
 *  이번달에 진행이 완료 된 프로젝트의 수 : Integer <br>
 *  이번달 진행중인 프로젝트의 정보 : List(Project) <br>
 */
@Controller
public class DashBoardController {

    private final IDashboardService dashboardService;

    @Autowired
    public DashBoardController(IDashboardService dashboardService) {
        this.dashboardService = dashboardService;
    }

    @RequestMapping(value = {"/admin/dashboard"}, method= RequestMethod.GET)
    public String showDashboard(Model model) {
        Integer totalPayment = 0;
        Integer totalProjectCount = 0;
        Integer totalPaymentFee = 0;
        List<AdminProject> ongoingProjects;

        try {
            ongoingProjects = dashboardService.getDashboardProjectList();
            for (AdminProject project : ongoingProjects) {
                totalPayment += project.getTotalAmount();
                totalProjectCount++;
                totalPaymentFee += project.getTotalFee();
            }
        } catch (Exception e) {
            e.printStackTrace();
            ongoingProjects = List.of(); // 빈 리스트라도 넘겨야 null 방지
        }

        model.addAttribute("totalPayment", totalPayment);
        model.addAttribute("totalProjectCount", totalProjectCount);
        model.addAttribute("totalPaymentFee", totalPaymentFee);
        model.addAttribute("ongoingProjects", ongoingProjects);

        return "admin/dashboard"; // => /WEB-INF/views/admin/dashboard.jsp
    }
}