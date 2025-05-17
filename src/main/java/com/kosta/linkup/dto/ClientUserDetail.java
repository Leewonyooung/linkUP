package com.kosta.linkup.dto;

import lombok.*;

import java.sql.Date;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ClientUserDetail {
    private String id;
    private String name;               // 회사명
    private String nickname;           // 대표자명
    private String email;              // 대표 이메일
    private Date registrationDate;     // 설립일자
    private String companyDescription; // 업종
    private String companyRegNo;       // 사업자등록번호
    private String businessType;  // 업태
    private String companyAddress;     // 본사 주소
    private String companyPhoneNumber; // 대표 전화번호
    private String companyFaxNum;      // FAX
    private String ceo;
    private String companyWebsiteUrl; // 웹사이트


    public ClientUserDetail(String id, String name, String nickname, String email, Date registrationDate, String companyDescription, String companyRegNo, String businessType, String companyAddress, String companyPhoneNumber, String companyFaxNum, String ceo) {
        this.id = id;
        this.name = name;
        this.nickname = nickname;
        this.email = email;
        this.registrationDate = registrationDate;
        this.companyDescription = companyDescription;
        this.companyRegNo = companyRegNo;
        this.businessType = businessType;
        this.companyAddress = companyAddress;
        this.companyPhoneNumber = companyPhoneNumber;
        this.companyFaxNum = companyFaxNum;
        this.ceo = ceo;
        this.companyWebsiteUrl = companyWebsiteUrl;
    }

}
