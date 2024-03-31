package com.webint.api_voletos_aereos.persistence.repository;

import com.webint.api_voletos_aereos.persistence.entity.EstadoEntity;
import org.springframework.data.repository.ListCrudRepository;

public interface EstadoRepository extends ListCrudRepository<EstadoEntity, Integer> {
}
