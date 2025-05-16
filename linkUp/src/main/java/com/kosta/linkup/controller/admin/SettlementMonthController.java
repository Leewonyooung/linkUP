package com.kosta.linkup.controller.admin;

import com.kosta.linkup.dao.admin.SettlementDAO;
import com.kosta.linkup.dto.SettledInfoDTO;
import com.google.gson.Gson;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequiredArgsConstructor
public class SettlementMonthController {

    private final SettlementDAO settlementDAO;

    @GetMapping("/admin/settlementMonth")
    public void getSettlementMonthData(
            @RequestParam("projectId") Integer projectId,
            @RequestParam("cnt") Integer cnt,
            HttpServletResponse response
    ) throws IOException {
        response.setContentType("application/json;charset=UTF-8");

        try {
            Map<String, Object> paramMap = new HashMap<>();
            paramMap.put("projectId", projectId);
            paramMap.put("cnt", cnt);

            List<SettledInfoDTO> doneList = settlementDAO.selectSettledFreelancersByMonth(paramMap);
            List<SettledInfoDTO> waitList = settlementDAO.selectWaitingFreelancersByMonth(paramMap);

            int totalAmount = 0;
            for (SettledInfoDTO dto : doneList) totalAmount += dto.getSettleAmount();
            for (SettledInfoDTO dto : waitList) totalAmount += dto.getSettleAmount();

            Map<String, Object> result = new HashMap<>();
            result.put("doneList", doneList);
            result.put("waitList", waitList);
            result.put("totalAmount", totalAmount);

            response.getWriter().write(new Gson().toJson(result));
        } catch (Exception e) {
            e.printStackTrace();
            response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
            response.getWriter().write("{\"error\": \"데이터 조회 실패\"}");
        }
    }
}
