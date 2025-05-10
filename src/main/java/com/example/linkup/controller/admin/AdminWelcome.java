/**
 * AdminWelcome.java
 * http://localhost:8080/linkup/admin 들어오면 관리자 페이지로 연결
 */

package com.example.linkup.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
public class AdminWelcome {

    @RequestMapping(value = {"/admin"}, method= RequestMethod.GET)
    public String login(HttpServletRequest request) {
        System.out.println("✅ 요청 URI: " + request.getRequestURI());
        return "admin/login";
    }

    @RequestMapping("/admin")
    public String loginRedirect() {
        return "redirect:/admin/";
    }

}
