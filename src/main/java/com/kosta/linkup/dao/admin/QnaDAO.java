package com.kosta.linkup.dao.admin;

import com.kosta.linkup.dto.QnA;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
@Mapper
public interface QnaDAO {

    List<QnA> selectPagedQna(int offset, int limit, String keyword, String category, String answerStatus, String startDate, String endDate) throws Exception;

    int countQna(String keyword, String category, String answerStatus, String startDate, String endDate) throws Exception;

    void deleteQna(int qnaId);

    QnA selectQnaById(int qnaId) throws Exception;

    void updateAnswer(int qnaId, String answerContent) throws Exception;

    int countAnsweredQna() throws Exception;


}
