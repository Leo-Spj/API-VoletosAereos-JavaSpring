package com.webint.api_voletos_aereos.service;

import com.webint.api_voletos_aereos.persistence.entity.ReservaEntity;
import com.webint.api_voletos_aereos.persistence.repository.ReservaRepository;
import org.springframework.stereotype.Service;

@Service
public class ReservaService extends GenericService<ReservaEntity, Integer, ReservaRepository>{
    public ReservaService(ReservaRepository repository) {
        super(repository);
    }
}
