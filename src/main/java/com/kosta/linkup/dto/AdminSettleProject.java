package com.kosta.linkup.dto;

import lombok.*;

import java.sql.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class AdminSettleProject {
    private String contractId;
    private Integer projectId;
    private String clientId;
    private String companyName;
    private String projectName;
    private String projectDuration;
    private String projectManager;
    private String managerPhone;
    private Integer totalAmount;
    private Integer totalFee;
    private Integer totalSettlement;
    private Integer totalContracts;
    private Integer settledCount;
    private Integer participant;
    private Date settleDay;
    private Integer settleDate;
    private String clientStatus;
    private String settleStatus;

}
