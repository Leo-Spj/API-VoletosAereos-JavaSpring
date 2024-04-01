package com.webint.api_voletos_aereos.service;

import com.webint.api_voletos_aereos.persistence.entity.LugarEntity;
import com.webint.api_voletos_aereos.persistence.entity.VueloEntity;
import com.webint.api_voletos_aereos.persistence.repository.VueloRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service // Sirve para indicar que la clase es un servicio
public class VueloService extends GenericService<VueloEntity, Integer, VueloRepository> {
    public VueloService(VueloRepository repository) {
        super(repository);
    }

    // Usando el metodo personalizado de la interfaz VueloRepository
    public List<VueloEntity> findAllByOrigenAndDestino(LugarEntity origen, LugarEntity destino) {
        return repository.findAllByOrigenAndDestino(origen, destino);
    }
}
