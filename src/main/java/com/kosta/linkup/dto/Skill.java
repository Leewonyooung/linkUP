package com.kosta.linkup.dto;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Skill {
    private Long skillId;
    private Long freelancerId;
    private String name;
    private int level;

}
