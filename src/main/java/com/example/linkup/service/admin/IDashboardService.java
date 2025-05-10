package com.example.linkup.service.admin;

import com.example.linkup.dto.AdminProject;

import java.util.List;

public interface IDashboardService {
    public List<AdminProject> getDashboardProjectList() throws Exception;
}
