package com.webint.api_voletos_aereos.persistence.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "lugar")
public class LugarEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "lugarid")
    private int lugarID;

    @Column(name = "nombre")
    private String nombre;

    // Getters y setters


    public int getLugarID() {
        return lugarID;
    }

    public void setLugarID(int lugarID) {
        this.lugarID = lugarID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
