package com.example.linkup.service.admin;

import com.example.linkup.dao.admin.QnaDAO;
import com.example.linkup.dto.QnA;

public class QnaService implements IQnaService {

    private final QnaDAO qnaDAO;

    public QnaService(QnaDAO qnaDAO) {
        this.qnaDAO = qnaDAO;
    }

    @Override
    public void updateAnswer(int qnaId, String answerContent) throws Exception {
        qnaDAO.updateAnswer(qnaId, answerContent);
    }

    @Override
    public QnA selectQnaById(int qnaId) throws Exception {
        return qnaDAO.selectQnaById(qnaId);
    }
}
