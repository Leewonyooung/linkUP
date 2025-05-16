package com.kosta.linkup.service.admin;

import com.kosta.linkup.dao.admin.FreelancerDAO;
import com.kosta.linkup.dao.freelancer.CareerDAO;
import com.kosta.linkup.dto.AdminFreelancer;
import com.kosta.linkup.dto.Career;
import com.kosta.linkup.dto.Freelancer;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FreelancerService implements IFreelancerService {

    private final FreelancerDAO freelancerDAO;
    private final CareerDAO careerDAO;


    @Override
    public List<Freelancer> selectAllFreelancer() throws Exception {
        return freelancerDAO.selectAllFreelancer();
    }

    @Override
    public List<Freelancer> searchFreelancersByKeyword(String keyword) throws Exception {
        return freelancerDAO.searchFreelancersByKeyword(keyword);
    }

    @Override
    public AdminFreelancer selectFreelancerById(String freelancerId) throws Exception {
        return freelancerDAO.selectFreelancerById(freelancerId);
    }

    public List<Career> selectCareerListByFreelancerId(String freelancerId) throws Exception {
        System.out.println("FreelancerId : " + freelancerId);
        List<Career> careerList = careerDAO.selectCareerListByFreelancerId(freelancerId);
        for (Career career : careerList) {
            System.out.println("Career : " + career);
        }
        return careerList;
    }

}
