package com.webint.api_voletos_aereos.web.controller;

import com.webint.api_voletos_aereos.persistence.entity.SegmentoEntity;
import com.webint.api_voletos_aereos.service.SegmentoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/segmento")

public class SegmentoController extends GenericController<SegmentoService, SegmentoEntity, Integer>{
    public SegmentoController(SegmentoService service) {
        super(service);
    }
}
