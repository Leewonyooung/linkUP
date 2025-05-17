package com.kosta.linkup.dto;

import lombok.*;

import java.sql.Date;

@Getter
@ToString
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class News {
    private int newsId;
    private String title;
    private String content;
    private Date createdAt;

}
