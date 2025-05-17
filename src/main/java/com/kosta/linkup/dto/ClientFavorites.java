package com.kosta.linkup.dto;

import lombok.*;

import java.util.List;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class ClientFavorites {
    private int jjimId;
    private String clientId;
    private String freelancerId;

    // 구인자 (찜한 구인자) 구현을 위해 freelancer 테이블에서 받아와야 할 컬럼명 아래 추가
    private String profileImage;
    private String name;
    private String job;
    private String location;
    private double rating;
    private int projectCount;
    private List<String> tags; //skill split


}
