package com.kosta.linkup.dto;

import lombok.*;

import java.sql.Date;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class User {
    String userId;
    String name;
    String nickname;
    String email;
    String password;
    String phoneNum;
    String profileImg;
    Date registrationDate;
    Date withdrawalDate;
    String snsType;

}
