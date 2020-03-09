package com.romanshulha.cityguide.domain.dto;

import lombok.Data;

import java.util.Date;

@Data
public class UserDto {
  private Long id;
  private String username;
  private String password;
  private Date registrationDate;
}
