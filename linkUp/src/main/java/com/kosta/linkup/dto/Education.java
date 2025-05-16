package com.kosta.linkup.dto;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Education {
    private Long educationId;
    private Long freelancerId;
    private String school;
    private String major;
    private String degree;
    private String startDate;
    private String endDate;

}
