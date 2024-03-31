package com.webint.api_voletos_aereos.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "estado")
@Getter // Sirve para que no haya que escribir los getters
@Setter // Sirve para que no haya que escribir los setters
@NoArgsConstructor // Sirve para que haya un constructor vacío
public class EstadoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "estadoid")
    private int estadoID;

    @Column(name = "nomre_estado")
    private String nombreEstado;
}
