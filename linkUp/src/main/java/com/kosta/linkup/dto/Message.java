package com.kosta.linkup.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Message {
    private Long messageId;
    private Long senderId;
    private Long receiverId;
    private String content;
    private String sentAt;

}