package com.kosta.linkup.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString

public class Academic {
    private String academicType;
    private String academicName;
    private String academicMajor;
    private String entranceDate;
    private String graduateDate;
    private String graduateStatus;

    public Academic(String academicType, String academicName, String academicMajor, String entranceDate, String graduateDate, String graduateStatus) {
        this.academicType = academicType;
        this.academicName = academicName;
        this.academicMajor = academicMajor;
        this.entranceDate = entranceDate;
        this.graduateDate = graduateDate;
        this.graduateStatus = graduateStatus;
    }

}
