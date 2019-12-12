package com.itechart.cityguide.domain.sql;

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
public class Comment {
    @Id
    @GeneratedValue
    private Long id;
    @OneToOne
    @JoinColumn
    private User user;
    private String text;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(nullable = false)
    private GuideEntity guide;
}
