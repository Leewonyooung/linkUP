package com.kosta.linkup.dao.admin;

import com.kosta.linkup.dto.ClientUserDetail;
import com.kosta.linkup.dto.ClientUserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface ClientDAO {
    List<ClientUserInfo> selectAllClients() throws Exception;
    ClientUserDetail selectClientById(String userId) throws Exception;
    List<ClientUserInfo> selectClientsByKeyword(String keyword) throws Exception;
}
