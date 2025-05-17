package com.kosta.linkup.dto;

import lombok.*;

import java.sql.Date;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Career {
    private String freelancerId;
    private String companyName; // 회사명
    private String departmentName; // 부서명
    private String position; // 직급/직책
    private String jobTitle; // 직무
    private String jobDescription; // 담당업무
    private Integer salary;// 연봉
    private Date joinDate; // 입사일
    private Date resignDate; // 퇴사일

}
