package com.webint.api_voletos_aereos.service;

import com.webint.api_voletos_aereos.persistence.entity.LugarEntity;
import com.webint.api_voletos_aereos.persistence.repository.LugarRepository;
import org.springframework.stereotype.Service;

@Service
public class LugarService extends GenericService<LugarEntity, Integer, LugarRepository>{
    public LugarService(LugarRepository repository) {
        super(repository);
    }
}
