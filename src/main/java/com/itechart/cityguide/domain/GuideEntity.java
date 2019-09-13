package com.itechart.cityguide.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;
import java.util.Set;

@Data
@Entity
public class GuideEntity {
    @Id
    private Long id;
    private List<Step> steps;
    private User author;
    private Set<User> likes;
    private Set<User> dislikes;
    private List<Comment> comments;
    private List<Location> countryLocation;
}
