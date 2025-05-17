package com.kosta.linkup.dto;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class SettledInfoDTO {
    private Integer projectId;
    private String freelancerName;
    private String position;
    private int duration;
    private int settleAmount;
    private String status;
    private int cnt; // 회차
    private String startDate; // 근무 시작일
    private String endDate;   // 근무 종료일

}
