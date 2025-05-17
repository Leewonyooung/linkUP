package com.kosta.linkup.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Experience {
    private Long experienceId;
    private Long freelancerId;
    private String company;
    private String role;
    private String startDate;
    private String endDate;

}
