package com.example.linkup.service.admin;

import com.example.linkup.dao.admin.ProjectDAO;
import com.example.linkup.dto.AdminProject;
import com.example.linkup.dto.AdminProjectDetail;
import com.example.linkup.util.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService implements IProjectService{

    private static ProjectDAO projectDAO;

    @Autowired
    public ProjectService(ProjectDAO projectDAO) {
        ProjectService.projectDAO = projectDAO;
    }

    @Override
    public AdminProjectDetail selectProjectDetail(Integer projectId) throws Exception{
        return projectDAO.selectProjectDetail(projectId);
    }

    // AdminProjectService.java
    public List<AdminProject> getPagedProjects(int offset, int perPage, String keyword, String settleStatus, String startDate, String endDate) throws Exception {
        return projectDAO.selectPagedProjects(offset, perPage, keyword, settleStatus, startDate, endDate);
    }

    public int getTotalProjectCount(String keyword, String settleStatus, String startDate, String endDate) throws Exception {
        return projectDAO.countProjects(keyword, settleStatus, startDate, endDate);
    }

    public PageInfo calculatePageInfo(int curPage, int perPage, int totalCount) {
        PageInfo pageInfo = new PageInfo(curPage);
        int allPage = (int) Math.ceil((double) totalCount / perPage);
        pageInfo.setAllPage(allPage);
        int startPage = Math.max(1, curPage - 2);
        int endPage = Math.min(allPage, startPage + 4);
        pageInfo.setStartPage(startPage);
        pageInfo.setEndPage(endPage);
        return pageInfo;
    }


}
