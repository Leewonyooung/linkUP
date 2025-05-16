package com.kosta.linkup.dto;

import lombok.*;

import java.sql.Date;
import java.util.Arrays;
import java.util.Map;

@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Portfolio {
    Integer portfolioId;
    String freelancerId;
    String title;
    String thumbnail;
    Date portProjStart;
    Date portProjEnd;
    String teamRole;
    String skillDescription;
    String introduce;
    Integer projectId;
    String attachment;
    String externalUrl;

    boolean isDeleted;
    private String[] skillList;
    private String projectName;
    private String[] attachmentList;
    private String[] externalUrlList;
    Map<Integer, String> projectInfoMap;
    private Date createdDate;

}
