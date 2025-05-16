package com.kosta.linkup.dto;

import lombok.*;

import java.sql.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class AdminProjectDetail {
    private Integer projectId;
    private String projectName;
    private String projectDescription;
    private Date createdDate;
    private Date deadlineDate;

    private String manager;
    private String memail;
    private String mphone;
    private String clientName;

    private List<ProjectParticipant> participants;

}
