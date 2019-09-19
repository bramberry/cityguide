package com.itechart.cityguide.domain.sql;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@Data
@Entity
public class User {
    @Id
    @GeneratedValue
    private Long id;

    @Column(unique = true)
    private String username;

    @Temporal(value = TemporalType.DATE)
    @Column(updatable = false)
    @CreationTimestamp
    private Date registrationDate;

    @ManyToOne(fetch = FetchType.LAZY)
    private GuideEntity guide;
}
