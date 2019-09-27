package com.itechart.cityguide.repository;

import com.itechart.cityguide.domain.sql.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationRepository extends JpaRepository<Location, Long> {
}
