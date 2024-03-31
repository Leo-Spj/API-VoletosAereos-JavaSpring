package com.webint.api_voletos_aereos.web.controller;

import com.webint.api_voletos_aereos.persistence.entity.VueloEntity;
import com.webint.api_voletos_aereos.service.VueloService;
import org.springframework.http.ResponseEntity; // Sirve para devolver una respuesta HTTP
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // Sirve para indicar que la clase es un controlador
@RequestMapping("/api/vuelo") // Sirve para indicar la URL base (general) para acceder a los métodos de esta clase
public class VueloController {

    private final VueloService vueloService;

    public VueloController(VueloService vueloService) {
        this.vueloService = vueloService;
    }

// Metodos Get:
    @GetMapping // Sirve para indicar que este método se ejecuta al hacer una petición GET a la URL base
    public ResponseEntity<List<VueloEntity>> getVuelos() {
        return ResponseEntity.ok(vueloService.getAll()); // ResponseEntity.ok() sirve para devolver un estado de éxito 200
    }

    @GetMapping("/{id}")
        public ResponseEntity<VueloEntity> getVueloById(@PathVariable Integer id) { // @PathVariable sirve para indicar que el valor de la variable id se obtiene de la URL
        return ResponseEntity.ok(vueloService.getByID(id));
    }

// Metodos Post -> para guardar un vuelo
    @PostMapping
    public ResponseEntity<VueloEntity> saveVuelo(@RequestBody VueloEntity vuelo) { // @RequestBody sirve para indicar que el objeto vuelo se obtiene del cuerpo de la petición
        if (vueloService.exists(vuelo.getVueloID())) {
            return ResponseEntity.badRequest().build(); // ResponseEntity.badRequest() sirve para devolver un estado de error 400 y el .build() para construir la respuesta
        }
        return ResponseEntity.ok(vueloService.save(vuelo));
    }

// Metodos Put -> para actualizar un vuelo
    @PutMapping("/{id}")
    public ResponseEntity<VueloEntity> updateVuelo(@PathVariable Integer id, @RequestBody VueloEntity vuelo) {
        if (!vueloService.exists(id)) {
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(vueloService.update(id, vuelo));
    }

// Metodo Delete -> para eliminar un vuelo
    @DeleteMapping("/{id}")
    public ResponseEntity<VueloEntity> deleteVuelo(@PathVariable Integer id) {
        if (!vueloService.exists(id)) {
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(vueloService.delete(id));
    }
}
