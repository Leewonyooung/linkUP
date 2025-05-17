package com.kosta.linkup.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Amount {
    private Integer amountId;
    private Integer projectId;
    private Integer total;
    private Integer fee;

}
