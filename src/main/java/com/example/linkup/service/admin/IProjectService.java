package com.example.linkup.service.admin;

import com.example.linkup.dto.AdminProject;
import com.example.linkup.dto.AdminProjectDetail;
import com.example.linkup.util.PageInfo;

import java.util.List;

public interface IProjectService {
    AdminProjectDetail selectProjectDetail(Integer projectId) throws Exception;

    PageInfo calculatePageInfo(int curPage, int perPage, int totalCount) throws Exception;

    List<AdminProject> getPagedProjects(int offset, int perPage, String keyword, String settleStatus, String startDate, String endDate) throws Exception;

    int getTotalProjectCount(String keyword, String settleStatus, String startDate, String endDate) throws Exception;
}
