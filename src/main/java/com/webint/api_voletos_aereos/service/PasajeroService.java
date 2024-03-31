package com.webint.api_voletos_aereos.service;

import com.webint.api_voletos_aereos.persistence.entity.PasajeroEntity;
import com.webint.api_voletos_aereos.persistence.repository.PasajeroRepository;
import org.springframework.stereotype.Service;

@Service
public class PasajeroService extends GenericService<PasajeroEntity, Integer, PasajeroRepository> {

    public PasajeroService(PasajeroRepository repository) {
        super(repository);
    }
}
