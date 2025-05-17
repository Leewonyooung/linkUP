package com.kosta.linkup.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ClientProfile {
    private ClientUserInfo info;
    private ClientUserDetail detail;

}
