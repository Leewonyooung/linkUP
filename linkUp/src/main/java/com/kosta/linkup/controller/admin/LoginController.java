/**
 * LoginController.java
 * GET : /admin/login admin/login.jsp 렌더링
 * POST : /admin/login 로그인 처리 -- 추후 로그인 처리 로직 추가 --
 */
package com.kosta.linkup.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class LoginController {

    @GetMapping({"/admin/login", "/admin/login/"})
    public String showLoginForm() {
        return "admin/login"; // → /WEB-INF/views/admin/login.jsp
    }

    @PostMapping("/admin/login")
    public String processLogin(HttpServletRequest request) {
        // 로그인 로직은 추후 구현 예정
        // request.setCharacterEncoding("utf-8"); 는 필터로 대체됨
        return "redirect:/admin/dashboard";
    }
}
