package com.kosta.linkup.dto;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class ClientAccountInfo {
    private String clientId; //구인자 ID
    private String bank;     //은행명
    private String accountNo;//계좌번호
    private String holder;   //예금주

}
