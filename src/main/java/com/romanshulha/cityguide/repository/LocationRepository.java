package com.romanshulha.cityguide.repository;

import com.romanshulha.cityguide.domain.sql.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationRepository extends JpaRepository<Location, Long> {
}
