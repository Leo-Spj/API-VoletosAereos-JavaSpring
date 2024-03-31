package com.webint.api_voletos_aereos.web.controller;

import com.webint.api_voletos_aereos.persistence.entity.EstadoEntity;
import com.webint.api_voletos_aereos.service.EstadoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/estado")
public class EstadoController extends GenericController<EstadoService, EstadoEntity, Integer>{
    public EstadoController(EstadoService service) {
        super(service);
    }
}
