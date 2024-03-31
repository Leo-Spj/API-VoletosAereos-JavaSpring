package com.webint.api_voletos_aereos.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import java.sql.Date;

@Entity // Sirve para indicar que la clase es una entidad
@Table(name = "vuelo")  // Sirve para indicar el nombre de la tabla en la base de datos
@Getter // Sirve para que no haya que escribir los getters
@Setter // Sirve para que no haya que escribir los setters
@NoArgsConstructor // Sirve para que haya un constructor vacío
public class VueloEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "vueloid")
    private int vueloID;

    @ManyToOne
    @JoinColumn(name = "aerolineaid", referencedColumnName = "aerolineaid")
      //FetchMode.JOIN es para que se haga un join en la consulta
    private AerolineaEntity aerolinea;

    @ManyToOne
    @JoinColumn(name = "origenid", referencedColumnName = "lugarid") //name es para la columna de la tabla actual, referencedColumnName es para la columna de la tabla referenciada
    @Fetch(FetchMode.JOIN)
    private LugarEntity origen;

    @ManyToOne
    @JoinColumn(name = "destinoid", referencedColumnName = "lugarid")
    @Fetch(FetchMode.JOIN)
    private LugarEntity destino;

    @Column(name = "salida")
    private Date Salida;

    @Column(name = "llegada")
    private Date Llegada;

    @Column(name = "cantidad_asientos")
    private int cantidadAsientos;

    @Column(name = "asientos_disponibles")
    private int asientosDisponibles;

}