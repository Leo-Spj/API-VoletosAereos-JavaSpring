package com.webint.api_voletos_aereos.service;

import com.webint.api_voletos_aereos.persistence.entity.SegmentoEntity;
import com.webint.api_voletos_aereos.persistence.repository.SegmentoRepository;
import org.springframework.stereotype.Service;

@Service
public class SegmentoService extends GenericService<SegmentoEntity, Integer, SegmentoRepository>{
    public SegmentoService(SegmentoRepository repository) {
        super(repository);
    }
}
