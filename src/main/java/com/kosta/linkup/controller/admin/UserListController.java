/**
 * UserListController.java
 * LinkUP 사용자들의 목록 조회를 담당하는 서블릿
 * GET :
 *      1-1. keyword Parameter를 통해 검색인지 아닌지 구분
 *      1-2. usertype Parameter를 통해 사용자 유형을 구분
 *      2-1. usertype이 null 또는 비어있으면 전체 조회
 *      2-2. usertype이 freelancer이면 프리랜서 목록 조회
 *      2-3. usertype이 client이면 클라이언트 목록 조회
 */
package com.kosta.linkup.controller.admin;

import com.kosta.linkup.dto.ClientUserInfo;
import com.kosta.linkup.dto.Freelancer;
import com.kosta.linkup.service.admin.IClientService;
import com.kosta.linkup.service.admin.IFreelancerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequiredArgsConstructor
public class UserListController {

    private final IClientService clientService;
    private final IFreelancerService freelancerService;

    @GetMapping("/admin/users")
    public String getUserList(
            @RequestParam(value = "keyword", required = false) String keyword,
            @RequestParam(value = "usertype", required = false) String userType,
            Model model
    ) {
        List<Freelancer> freelancerList = new ArrayList<>();
        List<ClientUserInfo> clientList = new ArrayList<>();

        try {
            boolean hasKeyword = keyword != null && !keyword.trim().isEmpty();

            if (hasKeyword) {
                if (userType == null || userType.trim().isEmpty() || "all".equals(userType)) {
                    freelancerList = freelancerService.searchFreelancersByKeyword(keyword);
                    clientList = clientService.selectClientsByKeyword(keyword);
                } else if ("freelancer".equals(userType)) {
                    freelancerList = freelancerService.searchFreelancersByKeyword(keyword);
                } else if ("client".equals(userType)) {
                    clientList = clientService.selectClientsByKeyword(keyword);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        model.addAttribute("freelancerList", freelancerList);
        model.addAttribute("clientList", clientList);
        model.addAttribute("paramKeyword", keyword);
        model.addAttribute("paramUsertype", userType);

        return "admin/user_info"; // => /WEB-INF/views/admin/user_info.jsp
    }
}
