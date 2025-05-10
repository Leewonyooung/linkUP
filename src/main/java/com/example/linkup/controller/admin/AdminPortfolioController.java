package com.example.linkup.controller.admin;

import com.example.linkup.dto.Portfolio;
import com.example.linkup.service.freelancer.IPortfolioService;
import com.example.linkup.util.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class AdminPortfolioController {

    private final IPortfolioService portfolioService;

    @Autowired
    public AdminPortfolioController(IPortfolioService portfolioService) {
        this.portfolioService = portfolioService;
    }

    @GetMapping("/admin/portfolio")
    public String showPortfolioList(@RequestParam("freelancerid") String freelancerId,
                                    @RequestParam(value = "page", required = false, defaultValue = "1") Integer page,
                                    Model model) {
        PageInfo pageInfo = new PageInfo(page);
        try {
            Integer portfolioCnt = portfolioService.selectPortfolioCnt(freelancerId);
            if (portfolioCnt > 0) {
                List<Portfolio> portfolioList = portfolioService.selectPortfolioListByPage(pageInfo, freelancerId);
                model.addAttribute("pageInfo", pageInfo);
                model.addAttribute("portfolioList", portfolioList);
            } else {
                model.addAttribute("portfolioList", null);
            }
        } catch (Exception e) {
            e.printStackTrace();
            model.addAttribute("err", "포트폴리오 목록 조회를 실패했습니다.");
        }
        return "admin/portfolio_list"; // -> /WEB-INF/views/admin/portfolio_list.jsp
    }
}
