package com.webint.api_voletos_aereos.persistence.repository;

import com.webint.api_voletos_aereos.persistence.entity.ItinerarioEntity;
import org.springframework.data.repository.ListCrudRepository;

public interface ItinerarioRepository extends ListCrudRepository<ItinerarioEntity, Integer> {
}
