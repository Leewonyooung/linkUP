package com.kosta.linkup.service.admin;

import com.kosta.linkup.dto.AdminProject;

import java.util.List;

public interface IDashboardService {
    public List<AdminProject> getDashboardProjectList() throws Exception;
}
