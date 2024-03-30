package com.webint.api_voletos_aereos.persistence.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "aerolinea")
public class AerolineaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "aerolineaid")
    private int aerolineaID;

    @Column(name = "nombre")
    private String nombre;

    // Getters y setters


    public int getAerolineaID() {
        return aerolineaID;
    }

    public void setAerolineaID(int aerolineaID) {
        this.aerolineaID = aerolineaID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
