package com.kosta.linkup.dao.admin;

import com.kosta.linkup.dto.AdminProject;
import com.kosta.linkup.dto.AdminProjectDetail;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface ProjectDAO {
    List<AdminProject> selectAllOngoingProject() throws Exception;
    AdminProjectDetail selectProjectDetail(int projectId) throws Exception;
    List<AdminProject> selectPagedProjects(int offset, int limit, String keyword, String settleStatus, String startDate, String endDate) throws Exception;
    Integer countAllProjects() throws  Exception;
    Integer countProjects(String keyword, String settleStatus, String startDate, String endDate) throws Exception ;
}
