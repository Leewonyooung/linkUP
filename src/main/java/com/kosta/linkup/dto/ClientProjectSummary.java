package com.kosta.linkup.dto;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ClientProjectSummary {
    private Integer projectId;
    private String projectName;
    private Integer totalAmount;
    private String startDate;
    private String endDate;
    private Integer nextRound;

}
