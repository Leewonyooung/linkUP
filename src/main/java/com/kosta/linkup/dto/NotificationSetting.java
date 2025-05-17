package com.kosta.linkup.dto;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class NotificationSetting {
    private Long settingId;
    private Long userId;
    private Boolean allowEmail;
    private Boolean allowSMS;
    private Boolean allowPush;

}
