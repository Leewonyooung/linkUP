package com.kosta.linkup.dto;

import lombok.*;

import java.sql.Date;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ClientApply {
    private Integer applyId;
    private String freelancerId;
    private Integer projectId;
    private Date applyDate;
    private Date cancelDate;
    private Boolean isApproved;
    private Date approvalChangeDate;
    private Integer projectPayId;
    private String subCategoryName;

}
