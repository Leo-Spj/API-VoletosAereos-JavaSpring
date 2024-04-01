package com.webint.api_voletos_aereos.web.controller;

import com.webint.api_voletos_aereos.persistence.entity.LugarEntity;
import com.webint.api_voletos_aereos.persistence.entity.VueloEntity;
import com.webint.api_voletos_aereos.service.LugarService;
import com.webint.api_voletos_aereos.service.VueloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // Sirve para indicar que la clase es un controlador
@RequestMapping("/api/vuelo") // Sirve para indicar la URL base (general) para acceder a los métodos de esta clase
public class VueloController extends GenericController<VueloService, VueloEntity, Integer>{

    private final LugarService lugarService;

    @Autowired // Sirve para inyectar una dependencia, en este caso, un servicio
    public VueloController(VueloService vueloService, LugarService lugarService) {
        super(vueloService);
        this.lugarService = lugarService;
    }

    // Usando el metodo personalizado de la clase VueloService
    @GetMapping("/origen/{origenId}/destino/{destinoId}")
    public List<VueloEntity> findAllByOrigenAndDestino(@PathVariable Integer origenId, @PathVariable Integer destinoId) {
        LugarEntity origen = lugarService.getByID(origenId);
        LugarEntity destino = lugarService.getByID(destinoId);

        return getService().findAllByOrigenAndDestino(origen, destino);
    }

}
