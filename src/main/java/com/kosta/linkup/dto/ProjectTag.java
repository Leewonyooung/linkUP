package com.kosta.linkup.dto;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class ProjectTag {
    private Long projectTagId;
    private Long projectId;
    private Long tagId;

}
