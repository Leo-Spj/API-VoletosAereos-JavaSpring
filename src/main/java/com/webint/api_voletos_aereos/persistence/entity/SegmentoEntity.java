package com.webint.api_voletos_aereos.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;


@Entity
@Table(name = "segmento")
@Getter // Sirve para que no haya que escribir los getters
@Setter // Sirve para que no haya que escribir los setters
@NoArgsConstructor // Sirve para que haya un constructor vacío
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


}