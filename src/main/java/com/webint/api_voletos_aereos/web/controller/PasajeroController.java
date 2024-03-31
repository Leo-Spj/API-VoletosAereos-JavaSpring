package com.webint.api_voletos_aereos.web.controller;

import com.webint.api_voletos_aereos.persistence.entity.PasajeroEntity;
import com.webint.api_voletos_aereos.service.PasajeroService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Sirve para indicar que la clase es un controlador
@RequestMapping("/api/pasajero") // Sirve para indicar la URL base (general) para acceder a los métodos de esta clase
public class PasajeroController extends GenericController<PasajeroService, PasajeroEntity, Integer> {


    public PasajeroController(PasajeroService service) {
        super(service);
    }
}
