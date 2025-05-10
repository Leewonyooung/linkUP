package com.example.linkup.controller.admin;

import com.example.linkup.dto.AdminSettleHistorySummary;
import com.example.linkup.service.admin.ISettlementService;
import com.example.linkup.util.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class SettleHistoryController {

    private final ISettlementService settlementService;

    @Autowired
    public SettleHistoryController(ISettlementService settlementService) {
        this.settlementService = settlementService;
    }

    @GetMapping("/admin/settlement-history")
    public String getSettleHistoryList(
            @RequestParam(value = "keyword", required = false, defaultValue = "") String keyword,
            @RequestParam(value = "startDate", required = false) String startDate,
            @RequestParam(value = "endDate", required = false) String endDate,
            @RequestParam(value = "page", required = false, defaultValue = "1") int curPage,
            Model model
    ) {
        int listCount = 10;

        // ✅ 페이지 정보 계산
        int totalCount;
        try {
            totalCount = settlementService.countHistory(keyword, startDate, endDate);
        } catch (Exception e) {
            e.printStackTrace();
            totalCount = 0;
        }

        PageInfo pageInfo = new PageInfo();
        pageInfo.setCurPage(curPage);

        int allPage = (int) Math.ceil((double) totalCount / listCount);
        int startPage = ((curPage - 1) / 10) * 10 + 1;
        int endPage = Math.min(startPage + 9, allPage);

        pageInfo.setAllPage(allPage);
        pageInfo.setStartPage(startPage);
        pageInfo.setEndPage(endPage);

        // ✅ 데이터 조회
        int offset = (curPage - 1) * listCount;
        List<AdminSettleHistorySummary> settlementList;
        try {
            settlementList = settlementService.selectHistorySummaryList(keyword, startDate, endDate, offset, listCount);
        } catch (Exception e) {
            e.printStackTrace();
            settlementList = List.of(); // 비어있더라도 렌더링에 문제 없도록
        }

        // ✅ JSP로 전달
        model.addAttribute("settlementList", settlementList);
        model.addAttribute("pageInfo", pageInfo);
        model.addAttribute("totalCount", totalCount);

        return "admin/settle_history";  // => /WEB-INF/views/admin/settle_history.jsp
    }
}
