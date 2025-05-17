package com.kosta.linkup.dto;

import lombok.*;

import java.sql.Date;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ProjectDetail {
    private Integer projectId;
    private String clientId;
    private String advertisementTitle;
    private String projectName;
    private String thumbnail;
    private Integer duration;
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
    private Integer subCategoryId;
    private String subCategoryName;
    private String email;
    private String profileImg;
    private Date startDate;
    private Date endDate;


}
