package com.kosta.linkup.controller.admin;

import com.kosta.linkup.dao.admin.SettlementDAO;
import com.kosta.linkup.dto.SettlementDetailDTO;
import com.google.gson.Gson;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class SettlementDetailModalController {

    private final SettlementDAO settlementDAO;

    @GetMapping("/admin/settlement-detail")
    public void getSettlementDetail(
            @RequestParam("freelancerName") String freelancerName,
            @RequestParam("projectId") int projectId,
            HttpServletResponse response
    ) {
        try {
            List<SettlementDetailDTO> settlementList = settlementDAO.selectSettlementHistory(freelancerName, projectId);
            response.setContentType("application/json; charset=UTF-8");
            new Gson().toJson(settlementList, response.getWriter());
        } catch (Exception e) {
            e.printStackTrace();
            response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
        }
    }
}
