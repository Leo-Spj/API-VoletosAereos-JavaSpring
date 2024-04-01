package com.webint.api_voletos_aereos.persistence.repository;

import com.webint.api_voletos_aereos.persistence.entity.LugarEntity;
import com.webint.api_voletos_aereos.persistence.entity.VueloEntity;
import org.springframework.data.repository.ListCrudRepository;

import java.util.List;

public interface VueloRepository extends ListCrudRepository<VueloEntity, Integer> { // El segudno parametro es el tipo de la llave primaria de la entidad
    // Aquí se pueden agregar metodos personalizados

    // Encuentra todos los vuelos que tenga como origen 'X' y destino 'Y'
    List<VueloEntity> findAllByOrigenAndDestino(LugarEntity origen, LugarEntity destino);


}
