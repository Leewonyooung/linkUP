package com.kosta.linkup.dto;

import lombok.*;

import java.sql.Date;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Project {
    private int projectId;
    private String clientId;
    private String advertisementTitle;
    private String companyName;
    private String projectName;
    private String thumbnail;
    int duration;
    private Date createdDate;
    private Date deadlineDate;
    private String projectDescription;
    private String jobDetails;
    private String workingMethod;
    private String workingEnvironment;
    private String workingHours;
    private String qualification;
    private String preferentialConditions;
    private Date settleDay;
    private String manager;
    private String mphone; // 이건 이미 카멜표기법에 맞음
    private int subCategoryId;
    private String subCategoryName;
    private String categoryName;
    private String profileImg;
    private String email;

    private String jobPosition;
    private String reqSkills;
    private String wantedSkills;
    private String memail;
    private Date startDate;
    private Date endDate;


}