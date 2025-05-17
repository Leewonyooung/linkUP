package com.kosta.linkup.dto;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class PrepareSettleJson {
    private String id;         // 계약 ID
    private String fid;        // 프리랜서 ID
    private String name;       // 프리랜서 이름
    private String category;   // 구분 (예: 백엔드, 프론트엔드 등)
    private int amount;        // 정산 금액
    private String settleDate;
    private String account; // 정산일
    private String start;      // 정산 시작일
    private String end;        // 정산 종료일

}
