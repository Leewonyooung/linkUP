package com.kosta.linkup.dto;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class RecruiterProfile {
    private Long profileId;
    private Long userId;
    private String companyName;
    private String companyNumber;
    private String introduction;
    private String createdAt;
    private String updatedAt;

}
