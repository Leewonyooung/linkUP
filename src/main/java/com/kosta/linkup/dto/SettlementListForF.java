package com.kosta.linkup.dto;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class SettlementListForF {
    Integer settlementId;
    private String status;      // 정산 상태 (0: 대기중, 1: 완료 등)
    private Integer ammount;     // 회차별 금액 (주의: 오타 그대로 반영)
    private String settleDate;   // 정산일
    private Integer projectId;   // 프로젝트 ID
    private String projectName;  // 프로젝트 이름

}