package com.romanshulha.cityguide.domain.dto;

import java.util.Date;
import lombok.Data;

@Data
public class UserDto {
  private Long id;
  private String username;
  private String password;
  private Date registrationDate;
}
