package com.kosta.linkup.dto;

import lombok.*;

import java.sql.Date;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class ClientUserInfo {
    private String name;
    private String userId;
    private String email;
    private Date registrationDate;
    private String phoneNumber;
    private String type;

}
