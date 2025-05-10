package com.example.linkup.dao.admin;

import com.example.linkup.dto.AdminFreelancer;
import com.example.linkup.dto.Freelancer;
import org.apache.ibatis.session.SqlSession;
import com.example.linkup.util.MybatisSqlSessionFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class FreelancerDAO implements IFreelancerDAO{
    SqlSession sqlSession = MybatisSqlSessionFactory.getSqlSessionFactory().openSession();

    @Override
    public List<Freelancer> selectAllFreelancer() throws Exception {
        return sqlSession.selectList("mapper.afreelancer.selectAllFreelancer");
    }

    @Override
    public AdminFreelancer selectFreelancerById(String freelancerId) throws Exception {
        return sqlSession.selectOne("mapper.afreelancer.selectFreelancerById", freelancerId);
    }

    @Override
    public List<Freelancer> searchFreelancersByKeyword(String keyword) throws Exception {
        return sqlSession.selectList("mapper.afreelancer.searchFreelancersByKeyword", "%"+keyword+"%");
    }
}
