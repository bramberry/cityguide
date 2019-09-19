package com.itechart.cityguide.domain.sql;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.List;
import java.util.Set;

@Data
@Entity
public class GuideEntity {
    @Id
    @GeneratedValue
    private Long id;
    @OneToOne
    @JoinColumn(nullable = false)
    private User author;
    @OneToMany(mappedBy = "entity")
    private List<Step> steps;
    @OneToMany(mappedBy = "entity")
    private Set<User> likes;
    @OneToMany(mappedBy = "entity")
    private Set<User> dislikes;
    @OneToMany(mappedBy = "entity")
    private List<Comment> comments;
    @OneToMany(mappedBy = "entity")
    private Location cityLocation;
}
