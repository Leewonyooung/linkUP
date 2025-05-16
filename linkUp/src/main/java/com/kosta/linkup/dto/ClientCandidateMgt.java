package com.kosta.linkup.dto;

import lombok.*;

import java.sql.Date;

// 레벨 별로 각각 다른 페이지로 넘어가야 하는지? (초급에 대한 지원자, 중급에 대한 지원자)
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ClientCandidateMgt {
    private int projectId; // 프로젝트 아이디
    private String title; // 프로젝트 공고
    private String projectDescription; //프로젝트 공고 내용
    private String regDate; // 프로젝트 등록일
    private String deadlineDate; //프로젝트 지원 마감일
    private String startDate; //프로젝트 시작일
    private String endDate; // 프로젝트 마감일
    private String duration; //프로젝트 진행 개월 수 (기간)
    private String status; //상태 (구인중, 구인완료,.. )
    private String projectProgress; //진행상태 (시작전,진행중, 완료됨)
    private int totalAmount ; //프로젝트 총 단가
    private int applyCount; //지원자 수
    private String skills; //필요 기술
    private String applyPosition; // 지원직무 (초급, 중급, 고급)
    private Integer applyId;
    private String name; // 지원자 이름
    private String freelancerId;
    private Date settleDay;
    // 지원자 직무

    // 경력 몇년 (퇴사 - 종료일) => SUM해서 year로 구하기
    private String careerYear; // 경력년수
    private String joinDate;
    private String resignDate;

    private String star; //평점
    private String applyStatus; //지원상태 (합격, 불합격)
    private String applyDate; //지원일자

    public ClientCandidateMgt(int projectId, String title, String projectDescription, String regDate, String deadlineDate, String startDate, String endDate, String duration, String status, String projectProgress, int totalAmount, int applyCount, String skills, String applyPosition, String name, String careerYear, String joinDate, String resignDate, String star, String applyStatus, String applyDate, String freelancerId) {
        this.projectId = projectId;
        this.title = title;
        this.projectDescription = projectDescription;
        this.regDate = regDate;
        this.deadlineDate = deadlineDate;
        this.startDate = startDate;
        this.endDate = endDate;
        this.duration = duration;
        this.status = status;
        this.projectProgress = projectProgress;
        this.totalAmount = totalAmount;
        this.applyCount = applyCount;
        this.skills = skills;
        this.applyPosition = applyPosition;
        this.name = name;
        this.careerYear = careerYear;
        this.joinDate = joinDate;
        this.resignDate = resignDate;
        this.star = star;
        this.applyStatus = applyStatus;
        this.applyDate = applyDate;
        this.freelancerId = freelancerId;
    }


}
