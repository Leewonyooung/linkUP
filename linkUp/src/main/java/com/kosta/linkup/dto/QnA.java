package com.kosta.linkup.dto;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor

public class QnA {
    int qnaId;
    String userId;
    String questionTitle;
    String questionContent;
    Date questionDate;
    String answerContent;
    Date answerDate;

}

