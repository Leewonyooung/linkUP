package com.kosta.linkup.dto;

import lombok.*;

import java.util.Date;

@Getter
@ToString
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Settlement {
    private int settlementId;
    private int slistId;
    private int categoryId;
    private String clientId;
    private String pname;
    private int ammount;
    private Date startDate;
    private Date endDate;
    private Date settleday;
    private String position;
    private String name;
    private String status;
    private String account;

    public Settlement( int slistId, int categoryId, String clientId, String pname, int ammount, Date startDate, Date endDate, Date settleday, String position, String name, String status, String account) {
        this.slistId = slistId;
        this.categoryId = categoryId;
        this.clientId = clientId;
        this.pname = pname;
        this.ammount = ammount;
        this.startDate = startDate;
        this.endDate = endDate;
        this.settleday = settleday;
        this.position = position;
        this.name = name;
        this.status = status;
        this.account = account;
    }
}
