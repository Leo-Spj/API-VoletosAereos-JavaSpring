package com.webint.api_voletos_aereos.web.controller;

import com.webint.api_voletos_aereos.persistence.entity.GenericIdentifiable;
import com.webint.api_voletos_aereos.service.GenericService;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Getter
@Setter
public abstract class GenericController <S extends GenericService<E, ID, ?>, E, ID> { // ? significa que no se sabe el tipo de dato pero se infiere que es un CrudRepository

    private final S service;

    public GenericController(S service) {
        this.service = service;
    }


// Metodos de Get. -> Obtienen elementos

    @GetMapping // Sirve para indicar que este método se ejecuta al hacer una petición GET a la URL base
    public ResponseEntity<List<E>> getAll() {
        return ResponseEntity.ok(service.getAll());
    } // ResponseEntity.ok() sirve para devolver un estado de éxito 200

    @GetMapping("/{id}")
    public ResponseEntity<E> getById(@PathVariable ID id) {
        // @PathVariable sirve para indicar que el valor de la variable id se obtiene de la URL
        return ResponseEntity.ok(service.getByID(id));
    }


// Metodo de Post -> Guardan elementos

    @PostMapping
    public ResponseEntity<?> save(@RequestBody E entity) {
        // @RequestBody sirve para indicar que el objeto vuelo se obtiene del cuerpo de la petición
        if (entity instanceof GenericIdentifiable) {
            GenericIdentifiable<ID> identifiableEntity = (GenericIdentifiable<ID>) entity;
            ID id = identifiableEntity.getID();
            System.out.println("id: " + id);
            if (service.exists(id)) {
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("La entidad ya existe");
                // ResponseEntity.status(HttpStatus.BAD_REQUEST) sirve para devolver un estado de error 400
                // y el .body() para devolver un mensaje
            }
            return ResponseEntity.ok(service.save(entity));
        }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("No se puede guardar la entidad porque no es identificable");
    }


// Metodo de Put -> Actualizan elementos

    @PutMapping("/{id}")
    public ResponseEntity<E> update(@PathVariable ID id, @RequestBody E entity) {
        if (!service.exists(id)) {
            return ResponseEntity.badRequest().build();
            // ResponseEntity.badRequest() sirve para devolver un estado de error 400 y el .build() para construir la respuesta
        }
        return ResponseEntity.ok(service.update(id, entity));
    }


// Metodo de Delete -> Eliminan elementos

    @DeleteMapping("/{id}")
    public ResponseEntity<E> delete(@PathVariable ID id) {
        if (!service.exists(id)) {
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(service.delete(id));
    }
}































