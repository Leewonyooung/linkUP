package com.kosta.linkup.dto;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class ClientSettleTarget {
    private String freelancerName;
    private String contractId;
    private String clientStatus;
    private String settlePeriod; // e.g., "2025-03-10 ~ 2025-04-09"
    private Integer pay;

}
