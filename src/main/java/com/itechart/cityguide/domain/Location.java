package com.itechart.cityguide.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Location {
    @Id
    private Long id;
    private Long lon;
    private Long lat;
}
