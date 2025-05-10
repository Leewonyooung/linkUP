package com.example.linkup.service.admin;

import com.example.linkup.dto.ClientUserDetail;
import com.example.linkup.dto.ClientUserInfo;

import java.util.List;

public interface IClientService {
    /**
     * 모든 클라이언트 정보를 가져오는 메서드
     * @return List<ClientUserInfo> - 클라이언트 정보 리스트
     * @throws Exception - SQL 예외 발생 시
     */
    List<ClientUserInfo> getAllClients() throws Exception;


    /**
     * Id와 일치하는 클라이언트 정보를 가져오는 메서드
     * @param userId
     * @return ClientUserDetail
     * @throws Exception
     */
    ClientUserDetail selectClientById(String userId) throws Exception;

    List<ClientUserInfo> selectClientsByKeyword(String keyword) throws Exception;

}
