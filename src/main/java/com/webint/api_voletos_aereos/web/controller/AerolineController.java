package com.webint.api_voletos_aereos.web.controller;

import com.webint.api_voletos_aereos.persistence.entity.AerolineaEntity;
import com.webint.api_voletos_aereos.service.AerolineaService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/aerolinea")
public class AerolineController extends GenericController<AerolineaService, AerolineaEntity, Integer>{
    public AerolineController(AerolineaService service) {
        super(service);
    }
}
