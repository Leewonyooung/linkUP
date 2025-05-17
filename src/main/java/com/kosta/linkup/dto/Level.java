package com.kosta.linkup.dto;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Level {
    private int levelId;
    private String level;
    private int startMonth;
    private int endMonth;

}
