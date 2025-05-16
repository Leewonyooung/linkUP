package com.kosta.linkup.dao.admin;

import com.kosta.linkup.dto.AdminPrepareSettle;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
@Mapper
public interface ContractDAO {
    HashMap<String, AdminPrepareSettle> selectInfoForSettle(String id) throws Exception;
    AdminPrepareSettle selectInfoForSettleById(String id) throws Exception;
    Integer countContractsByProjectId(int projectId) throws Exception;
    void updateClientStatus(int projectId, String clientStatus) throws Exception;
}
