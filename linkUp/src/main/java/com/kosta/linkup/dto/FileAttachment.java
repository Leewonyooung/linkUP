package com.kosta.linkup.dto;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class FileAttachment {
    private Long fileId;
    private Long relatedId;
    private String fileName;
    private String fileUrl;
    private String uploadedAt;

}
