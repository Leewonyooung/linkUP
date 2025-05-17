package com.kosta.linkup.dao.admin;

import com.kosta.linkup.dto.AdminProject;
import com.kosta.linkup.dto.DashboardProject;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface DashboardProjectDAO {
    /**
     * 대시보드에 보여줄 프로젝트 정보 가져오기
     * @return List<Project> 대시보드에 보여줄 프로젝트 정보
     */
    public List<DashboardProject> selectAllOngoingProjects();

    /**
     * 대시보드에 보여줄 프로젝트 정보 가져오기
     * @param projectId 프로젝트 ID
     * @return Project 대시보드에 보여줄 프로젝트 정보
     */
    public DashboardProject getDashboardProject(Integer projectId);

    public List<AdminProject> selectProjectsForDashboard() throws Exception;
}
