package com.itechart.cityguide.domain.sql;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.List;

@Data
@Entity
public class GuideEntity {
    @Id
    @GeneratedValue
    private Long id;
    @ManyToOne
    @JoinColumn(nullable = false)
    private User author;
    @OneToMany(mappedBy = "guide")
    private List<Step> steps;

    private Long likes;
    @OneToMany(mappedBy = "guide")
    private List<Comment> comments;
    @OneToOne
    @JoinColumn(nullable = false)
    private Location cityLocation;
}
