package com.example.linkup.service.admin;

import com.example.linkup.dao.admin.IClientDAO;
import com.example.linkup.dto.ClientUserDetail;
import com.example.linkup.dto.ClientUserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService implements IClientService {

    IClientDAO clientDAO;

    @Autowired
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
