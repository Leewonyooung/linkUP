package com.example.linkup.service.admin;

import com.example.linkup.dao.admin.QnaDAO;
import com.example.linkup.dto.QnA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QnaService implements IQnaService {

    private final QnaDAO qnaDAO;

    @Autowired
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

    @Override
    public List<QnA> selectPagedQna(int offset, int limit, String keyword, String category, String answerStatus, String startDate, String endDate) throws Exception {
        return qnaDAO.selectPagedQna(offset, limit, keyword, category, answerStatus, startDate, endDate);
    }

    @Override
    public int countQna(String keyword, String category, String answerStatus, String startDate, String endDate) throws Exception {
        return qnaDAO.countQna(keyword, category, answerStatus, startDate, endDate);
    }

    @Override
    public int countAnsweredQna() throws Exception {
        return qnaDAO.countAnsweredQna();
    }

}
