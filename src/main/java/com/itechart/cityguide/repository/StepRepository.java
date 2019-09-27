package com.itechart.cityguide.repository;

import com.itechart.cityguide.domain.sql.Step;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StepRepository extends JpaRepository<Step, Long> {
}
