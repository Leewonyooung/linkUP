package com.kosta.linkup.controller.admin;
import com.kosta.linkup.dto.QnA;
import com.kosta.linkup.service.admin.IQnaService;
import com.kosta.linkup.util.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class QnaController {

    private final IQnaService qnaService;

    @Autowired
    public QnaController(IQnaService QnaService) {
        this.qnaService = QnaService;
    }

    @GetMapping("/admin/qna")
    public String qnaList(
            @RequestParam(value = "keyword", required = false) String keyword,
            @RequestParam(value = "category", required = false) String category,
            @RequestParam(value = "answerStatus", required = false) String answerStatus,
            @RequestParam(value = "startDate", required = false) String startDate,
            @RequestParam(value = "endDate", required = false) String endDate,
            @RequestParam(value = "page", required = false, defaultValue = "1") int curPage,
            Model model
    ) {
        try {
            // 빈 값 처리
            keyword = isEmpty(keyword) ? null : keyword;
            category = isEmpty(category) ? null : category;
            answerStatus = isEmpty(answerStatus) ? null : answerStatus;
            startDate = isEmpty(startDate) ? null : startDate;
            endDate = isEmpty(endDate) ? null : endDate;

            int perPage = 8;
            int offset = (curPage - 1) * perPage;

            List<QnA> qnaList = qnaService.selectPagedQna(offset, perPage, keyword, category, answerStatus, startDate, endDate);
            int totalCount = qnaService.countQna(keyword, category, answerStatus, startDate, endDate);
            int answeredTotalCount = qnaService.countAnsweredQna();

            PageInfo pageInfo = new PageInfo(curPage);
            int allPage = (int) Math.ceil((double) totalCount / perPage);
            int startPage = Math.max(1, curPage - 2);
            int endPage = Math.min(allPage, startPage + 4);

            pageInfo.setAllPage(allPage);
            pageInfo.setStartPage(startPage);
            pageInfo.setEndPage(endPage);

            model.addAttribute("qnaList", qnaList);
            model.addAttribute("totalCount", totalCount);
            model.addAttribute("answeredTotalCount", answeredTotalCount);
            model.addAttribute("pageInfo", pageInfo);

            return "admin/qna_manage"; // /WEB-INF/views/admin/qna_manage.jsp
        } catch (Exception e) {
            e.printStackTrace();
            return "error/500"; // 별도의 에러 페이지가 있다면
        }
    }

    private boolean isEmpty(String str) {
        return (str == null || str.trim().isEmpty());
    }
}
