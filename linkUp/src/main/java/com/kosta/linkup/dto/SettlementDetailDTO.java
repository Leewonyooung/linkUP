package com.kosta.linkup.dto;

import lombok.*;

import java.sql.Date;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class SettlementDetailDTO {
    private Integer cnt;
    private Integer settleAmmount;
    private String status;
    private Date settleDate;

}
