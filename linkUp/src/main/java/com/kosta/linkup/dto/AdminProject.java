package com.kosta.linkup.dto;

import lombok.*;

/**
 * Project, Settlement 두 테이블의 조인 결과를 담는 DTO<br>
 * 사용되는 페이지 : /admin/client_project_list.jsp<br>
 * 데이터 : <br>
 *     Integer projectId; // 프로젝트 ID<br>
 *     String clientName; // 회사명<br>
 *     String projectName; // 프로젝트 명<br>
 *     String projectDuration; // 프로젝트 기간<br>
 *     String projectManager; // 프로젝트 담당자<br>
 *     String managerPhone; // 담당자 전화번호<br>
 *     Integer totalAmount; // 총 금액<br>
 *     Integer totalFee; // 총 수수료<br>
 *     Integer totalSettlement; // 총 결제 금액<br>
 *     Integer participant; // 참여자 수<br>
 *     Integer settleDate; // 정산일<br>
 *     String settleStatus; // 정산 상태<br>
 */

@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class AdminProject {
    private Integer projectId;        // 프로젝트 ID
    private String clientId;        // 회사 ID
    private String clientName;       // 회사명
    private String projectName;       // 프로젝트 명
    private String projectDuration;   // 프로젝트 기간
    private String projectManager;    // 프로젝트 담당자
    private String managerPhone;      // 담당자 전화번호
    private Integer totalAmount;      // 총 금액
    private Integer totalFee;         // 총 수수료
    private Integer totalSettlement;  // 총 결제 금액
    private Integer participant;      // 참여자 수
    private Integer settleDate;        // 정산일
    private String clientStatus;      // 회사 상태
    private String settleStatus;      // 정산 상태
    private String contractId;     // 계약 ID


    public AdminProject(String contractId, String clientId, String clientName, Integer projectId, String projectName, String projectDuration,
                        String projectManager, String managerPhone,
                        Integer totalAmount, Integer totalFee, Integer totalSettlement,
                        Integer participant, Integer settleDate, String clientStatus, String settleStatus) {
        this.contractId = contractId;
        this.projectId = projectId;
        this.clientId = clientId;
        this.clientName = clientName;
        this.projectName = projectName;
        this.projectDuration = projectDuration;
        this.projectManager = projectManager;
        this.managerPhone = managerPhone;
        this.totalAmount = totalAmount;
        this.totalFee = totalFee;
        this.totalSettlement = totalSettlement;
        this.participant = participant;
        this.settleDate = settleDate;
        this.clientStatus = clientStatus;
        this.settleStatus = settleStatus;
    }



    /**
     * /admin/client_project_list.jsp 페이지에서 사용되는 생성자<br>
     * @param projectName 프로젝트 명
     * @param clientId 회사 ID
     * @param projectDuration 프로젝트 기간
     * @param projectManager 프로젝트 담당자
     * @param managerPhone 담당자 전화번호
     * @param totalAmount 총 금액
     * @param totalFee 총 수수료
     * @param totalSettlement 총 결제 금액
     * @param participant 참여자 수
     * @param settleDate 정산일
     * @param settleStatus 정산 상태
     */
    public AdminProject(String projectName, String clientId, String projectDuration, String projectManager, String managerPhone, Integer totalAmount, Integer totalFee, Integer totalSettlement, Integer participant, Integer settleDate, String settleStatus) {
        this.projectName = projectName;
        this.clientId = clientId;
        this.projectDuration = projectDuration;
        this.projectManager = projectManager;
        this.managerPhone = managerPhone;
        this.totalAmount = totalAmount;
        this.totalFee = totalFee;
        this.totalSettlement = totalSettlement;
        this.participant = participant;
        this.settleDate = settleDate;
        this.settleStatus = settleStatus;
    }


    /**
     * /admin/settlement.jsp 페이지에서 사용되는 생성자<br>
     * @param clientId 회사 ID
     * @param clientName 회사명
     * @param projectId 프로젝트 ID
     * @param projectName 프로젝트 명
     * @param projectDuration 프로젝트 기간
     * @param projectManager 프로젝트 담당자
     * @param managerPhone 담당자 전화번호
     * @param totalAmount 총 금액
     * @param totalFee 총 수수료
     * @param totalSettlement 총 결제 금액
     * @param participant 참여자 수
     * @param settleDate 정산일
     * @param settleStatus 정산 상태
     */
    public AdminProject(String clientId, String clientName, Integer projectId, String projectName, String projectDuration,
                        String projectManager, String managerPhone,
                        Integer totalAmount, Integer totalFee, Integer totalSettlement,
                        Integer participant, Integer settleDate, String settleStatus) {
        this.clientId = clientId;
        this.clientName = clientName;
        this.projectId = projectId;
        this.projectName = projectName;
        this.projectDuration = projectDuration;
        this.projectManager = projectManager;
        this.managerPhone = managerPhone;
        this.totalAmount = totalAmount;
        this.totalFee = totalFee;
        this.totalSettlement = totalSettlement;
        this.participant = participant;
        this.settleDate = settleDate;
        this.settleStatus = settleStatus;
    }

}
