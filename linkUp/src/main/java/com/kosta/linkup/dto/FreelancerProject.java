package com.kosta.linkup.dto;

import lombok.*;

import java.sql.Date;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class FreelancerProject { //구직자 기준 진행중/완료된 프로젝트
    private Integer projectId;        // 프로젝트 ID
    private String clientName;       // 회사명
    private String projectName;       // 프로젝트 명
    private String projectDuration;   // 프로젝트 기간 DB상으로는 계약시작일~계약종료일
    private String reqSkills;
    private String qualification;
    private String categories;   // 참여하고 있는 카테고리
    private String projectDescription;   // 프로젝트 소개
    private String totalBudget;   // 프로젝트 예산
    private String jobDetails;   // 프로젝트 상세 업무 내용
    private String workingMethod;
    private String workingEnvironment;
    private String workingHours;
    private String projectManager;    // 프로젝트 담당자
    private String managerPhone;      // 담당자 전화번호
    private Date deadlineDate;            // 마감일
    private String dDay;                  // D-Day 계산값 (ex: D-3, D-Day, +2)


}
