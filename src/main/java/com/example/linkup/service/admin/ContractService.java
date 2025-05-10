package com.example.linkup.service.admin;

import com.example.linkup.dao.admin.IContractDAO;

public class ContractService implements IContractService{

    private static IContractDAO contractDAO;

    public ContractService(IContractDAO contractDAO) {
        this.contractDAO = contractDAO;
    }

    @Override
    public void updateClientStatus(int projectId, String clientStatus) throws Exception {
        contractDAO.updateClientStatus(projectId, clientStatus);
    }
}
