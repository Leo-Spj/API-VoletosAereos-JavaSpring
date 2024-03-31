package com.webint.api_voletos_aereos.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import java.sql.Date;

@Entity
@Table(name = "reserva")
@Getter // Sirve para que no haya que escribir los getters
@Setter // Sirve para que no haya que escribir los setters
@NoArgsConstructor // Sirve para que haya un constructor vacío
public class ReservaEntity implements GenericIdentifiable<Integer> {

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


    @Override
    public Integer getID() {
        return reservaID;
    }
}
