package com.example.linkup.controller.admin;

import com.example.linkup.dao.admin.QnaDAO;
import com.example.linkup.dto.QnA;
import com.example.linkup.service.admin.IQnaService;
import com.example.linkup.service.admin.QnaService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet("/admin/qnadetail")
public class QnaDetailController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public QnaDetailController() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int qnaId = Integer.parseInt(request.getParameter("qnaId"));
        QnaDAO dao = new QnaDAO();
        IQnaService qnaService = new QnaService(dao);
        QnA qna = null;
        try {
            qna = qnaService.selectQnaById(qnaId);
        } catch (Exception e) {
            e.printStackTrace();
        }
        request.setAttribute("qna", qna);
        request.getRequestDispatcher("/admin/qna_detail.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
