package com.kosta.linkup.dto;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class SubCategory {
    int subCategoryId;
    int categoryId;
    String categoryName;
    String subCategoryName;

}
