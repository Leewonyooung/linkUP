package com.example.linkup.dao.admin;

import com.example.linkup.dto.ClientUserDetail;
import com.example.linkup.dto.ClientUserInfo;

import java.util.List;

public interface IClientDAO {
    List<ClientUserInfo> selectAllClients() throws Exception;
    ClientUserDetail selectClientById(String userId) throws Exception;
    List<ClientUserInfo> selectClientsByKeyword(String keyword) throws Exception;
}
