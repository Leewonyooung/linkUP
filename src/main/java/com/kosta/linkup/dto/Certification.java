package com.kosta.linkup.dto;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Certification {
    private Long certificationId;
    private Long freelancerId;
    private String name;
    private String organization;
    private String acquiredAt;

}
