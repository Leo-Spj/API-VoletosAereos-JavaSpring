package com.webint.api_voletos_aereos.service;

import com.webint.api_voletos_aereos.persistence.entity.EstadoEntity;
import com.webint.api_voletos_aereos.persistence.repository.EstadoRepository;
import org.springframework.stereotype.Service;

@Service
public class EstadoService extends GenericService<EstadoEntity, Integer, EstadoRepository>{
    public EstadoService(EstadoRepository repository) {
        super(repository);
    }
}
