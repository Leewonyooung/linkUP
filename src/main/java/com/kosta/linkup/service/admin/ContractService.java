package com.kosta.linkup.service.admin;

import com.kosta.linkup.dao.admin.ContractDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContractService implements IContractService{

    private static ContractDAO contractDAO;

    @Autowired
    public ContractService(ContractDAO contractDAO) {
        this.contractDAO = contractDAO;
    }

    @Override
    public void updateClientStatus(int projectId, String clientStatus) throws Exception {
        contractDAO.updateClientStatus(projectId, clientStatus);
    }
}
