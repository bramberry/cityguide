package com.romanshulha.cityguide.domain.sql;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Data
@Entity
public class Comment {
  @Id
  @GeneratedValue
  private Long id;
  private Long userId;
  private String text;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(nullable = false)
  private GuideEntity guide;
}
