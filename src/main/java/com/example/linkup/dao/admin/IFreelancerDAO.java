package com.example.linkup.dao.admin;

import com.example.linkup.dto.AdminFreelancer;
import com.example.linkup.dto.Freelancer;

import java.util.List;

public interface IFreelancerDAO {
    List<Freelancer> selectAllFreelancer() throws Exception;
    List<Freelancer> searchFreelancersByKeyword(String keyword) throws Exception;
    AdminFreelancer selectFreelancerById(String freelancerId) throws Exception;
}
