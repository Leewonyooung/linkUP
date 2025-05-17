package com.kosta.linkup.service.admin;

import com.kosta.linkup.dto.QnA;

import java.util.List;

public interface IQnaService {
    /**
     * 답변 등록
     * @param qnaId
     * @param answerContent
     * @throws Exception
     */
    void updateAnswer(int qnaId, String answerContent) throws Exception;

    QnA selectQnaById(int qnaId) throws Exception;

    List<QnA> selectPagedQna(int offset, int limit, String keyword, String category, String answerStatus, String startDate, String endDate) throws Exception;
    int countQna(String keyword, String category, String answerStatus, String startDate, String endDate) throws Exception;
    int countAnsweredQna() throws Exception;
}
