package com.webint.api_voletos_aereos.service;

import com.webint.api_voletos_aereos.persistence.entity.VueloEntity;
import com.webint.api_voletos_aereos.persistence.repository.VueloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Service // Sirve para indicar que la clase es un servicio
public class VueloService {
    private final VueloRepository vueloRepository;

    @Autowired // Sirve para inyectar dependencias
    public VueloService(VueloRepository vueloRepository) {
        this.vueloRepository = vueloRepository;
    }


// Metodo que comprueba si un vuelo existe
    public boolean existsById(int id){
        return this.vueloRepository.existsById(id);
    }

// Metodos Get:

    public List<VueloEntity> getVuelos() {
        return vueloRepository.findAll();
    }

    public VueloEntity getVueloById(int id) {
        return vueloRepository.findById(id).orElse(null);
    }

// Metodos Save

    public VueloEntity saveVuelo(VueloEntity vuelo){
        return vueloRepository.save(vuelo);
    }

// Metodos Put

    public VueloEntity updateVuelo(int id, VueloEntity vuelo) {
        vuelo.setVueloID(id);
        return vueloRepository.save(vuelo);
    }

// Metodo Delete
    public VueloEntity deleteVuelo(int id) {
        VueloEntity vuelo = vueloRepository.findById(id).orElse(null);
        if (vuelo != null) {
            vueloRepository.deleteById(id);
        }
        return vuelo;
    }
}
