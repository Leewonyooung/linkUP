package com.example.linkup.controller.admin;

import com.example.linkup.dao.admin.SettlementDAO;
import com.example.linkup.dto.SettlementDetailDTO;
import com.google.gson.Gson;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@RestController
public class SettlementDetailModalController {

    private final SettlementDAO settlementDAO = new SettlementDAO();

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
