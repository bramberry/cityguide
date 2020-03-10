package com.romanshulha.cityguide.repository;

import com.romanshulha.cityguide.domain.sql.GuideEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GuideEntityRepository extends JpaRepository<GuideEntity, Long> {}
