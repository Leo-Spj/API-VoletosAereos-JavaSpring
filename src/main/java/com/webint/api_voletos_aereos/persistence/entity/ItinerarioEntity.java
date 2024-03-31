package com.webint.api_voletos_aereos.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Table(name = "itinerario")
@Getter // Sirve para que no haya que escribir los getters
@Setter // Sirve para que no haya que escribir los setters
@NoArgsConstructor // Sirve para que haya un constructor vacío
public class ItinerarioEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "itinerarioid")
    private int itinerarioID;

    @ManyToOne
    @JoinColumn(name = "reservaid", referencedColumnName = "reservaid")
    @Fetch(FetchMode.JOIN)
    private ReservaEntity reserva;

}
