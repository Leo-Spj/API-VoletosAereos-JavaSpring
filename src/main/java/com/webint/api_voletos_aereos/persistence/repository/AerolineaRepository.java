package com.webint.api_voletos_aereos.persistence.repository;

import com.webint.api_voletos_aereos.persistence.entity.AerolineaEntity;
import org.springframework.data.repository.ListCrudRepository;

public interface AerolineaRepository extends ListCrudRepository<AerolineaEntity, Integer> {
}
