package com.romanshulha.cityguide.domain.sql;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Data
@Entity
public class Step {
  @Id
  @GeneratedValue
  private Long id;
  private String description;
  @OneToOne
  @JoinColumn
  private Location location;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(nullable = false)
  private GuideEntity guide;
}
