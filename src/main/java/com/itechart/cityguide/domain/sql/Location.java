package com.itechart.cityguide.domain.sql;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Location {
    @Id
    @GeneratedValue
    private Long id;
    private Long lon;
    private Long lat;
}
