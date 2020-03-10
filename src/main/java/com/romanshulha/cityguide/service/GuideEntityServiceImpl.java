package com.romanshulha.cityguide.service;

import com.romanshulha.cityguide.domain.sql.GuideEntity;
import com.romanshulha.cityguide.repository.GuideEntityRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Log4j2
@Service
@RequiredArgsConstructor
public class GuideEntityServiceImpl implements GuideEntityService {

  private final GuideEntityRepository guideEntityRepository;

  @Override
  public GuideEntity getById(Long id) {
    return guideEntityRepository.findById(id).orElse(null);
  }

  @Override
  public GuideEntity save(GuideEntity guideEntity) {
    return guideEntityRepository.save(guideEntity);
  }

  @Override
  public GuideEntity update(GuideEntity guideEntity) {
    return guideEntityRepository.save(guideEntity);
  }

  @Override
  public void deleteById(Long id) {
    //TODO soft delete
    guideEntityRepository.deleteById(id);
  }
}
