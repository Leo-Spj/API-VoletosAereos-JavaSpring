package com.webint.api_voletos_aereos.service;

import com.webint.api_voletos_aereos.persistence.entity.VueloEntity;
import com.webint.api_voletos_aereos.persistence.repository.VueloRepository;
import org.springframework.stereotype.Service;

@Service // Sirve para indicar que la clase es un servicio
public class VueloService extends GenericService<VueloEntity, Integer, VueloRepository> {
    public VueloService(VueloRepository repository) {
        super(repository);
    }
}
