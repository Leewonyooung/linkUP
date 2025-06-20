package com.example.linkup.dao.admin;

import com.example.linkup.dto.AdminPrepareSettle;

import java.util.HashMap;

public interface IContractDAO {
    HashMap<String, AdminPrepareSettle> selectInfoForSettle(String id) throws Exception;
    AdminPrepareSettle selectInfoForSettleById(String id) throws Exception;
    Integer countContractsByProjectId(int projectId) throws Exception;
    void updateClientStatus(int projectId, String clientStatus) throws Exception;
}
