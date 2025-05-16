package com.kosta.linkup.dto;

import lombok.*;

import java.sql.Date;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Notice {
    private int noticeId;
    private String title;
    private String content;
    private Date createdAt;

}
