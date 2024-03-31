package com.webint.api_voletos_aereos.web.controller;

import com.webint.api_voletos_aereos.persistence.entity.VueloEntity;
import com.webint.api_voletos_aereos.service.VueloService;
import org.springframework.web.bind.annotation.*;

@RestController // Sirve para indicar que la clase es un controlador
@RequestMapping("/api/vuelo") // Sirve para indicar la URL base (general) para acceder a los métodos de esta clase
public class VueloController extends GenericController<VueloService, VueloEntity, Integer>{
    public VueloController(VueloService service) {
        super(service);
    }
}
