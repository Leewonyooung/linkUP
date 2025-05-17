package com.kosta.linkup.dto;

import lombok.*;

import java.sql.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class JjimProj {
    private Integer jjimId;                     // 찜 ID
    private Integer projectId;                  // 프로젝트 ID
    private String category;                    // 카테고리
    private String advertisementTitle;          // 공고 제목
    private String projectName;                 // 프로젝트명
    private String duration;                    // 기간
    private Date deadlineDate;                  // 마감일
    private String companyName;                 // 회사명
    private String qualification;               // 자격 요건
    private String workingMethod;               // 근무 방식
    private String preferentialConditions;      // 우대 조건
    private String projectDescription;          // 프로젝트 설명
    private String jobDetails;                  // 업무 상세
    private String workingEnvironment;          // 근무 환경
    private String workingHours;                // 근무 시간
    private String dDay;                        // 마감일 기준 D-Day 텍스트 (D-3, D-Day, 마감 등)

}