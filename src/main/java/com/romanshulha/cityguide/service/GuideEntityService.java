package com.romanshulha.cityguide.service;

import com.romanshulha.cityguide.domain.sql.GuideEntity;

public interface GuideEntityService {
  GuideEntity getById(Long id);

  GuideEntity save(GuideEntity guideEntity);

  GuideEntity update(GuideEntity guideEntity);

  void deleteById(Long id);
}
