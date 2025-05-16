package com.kosta.linkup.dto;

import lombok.*;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class AdminSettleHistorySummary {
    private Integer slistId;
    private Integer projectId;
    private String projectName;
    private String settleDate;
    private Integer cnt;
    private Integer totalAmount;
    private String status;
    private Integer pay;
    private Integer fee;

}
