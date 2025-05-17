package com.kosta.linkup.dao.freelancer;

import com.kosta.linkup.dto.Career;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface CareerDAO {
    public List<Career> selectCareerById(String userId) throws Exception;
    public void insertCareer(Career career) throws Exception;
    public void updateCareer(Career career) throws Exception;
    public void deleteCareer(Integer num) throws Exception;
    List<Career> selectCareerListByFreelancerId(String freelancerId) throws Exception;
}
