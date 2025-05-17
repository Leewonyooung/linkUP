package com.kosta.linkup.dto;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class AdminSettleHistory {
    private Integer slistId;             // 정산 리스트 ID
    private Integer projectId;           // 프로젝트 ID
    private Integer cnt;                    // 정산 회차
    private String projectName;         // 프로젝트명
    private String freelancerName;      // 프리랜서 이름
    private String position;            // 직무
    private Integer amount;                 // 정산 금액
    private String account;             // 계좌번호
    private String startDate;           // 정산 시작일
    private String endDate;             // 정산 종료일
    private String settleDate;          // 실제 정산일
    private String status;              // 정산 상태

}
