package com.kosta.linkup.dto;

import lombok.*;

import java.sql.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class License {
    private String licenseName;
    private String licenseAgency;
    private Date licenseDate;
    private String licenseGrade;
}
