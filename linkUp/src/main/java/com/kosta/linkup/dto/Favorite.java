package com.kosta.linkup.dto;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Favorite {
    private Long favoriteId;
    private Long userId;
    private Long targetUserId;
    private String createdAt;

}
