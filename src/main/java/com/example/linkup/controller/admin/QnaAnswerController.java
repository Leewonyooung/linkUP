package com.example.linkup.controller.admin;

import com.example.linkup.service.admin.IQnaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletResponse;

@Controller
public class QnaAnswerController {

    private final IQnaService qnaService;

    @Autowired
    public QnaAnswerController(IQnaService qnaService) {
        this.qnaService = qnaService;
    }

    @PostMapping("/admin/qna-answer")
    public String postAnswer(
            @RequestParam("qnaId") int qnaId,
            @RequestParam("answerContent") String answerContent,
            HttpServletResponse response
    ) {
        try {
            qnaService.updateAnswer(qnaId, answerContent);
            return "redirect:/admin/qna";
        } catch (Exception e) {
            e.printStackTrace();
            response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
            return "error/500"; // 또는 별도 에러 페이지
        }
    }
}
