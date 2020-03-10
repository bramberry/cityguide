package com.romanshulha.cityguide.domain.sql;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Location {
  @Id @GeneratedValue private Long id;
  private Long lon;
  private Long lat;
}
