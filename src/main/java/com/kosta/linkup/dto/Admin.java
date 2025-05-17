package com.kosta.linkup.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class Admin {
    private Long adminId;
    private String loginId;
    private String password;
    private String name;
    private String role;

    public Admin(Long adminId, String loginId, String password, String name, String role) {
        this.adminId = adminId;
        this.loginId = loginId;
        this.password = password;
        this.name = name;
        this.role = role;
    }

}
