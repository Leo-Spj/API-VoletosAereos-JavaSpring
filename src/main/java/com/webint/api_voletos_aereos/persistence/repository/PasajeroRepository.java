package com.webint.api_voletos_aereos.persistence.repository;

import com.webint.api_voletos_aereos.persistence.entity.PasajeroEntity;
import org.springframework.data.repository.ListCrudRepository;

public interface PasajeroRepository extends ListCrudRepository<PasajeroEntity, Integer>{// El segudno parametro es el tipo de la llave primaria de la entidad
    // Aquí se pueden agregar metodos personalizados
    // por lo simple no se agregan (aún)
}
