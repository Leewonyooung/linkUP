package com.kosta.linkup.dto;

import lombok.*;

import java.sql.Date;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class DashboardProject {
    private int projectId;
    private String projectName;
    private Integer totalPay;
    private Date createdDate;
    private String projectStatus;
    private String manager;
    private Date applyDate;
    private boolean isApproved;


}
