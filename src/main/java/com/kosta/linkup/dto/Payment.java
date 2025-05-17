package com.kosta.linkup.dto;

import lombok.*;

@ToString
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Payment {
        private Long paymentId;
        private Long contractId;
        private String paymentStatus;
        private String paymentDate;
        private Integer amount;
        private String createdAt;
        private String updatedAt;

}



