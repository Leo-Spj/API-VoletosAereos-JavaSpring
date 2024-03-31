package com.webint.api_voletos_aereos.web.controller;

import com.webint.api_voletos_aereos.persistence.entity.GenericIdentifiable;
import com.webint.api_voletos_aereos.service.GenericService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


public class GenericController <S extends GenericService<E, ID, ?>, E, ID> { // ? significa que no se sabe el tipo de dato pero se infiere que es un CrudRepository
    private final S service;

    public GenericController(S service) {
        this.service = service;
    }


// Metodos de Get. -> Obtienen elementos

    @GetMapping
    public ResponseEntity<List<E>> getAll() {
        return ResponseEntity.ok(service.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<E> getById(@PathVariable ID id) {
        return ResponseEntity.ok(service.getByID(id));
    }


// Metodo de Post -> Guardan elementos

    @PostMapping
    public ResponseEntity<E> save(@RequestBody E entity) {
        if (entity instanceof GenericIdentifiable) {
            GenericIdentifiable<ID> identifiableEntity = (GenericIdentifiable<ID>) entity;
            ID id = identifiableEntity.getID();
            if (service.exists(id)) {
                return ResponseEntity.badRequest().build();
            }
        }
        return ResponseEntity.ok(service.save(entity));
    }


// Metodo de Put -> Actualizan elementos

    @PutMapping("/{id}")
    public ResponseEntity<E> update(@PathVariable ID id, @RequestBody E entity) {
        if (!service.exists(id)) {
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(service.update(id, entity));
    }


// Metodo de Delete -> Eliminan elementos

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable ID id) {
        if (!service.exists(id)) {
            return ResponseEntity.badRequest().build();
        }
        service.delete(id);
        return ResponseEntity.ok().build();
    }
}































