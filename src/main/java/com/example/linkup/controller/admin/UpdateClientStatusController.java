package com.example.linkup.controller.admin;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.example.linkup.dao.admin.ContractDAO;
import com.example.linkup.dao.admin.IContractDAO;
import com.example.linkup.service.admin.ContractService;
import com.example.linkup.service.admin.IContractService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@WebServlet("/admin/update-client-status")
public class UpdateClientStatusController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public UpdateClientStatusController() {
        super();
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse res) throws IOException {
        req.setCharacterEncoding("UTF-8");
        res.setContentType("application/json; charset=UTF-8");

        Gson gson = new Gson();
        BufferedReader reader = req.getReader();
        List<Map<String, String>> updates = gson.fromJson(reader, new TypeToken<List<Map<String, String>>>() {}.getType());

        IContractDAO contractDAO = new ContractDAO();
        IContractService contractService = new ContractService(contractDAO);
        try {
            for (Map<String, String> update : updates) {
                int projectId = Integer.parseInt(update.get("projectId"));
                String status = update.get("status");
                contractService.updateClientStatus(projectId, status);
            }
            res.setStatus(HttpServletResponse.SC_OK);
        } catch (Exception e) {
            e.printStackTrace();
            res.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, "DB 업데이트 중 오류 발생");
        }
    }
}
