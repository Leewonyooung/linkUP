package com.kosta.linkup.dto;

import lombok.*;

import java.sql.Date;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Settlelist {
    int slistId;
    String contractId;
    int projectPayId;
    Integer projectId;
    String clientId;
    String pname;
    int ammount;
    Date settleDate;
    int cnt;

    public Settlelist(String id, int projectPayId, Integer projectId, String clientId, String projectName, int amount, Date date, int cnt) {
        this.contractId = id;
        this.projectPayId = projectPayId;
        this.projectId = projectId;
        this.clientId = clientId;
        this.pname = projectName;
        this.ammount = amount;
        this.settleDate = date;
        this.cnt = cnt;
    }
}
