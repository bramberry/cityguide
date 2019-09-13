package com.itechart.cityguide.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;

@Data
@Entity
public class Step {
    @Id
    private Long id;
    private String description;
    private List<String> pictures;
    private Location location;
}
