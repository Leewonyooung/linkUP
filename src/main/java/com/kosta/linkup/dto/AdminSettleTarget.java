package com.kosta.linkup.dto;

import lombok.*;

import java.sql.Date;

@ToString
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class AdminSettleTarget {
    private String id;       // 계약 ID
    private String freelancerId;     // 프리랜서 ID
    private String freelancerName;   // 프리랜서 이름 (user.name)
    private String categoryName;            // 카테고리명 (pay.category_name)
    private Date startDate;          // 참여 시작일
    private Date endDate;            // 참여 종료일
    private String fphone;           // 전화번호
    private String account;          // 계좌
    private int totalPay;            // 총 지급 금액
    private int fee;
    private Integer settleDay;          // 정산일

}
