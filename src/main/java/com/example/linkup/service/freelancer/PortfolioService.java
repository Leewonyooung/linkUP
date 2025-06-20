package com.example.linkup.service.freelancer;
import java.util.*;

import com.example.linkup.dao.freelancer.IPortfolioDAO;
import com.example.linkup.dto.Portfolio;
import com.example.linkup.util.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PortfolioService implements IPortfolioService{
    private static IPortfolioDAO iportfolioDAO;

    @Autowired
    public PortfolioService(IPortfolioDAO portfolioDAO) {
        iportfolioDAO = portfolioDAO;
    }

    @Override
    public Integer selectPortfolioCnt(String userId) {
        return iportfolioDAO.selectPortfolioCnt(userId);
    }

    @Override
    public List<Portfolio> selectPortfolioListByPage(PageInfo pageInfo, String userId) throws Exception {
        Integer portfolioCnt = iportfolioDAO.selectPortfolioCnt(userId);
        System.out.println("PortfolioService.java 26 portfolioCnt "+portfolioCnt);
        if(portfolioCnt == null || portfolioCnt == 0) {
            return null;
        }
        Integer allPage = (int)Math.ceil((double)portfolioCnt/10);
        Integer startPage = (pageInfo.getCurPage()-1)/10*10+1;
        Integer endPage = startPage+10-1; //10,20,30,40...
        if(endPage>allPage) endPage=allPage;

        pageInfo.setAllPage(allPage);
        pageInfo.setStartPage(startPage);
        pageInfo.setEndPage(endPage);

        Integer row = (pageInfo.getCurPage()-1)*10+1;

        List<Portfolio> portfolioList = iportfolioDAO.selectPortfolioListByPage(row-1, userId);
        if(portfolioList == null || portfolioList.isEmpty()) {
            System.out.println(" PortfolioService.java 포트폴리오가 없습니다.");
            return null;
        }

        List<Portfolio> portfolioList2 = new ArrayList<>();

        for (Portfolio p : portfolioList) {
            System.out.println(p.toString());
            Portfolio portfolio = new Portfolio();
            portfolio.setPortfolioId(p.getPortfolioId());
            portfolio.setTitle(p.getTitle());
            portfolio.setThumbnail(p.getThumbnail());
            portfolio.setIntroduce(p.getIntroduce());

            // 스킬 분리 처리 (null check 필수)
            if(p.getSkillDescription() != null){
                if (p.getSkillDescription().contains("^")) {
                    String[] skills = p.getSkillDescription().split("\\^");
                    portfolio.setSkillList(skills);
                } else {
                    portfolio.setSkillList(new String[]{ p.getSkillDescription() }); // 단일 스킬일 경우
                }
            } else {
                portfolio.setSkillList(null);
            }
            portfolio.setCreatedDate(p.getCreatedDate());
//            portfolio.setTempSaved(p.getIsTempSaved());
            portfolioList2.add(portfolio);
        }

        return portfolioList2;
    }

    @Override
    public Portfolio selectPortfolioById(Integer portfoId) throws Exception {
//        Portfolio tempportfolio = iportfolioDAO.selectPortfolioById(portfoId);
//        Portfolio portfolio = new Portfolio();
        Portfolio portfolio = iportfolioDAO.selectPortfolioListById(portfoId);
        if(portfolio == null) {
            System.out.println("PortfolioService.java 83 포트폴리오가 없습니다.");
            return null;
        } else {
            if(portfolio.getSkillDescription() != null) {
                portfolio.setSkillList(portfolio.getSkillDescription().split("\\^"));
            }
            if(portfolio.getAttachment() != null) {
                portfolio.setAttachmentList(portfolio.getAttachment().split("\\^"));
            }
            if(portfolio.getExternalUrl() != null) {
                portfolio.setExternalUrlList(portfolio.getExternalUrl().split("\\^"));
            }
        }
        return portfolio;
    }
    @Override
    public Map<Integer, String> projectInfoForPortfolio(String userId) {
        try {
            return iportfolioDAO.projectInfoForPortfolio(userId);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void deletePortfolio(Integer num) throws Exception {
        iportfolioDAO.deletePortfolio(num);
    }

    @Override
    public Integer writePortfolio(Portfolio portfolio) throws Exception {
        return iportfolioDAO.writePortfolio(portfolio);
    }

    @Override
    public void modifyPortfolio(Portfolio portfolio) throws Exception {
        Portfolio p = selectPortfolioById(portfolio.getPortfolioId());
        if(portfolio.getAttachment()!= null && !portfolio.getAttachment().equals(p.getAttachment())) {
            portfolio.setAttachment(p.getAttachment());
        }
        if(portfolio.getThumbnail()!= null && !portfolio.getThumbnail().equals(p.getThumbnail())) {
            portfolio.setThumbnail(p.getThumbnail());
        } else if(portfolio.getThumbnail() == null) {
            portfolio.setThumbnail(null);
        } else {
            portfolio.setThumbnail(p.getThumbnail());
        }
        if(portfolio.getProjectId() != null && !portfolio.getProjectId().equals(p.getProjectId())) {
            portfolio.setProjectId(p.getProjectId());
        } else if(portfolio.getProjectId() == null) {
            portfolio.setProjectId(null);
        } else {
            portfolio.setProjectId(p.getProjectId());
        }
        iportfolioDAO.modifyPortfolio(portfolio);
    }
    public boolean isPortfolioOwner (String userId, Integer portfolioId) throws Exception {
        return iportfolioDAO.isPortfolioOwner(userId, portfolioId);
    }
}
