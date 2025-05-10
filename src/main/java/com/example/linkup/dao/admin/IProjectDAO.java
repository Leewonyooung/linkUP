package com.example.linkup.dao.admin;

import com.example.linkup.dto.AdminProject;
import com.example.linkup.dto.AdminProjectDetail;

import java.util.List;

public interface IProjectDAO {
    List<AdminProject> selectAllOngoingProject() throws Exception;
    AdminProjectDetail selectProjectDetail(int projectId) throws Exception;
    List<AdminProject> selectPagedProjects(int offset, int limit, String keyword, String settleStatus, String startDate, String endDate) throws Exception;
    int countAllProjects() throws  Exception;
}
