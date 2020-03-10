package com.romanshulha.cityguide.domain.sql;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import lombok.Data;

@Data
@Entity
public class GuideEntity {
  @Id @GeneratedValue private Long id;

  private Long authorId;

  @OneToMany(mappedBy = "guide")
  private List<Step> steps;

  private Long likes;

  @OneToMany(mappedBy = "guide")
  private List<Comment> comments;

  @OneToOne
  @JoinColumn(nullable = false)
  private Location cityLocation;
}
