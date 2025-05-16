package com.kosta.linkup.dto;

import lombok.*;

import java.util.List;

// 구인자 - 내 프로젝트 조회/관리
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class ProjectMgt {
    private int projectId; // 프로젝트 아이디
    private String title; // 구인공고
    private String category; // 카테고리
    private String skills; // 필요 기술
    private String status; //상태
    private String regDate; //프로젝트 등록일
    private String startDate; //프로젝트 시작일
    private String deadlineDate;
    private String endDate; // 프로젝트 끝나는 날
    private int duration; //프로젝트 진행 개월 수
    private int totalAmount; // 프로젝트 총 단가
    private int applyCount; //지원자 수
    //서블릿에서 직접 계산
    private String projectProgress;  // "시작전", "진행중", "종료됨"
    private String settleStatus;     // "진행중", "완료"

    private List<ProjectPay> payList; // ProjectPay DTO 불러오기

}
