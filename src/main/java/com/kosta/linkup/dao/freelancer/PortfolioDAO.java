package com.kosta.linkup.dao.freelancer;
import com.kosta.linkup.dto.Portfolio;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Mapper
@Repository
public interface PortfolioDAO {
    public Integer selectPortfolioCnt(String userId);
    public List<Portfolio> selectPortfolioListByPage(Integer row, String userId) throws Exception;
    public Portfolio selectPortfolioListById(Integer portfoId) throws Exception;
    public void deletePortfolio(Integer num) throws Exception;
    public Map<Integer, String> projectInfoForPortfolio(String userId) throws Exception;
    public Integer writePortfolio(Portfolio portfolio) throws Exception;
    public void modifyPortfolio(Portfolio portfolio) throws Exception;
    public boolean isPortfolioOwner (String userId, Integer portfolioId) throws Exception;
}