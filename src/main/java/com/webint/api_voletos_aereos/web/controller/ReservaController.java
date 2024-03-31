package com.webint.api_voletos_aereos.web.controller;

import com.webint.api_voletos_aereos.persistence.entity.ReservaEntity;
import com.webint.api_voletos_aereos.service.ReservaService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/reserva")
public class ReservaController extends GenericController<ReservaService, ReservaEntity, Integer>{
    public ReservaController(ReservaService service) {
        super(service);
    }
}
