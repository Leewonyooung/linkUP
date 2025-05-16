package com.kosta.linkup.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class Account {
    private Long accountId;
    private Long userId;
    private String bankName;
    private String accountNumber;
    private String holderName;



}
