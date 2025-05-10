package com.example.linkup.dao.admin;

import com.example.linkup.dto.DashboardProject;
import org.apache.ibatis.session.SqlSession;
import com.example.linkup.util.MybatisSqlSessionFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DashboardProjectDAO implements IDashboardProjectDAO{

    SqlSession sqlSession = MybatisSqlSessionFactory.getSqlSessionFactory().openSession();

    @Override
    public List<DashboardProject> selectAllOngoingProjects() {
        return sqlSession.selectList("mapper.dproject.selectAllOngoingProjects");
    }

    @Override
    public DashboardProject getDashboardProject(Integer projectId) {
        return null;
    }
}
