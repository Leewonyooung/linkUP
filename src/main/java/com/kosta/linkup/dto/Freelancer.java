package com.kosta.linkup.dto;

import lombok.*;

import java.sql.Date;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Freelancer {
    String freelancerId;
    String name;
    String nickname;
    String email;
    String password;
    String phoneNum;
    String profileImg;
    boolean acceptNoti;
    String token;
    Date registrationDate;
    Date withdrawalDate;
    boolean acceptConsent;
    private int subCategoryId;
    private String subCategoryName;
    private int categoryId;
    private String categoryName;
    private double avgStar; //  평균 별점

    // User Type 04.18 15:02 추가
    String type;
    String category;
    String skill;
    String[] skillList;
    String address;
    List<Academic> academicList;
    String academic;
    String introduction;
    List<License> licenseList;
    String license;
    String bank;
    String accountNum;
    boolean isNegotiable;
    boolean isResident;
    Integer desiredSalary;
    String desiredLocation;
    String otherRequest;
    String attachment;
    String externalUrl;
    List<String> externalUrlList;
    List<String> attachmentList;

    List<Portfolio> portfolioInfoList;
    double averageScore; //평점
    int projectCount; //프로젝트 수


}
