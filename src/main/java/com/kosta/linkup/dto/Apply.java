package com.kosta.linkup.dto;
import lombok.*;

import java.time.LocalDate;
import java.util.Date;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Apply {
    private Integer applyId;
    private String freelancerId;
    private Date applyDate;
    private Date cancelDate;
    private boolean isApproved; // 승인여부
    String approved;
    private String category; // 카테고리 이름
    private String applyCategory; // 카테고리 이름
    private Integer projectId;                  // 프로젝트 ID
    private String advertisementTitle;          // 공고 제목
    private String projectName;                 // 프로젝트명
    private String projectFee;                 // 프로젝트명
    private String duration;                    // 기간
    private Date deadlineDate;                  // 마감일
    private String companyName;                 // 회사명
    private String workingMethod;               // 근무 방식
    private String projectDescription;          // 프로젝트 설명
    private String jobDetails;                  // 업무 상세
    private String workingEnvironment;          // 근무 환경
    private String applyStatus; // 지원상태
    private String dDay;                        // 마감일 기준 D-Day 텍스트 (D-3, D-Day, 마감 등)
    private Integer projectPayId;
    private String subCategoryName;


}