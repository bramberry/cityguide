package com.itechart.cityguide.domain.dto;

import com.itechart.cityguide.domain.sql.GuideEntity;
import lombok.Data;

import java.util.Date;
import java.util.Set;

@Data
public class UserDto {
    private Long id;
    private String username;
    private Date registrationDate;
    private Set<GuideEntity> guide;
}
