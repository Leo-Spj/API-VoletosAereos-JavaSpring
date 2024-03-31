package com.webint.api_voletos_aereos.web.controller;

import com.webint.api_voletos_aereos.persistence.entity.ItinerarioEntity;
import com.webint.api_voletos_aereos.service.ItinerarioService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/itinerario")
public class ItinerarioController extends GenericController<ItinerarioService, ItinerarioEntity, Integer>{
    public ItinerarioController(ItinerarioService service) {
        super(service);
    }
}
