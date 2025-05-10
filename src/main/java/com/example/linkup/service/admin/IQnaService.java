package com.example.linkup.service.admin;

import com.example.linkup.dto.QnA;

public interface IQnaService {
    /**
     * 답변 등록
     * @param qnaId
     * @param answerContent
     * @throws Exception
     */
    void updateAnswer(int qnaId, String answerContent) throws Exception;

    QnA selectQnaById(int qnaId) throws Exception;
}
