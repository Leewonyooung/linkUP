/**
 * FreeLancerController.java
 * GET : 프로젝트나 정산등을 통해 프리랜서의 상세 정보를 렌더링
 */
package com.kosta.linkup.controller.admin;
import com.kosta.linkup.dto.AdminFreelancer;
import com.kosta.linkup.dto.Career;
import com.kosta.linkup.service.admin.IFreelancerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Objects;

@Controller
public class FreeLancerController {

    private final IFreelancerService freelancerService;

    @Autowired
    public FreeLancerController(IFreelancerService freelancerService) {
        this.freelancerService = freelancerService;
    }

    @GetMapping("/admin/freelancer")
    public String showFreelancerDetail(@RequestParam("freelancerid") String freelancerId, Model model) {
        try {
            AdminFreelancer freelancer = freelancerService.selectFreelancerById(freelancerId);
            List<Career> careerList = freelancerService.selectCareerListByFreelancerId(freelancerId);

            for (Career career : careerList) {
                System.out.println("Selected Career: " + career);
            }

            model.addAttribute("freelancer", freelancer);
            model.addAttribute("name", Objects.requireNonNull(freelancer).getName());
            model.addAttribute("careerList", careerList);
        } catch (Exception e) {
            e.printStackTrace();
            model.addAttribute("error", "프리랜서 정보를 불러오는 중 오류 발생");
        }

        return "admin/freelancer_detail"; // => /WEB-INF/views/admin/freelancer_detail.jsp
    }
}
