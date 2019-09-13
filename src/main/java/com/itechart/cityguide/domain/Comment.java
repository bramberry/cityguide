package com.itechart.cityguide.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Comment {
    @Id
    private Long id;
    private User user;
    private String comment;
}
