package com.example.linkup.service.admin;

import com.example.linkup.dao.admin.IContractDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContractService implements IContractService{

    private static IContractDAO contractDAO;

    @Autowired
    public ContractService(IContractDAO contractDAO) {
        this.contractDAO = contractDAO;
    }

    @Override
    public void updateClientStatus(int projectId, String clientStatus) throws Exception {
        contractDAO.updateClientStatus(projectId, clientStatus);
    }
}
