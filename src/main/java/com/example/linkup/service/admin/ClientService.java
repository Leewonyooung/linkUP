package com.example.linkup.service.admin;

import com.example.linkup.dao.admin.IClientDAO;
import com.example.linkup.dto.ClientUserDetail;
import com.example.linkup.dto.ClientUserInfo;

import java.util.List;

public class ClientService implements IClientService {

    IClientDAO clientDAO;

    public ClientService(IClientDAO clientDAO) {
        this.clientDAO = clientDAO;
    }

    @Override
    public List<ClientUserInfo> getAllClients() throws Exception {
        return clientDAO.selectAllClients();
    }

    @Override
    public ClientUserDetail selectClientById(String userId) throws Exception {
        return clientDAO.selectClientById(userId);
    }

    @Override
    public List<ClientUserInfo> selectClientsByKeyword(String keyword) throws Exception {
        return clientDAO.selectClientsByKeyword(keyword);
    }


}
