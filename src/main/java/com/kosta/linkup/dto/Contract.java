package com.kosta.linkup.dto;

import lombok.*;

import java.sql.Date;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Contract {
    private String id;
    private int applyId;
    private int projectPayId;
    private int projectId;
    private String freelancerId;
    private String clientId;
    private Date settleDay;
    private Date startDate;
    private Date endDate;
    private String pname;
    private Integer pay; // 금액 4/18 14:44 추가
    private int fee; // 수수료 금액의 0.3% 14:44 추가
    private String pmanager;
    private int totalPay;
    private String clientStatus;
    private String status;
    private String fphone;
    private String account;


}
