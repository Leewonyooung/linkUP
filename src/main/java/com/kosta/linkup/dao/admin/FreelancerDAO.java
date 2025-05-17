package com.kosta.linkup.dao.admin;

import com.kosta.linkup.dto.AdminFreelancer;
import com.kosta.linkup.dto.Freelancer;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface FreelancerDAO {
    List<Freelancer> selectAllFreelancer() throws Exception;
    List<Freelancer> searchFreelancersByKeyword(String keyword) throws Exception;
    AdminFreelancer selectFreelancerById(String freelancerId) throws Exception;
}
