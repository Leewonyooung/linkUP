package com.example.linkup.service.admin;

import com.example.linkup.dao.admin.ISettlementDAO;
import com.example.linkup.dto.AdminProject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DashboardService implements IDashboardService {

    private final ISettlementDAO settlementDAO;

    @Autowired
    public DashboardService(ISettlementDAO settlementDAO) {
        this.settlementDAO = settlementDAO;
    }

    @Override
    public List<AdminProject> getDashboardProjectList() throws Exception {
        return settlementDAO.selectProjectsForSettlementList();
    }
}
