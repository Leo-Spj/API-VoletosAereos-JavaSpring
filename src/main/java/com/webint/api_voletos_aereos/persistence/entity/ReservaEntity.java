package com.webint.api_voletos_aereos.persistence.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import java.sql.Date;

@Entity
@Table(name = "reserva")
public class ReservaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "reservaid")
    private int reservaID;

    @ManyToOne
    @JoinColumn(name = "pasajeroid", referencedColumnName = "pasajeroid")
    @Fetch(FetchMode.JOIN)
    private PasajeroEntity pasajero;

    @ManyToOne
    @JoinColumn(name = "estado_reservaid", referencedColumnName = "estadoid")
    @Fetch(FetchMode.JOIN)
    private EstadoEntity estadoReserva;

    @Column(name = "fecha_reserva")
    private Date fechaReserva;

    // Getters y setters


    public int getReservaID() {
        return reservaID;
    }

    public void setReservaID(int reservaID) {
        this.reservaID = reservaID;
    }

    public PasajeroEntity getPasajero() {
        return pasajero;
    }

    public void setPasajero(PasajeroEntity pasajero) {
        this.pasajero = pasajero;
    }

    public EstadoEntity getEstadoReserva() {
        return estadoReserva;
    }

    public void setEstadoReserva(EstadoEntity estadoReserva) {
        this.estadoReserva = estadoReserva;
    }

    public Date getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(Date fechaReserva) {
        this.fechaReserva = fechaReserva;
    }
}
