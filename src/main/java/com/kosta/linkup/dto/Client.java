package com.kosta.linkup.dto;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Client {
    private String clientId;
    private String companyRegNo;
    private String companyName;
    private String companyPhoneNumber;
    private String companyAddress;
    private String companyWebsiteUrl;
    private String companyDescription;
    private String businessType;
    private Date foundedDate;
    private String companyFaxNum;
    private String ceo;

}
