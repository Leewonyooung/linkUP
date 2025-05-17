package com.kosta.linkup.service.admin;

import com.kosta.linkup.dto.AdminProject;
import com.kosta.linkup.dto.AdminProjectDetail;
import com.kosta.linkup.util.PageInfo;

import java.util.List;

public interface IProjectService {
    AdminProjectDetail selectProjectDetail(Integer projectId) throws Exception;

    PageInfo calculatePageInfo(int curPage, int perPage, int totalCount) throws Exception;

    List<AdminProject> getPagedProjects(int offset, int perPage, String keyword, String settleStatus, String startDate, String endDate) throws Exception;

    int getTotalProjectCount(String keyword, String settleStatus, String startDate, String endDate) throws Exception;
}
