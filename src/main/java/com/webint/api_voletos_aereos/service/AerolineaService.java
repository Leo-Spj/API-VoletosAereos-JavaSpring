package com.webint.api_voletos_aereos.service;

import com.webint.api_voletos_aereos.persistence.entity.AerolineaEntity;
import com.webint.api_voletos_aereos.persistence.repository.AerolineaRepository;
import org.springframework.stereotype.Service;

@Service
public class AerolineaService extends GenericService<AerolineaEntity, Integer, AerolineaRepository>{
    public AerolineaService(AerolineaRepository repository) {
        super(repository);
    }
}
