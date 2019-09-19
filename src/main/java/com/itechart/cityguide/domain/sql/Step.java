package com.itechart.cityguide.domain.sql;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Step {
    @Id
    @GeneratedValue
    private Long id;
    private String description;
    private Location location;
}
