package com.webint.api_voletos_aereos.service;

import com.webint.api_voletos_aereos.persistence.entity.ItinerarioEntity;
import com.webint.api_voletos_aereos.persistence.repository.ItinerarioRepository;
import org.springframework.stereotype.Service;

@Service
public class ItinerarioService extends GenericService<ItinerarioEntity, Integer, ItinerarioRepository>{
    public ItinerarioService(ItinerarioRepository repository) {
        super(repository);
    }
}
