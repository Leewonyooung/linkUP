package com.kosta.linkup.service.admin;

import com.kosta.linkup.dao.admin.DashboardProjectDAO;
import com.kosta.linkup.dto.AdminProject;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DashboardService implements IDashboardService {

    private final DashboardProjectDAO dashboardProjectDAO;


    @Override
    public List<AdminProject> getDashboardProjectList() throws Exception {
        return dashboardProjectDAO.selectProjectsForDashboard();
    }
}
