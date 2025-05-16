package com.kosta.linkup.dto;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class ProjectParticipant {
    private String participantName;
    private String participantRole;
    private String participantEmail;
    private String participantPhone;
}
