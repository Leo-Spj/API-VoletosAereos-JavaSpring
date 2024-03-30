package com.webint.api_voletos_aereos.persistence.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Table(name = "itinerario")
public class ItinerarioEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "itinerarioid")
    private int itinerarioID;

    @ManyToOne
    @JoinColumn(name = "reservaid", referencedColumnName = "reservaid")
    @Fetch(FetchMode.JOIN)
    private ReservaEntity reserva;

    // Getters y setters


    public int getItinerarioID() {
        return itinerarioID;
    }

    public void setItinerarioID(int itinerarioID) {
        this.itinerarioID = itinerarioID;
    }

    public ReservaEntity getReserva() {
        return reserva;
    }

    public void setReserva(ReservaEntity reserva) {
        this.reserva = reserva;
    }
}
