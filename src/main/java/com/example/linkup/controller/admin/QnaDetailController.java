package com.example.linkup.controller.admin;

import com.example.linkup.dto.QnA;
import com.example.linkup.service.admin.IQnaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class QnaDetailController {

    private final IQnaService qnaService;

    @Autowired
    public QnaDetailController(IQnaService qnaService) {
        this.qnaService = qnaService;
    }

    @GetMapping("/admin/qnadetail")
    public String getQnaDetail(@RequestParam("qnaId") int qnaId, Model model) {
        try {
            QnA qna = qnaService.selectQnaById(qnaId);
            model.addAttribute("qna", qna);
            return "admin/qna_detail"; // => /WEB-INF/views/admin/qna_detail.jsp
        } catch (Exception e) {
            e.printStackTrace();
            return "error/500"; // 별도의 오류 페이지를 구성했을 경우
        }
    }
}
