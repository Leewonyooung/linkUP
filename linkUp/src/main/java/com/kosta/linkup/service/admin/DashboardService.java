package com.kosta.linkup.service.admin;

import com.kosta.linkup.dao.admin.SettlementDAO;
import com.kosta.linkup.dto.AdminProject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DashboardService implements IDashboardService {

    private final SettlementDAO settlementDAO;

    @Autowired
    public DashboardService(SettlementDAO settlementDAO) {
        this.settlementDAO = settlementDAO;
    }

    @Override
    public List<AdminProject> getDashboardProjectList() throws Exception {
        return settlementDAO.selectProjectsForSettlementList();
    }
}
