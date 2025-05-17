package com.kosta.linkup.service.admin;

import com.kosta.linkup.dao.admin.ClientDAO;
import com.kosta.linkup.dto.ClientUserDetail;
import com.kosta.linkup.dto.ClientUserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService implements IClientService {

    ClientDAO clientDAO;

    @Autowired
    public ClientService(ClientDAO clientDAO) {
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
