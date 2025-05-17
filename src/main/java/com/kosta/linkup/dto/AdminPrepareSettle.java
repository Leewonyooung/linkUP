package com.kosta.linkup.dto;

import lombok.*;

import java.sql.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class AdminPrepareSettle {
    private String id;
    private String clientId;
    private String position;
    private String name;
    private Date settleDay;
    private Date startDate;
    private Date endDate;

}
