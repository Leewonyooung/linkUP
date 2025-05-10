package com.example.linkup.controller.admin;

import com.example.linkup.dao.admin.ContractDAO;
import com.example.linkup.service.admin.ContractService;
import com.example.linkup.service.admin.IContractService;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/admin")
public class UpdateClientStatusController {

    private final IContractService contractService;

    public UpdateClientStatusController() {
        this.contractService = new ContractService(new ContractDAO());
    }

    @PutMapping("/update-client-status")
    public ResponseEntity<String> updateClientStatuses(@RequestBody String jsonBody) {
        try {
            Gson gson = new Gson();
            Type listType = new TypeToken<List<Map<String, String>>>() {}.getType();
            List<Map<String, String>> updates = gson.fromJson(jsonBody, listType);

            for (Map<String, String> update : updates) {
                int projectId = Integer.parseInt(update.get("projectId"));
                String status = update.get("status");
                contractService.updateClientStatus(projectId, status);
            }

            return ResponseEntity.ok("업데이트 완료");
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(500).body("DB 업데이트 중 오류 발생");
        }
    }
}
