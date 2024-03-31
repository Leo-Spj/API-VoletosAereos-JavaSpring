package com.webint.api_voletos_aereos.persistence.repository;

import com.webint.api_voletos_aereos.persistence.entity.ReservaEntity;
import org.springframework.data.repository.ListCrudRepository;

public interface ReservaRepository extends ListCrudRepository<ReservaEntity, Integer> {
}
