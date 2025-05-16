package com.kosta.linkup.dto;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Pay {
    private int projectFeeId;
    private int projectId;
    private int lvId;
    private Integer subCategoryId;
    private String categoryName;
    private int projectFee;
    private Integer pay; // 금액 4/18 추가
    private int fee; // 수수료 금액의 0.3% 추가
    private String work;  // 담당 업무
    private int people;   // 모집 인원

}
