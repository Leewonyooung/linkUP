package com.example.linkup.dao.admin;

import com.example.linkup.dto.AdminProject;
import com.example.linkup.dto.AdminProjectDetail;
import org.apache.ibatis.session.SqlSession;
import com.example.linkup.util.MybatisSqlSessionFactory;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class ProjectDAO implements IProjectDAO {
    SqlSession sqlSession = MybatisSqlSessionFactory.getSqlSessionFactory().openSession();

    @Override
    public List<AdminProject> selectAllOngoingProject() throws Exception {
        return sqlSession.selectList("mapper.aproject.selectAllOngoingProject");
    }

    @Override
    public AdminProjectDetail selectProjectDetail(int projectId) throws Exception {
        return sqlSession.selectOne("mapper.aproject.selectProjectDetail", projectId);
    }

    @Override
    public List<AdminProject> selectPagedProjects(int offset, int limit, String keyword, String settleStatus, String startDate, String endDate) throws Exception{
        Map<String, Object> param = new HashMap<>();
        param.put("offset", offset);
        param.put("limit", limit);
        param.put("keyword", keyword);
        param.put("settleStatus", settleStatus);
        param.put("startDate", startDate);
        param.put("endDate", endDate);
        return sqlSession.selectList("mapper.aproject.selectPagedProjects", param);
    }

    @Override
    public int countAllProjects() throws Exception {
        return sqlSession.selectOne("mapper.aproject.countAllProjects");
    }

    // ProjectDAO.java
    public int countProjects(String keyword, String settleStatus, String startDate, String endDate) throws Exception {
        Map<String, Object> param = new HashMap<>();
        param.put("keyword", keyword);
        param.put("settleStatus", settleStatus);
        param.put("startDate", startDate);
        param.put("endDate", endDate);
        return sqlSession.selectOne("mapper.aproject.countProjects", param);
    }


}
