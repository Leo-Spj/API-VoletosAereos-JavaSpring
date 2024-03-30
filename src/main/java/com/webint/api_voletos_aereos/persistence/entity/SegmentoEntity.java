package com.webint.api_voletos_aereos.persistence.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;


@Entity
@Table(name = "segmento")
public class SegmentoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "segmentoid")
    private int segmentoID;

    @ManyToOne
    @JoinColumn(name = "itinerarioid", referencedColumnName = "itinerarioid")
    @Fetch(FetchMode.JOIN)
    private ItinerarioEntity itinerario;

    @ManyToOne
    @JoinColumn(name = "vueloid", referencedColumnName = "vueloid")
    @Fetch(FetchMode.JOIN)
    private VueloEntity vuelo;


    // Getters y setters


    public int getSegmentoID() {
        return segmentoID;
    }

    public void setSegmentoID(int segmentoID) {
        this.segmentoID = segmentoID;
    }

    public ItinerarioEntity getItinerario() {
        return itinerario;
    }

    public void setItinerario(ItinerarioEntity itinerario) {
        this.itinerario = itinerario;
    }

    public VueloEntity getVuelo() {
        return vuelo;
    }

    public void setVuelo(VueloEntity vuelo) {
        this.vuelo = vuelo;
    }
}