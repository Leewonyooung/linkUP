package com.kosta.linkup.dto;

import lombok.*;

import java.sql.Date;
import java.util.List;
import java.util.Map;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class AdminFreelancer {
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

    // User Type 04.18 15:02 추가
    String type;
    String category;
    String[] categoryList;
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
    int desiredSalary;
    String desiredLocation;
    String otherRequests;
    String attachment;
    String externalUrl;

    Map<Integer, String> portfolioInfoMap;
    double averageScore; //평점
    int projectCount; //프로젝트 수


}
