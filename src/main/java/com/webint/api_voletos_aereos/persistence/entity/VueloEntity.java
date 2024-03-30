package com.webint.api_voletos_aereos.persistence.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import java.sql.Date;

@Entity
@Table(name = "vuelo")
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

    @Column(name = "hora_salida")
    private Date horaSalida;

    @Column(name = "hora_llegada")
    private Date horaLlegada;

    @Column(name = "cantidad_asientos")
    private int cantidadAsientos;

    @Column(name = "asientos_disponibles")
    private int asientosDisponibles;

    // Getters y setters
    public int getVueloID() {
        return vueloID;
    }

    public void setVueloID(int vueloID) {
        this.vueloID = vueloID;
    }

    public AerolineaEntity getAerolinea() {
        return aerolinea;
    }

    public void setAerolinea(AerolineaEntity aerolinea) {
        this.aerolinea = aerolinea;
    }

    public LugarEntity getOrigen() {
        return origen;
    }

    public void setOrigen(LugarEntity origen) {
        this.origen = origen;
    }

    public LugarEntity getDestino() {
        return destino;
    }

    public void setDestino(LugarEntity destino) {
        this.destino = destino;
    }

    public Date getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(Date horaSalida) {
        this.horaSalida = horaSalida;
    }

    public Date getHoraLlegada() {
        return horaLlegada;
    }

    public void setHoraLlegada(Date horaLlegada) {
        this.horaLlegada = horaLlegada;
    }

    public int getCantidadAsientos() {
        return cantidadAsientos;
    }

    public void setCantidadAsientos(int cantidadAsientos) {
        this.cantidadAsientos = cantidadAsientos;
    }

    public int getAsientosDisponibles() {
        return asientosDisponibles;
    }

    public void setAsientosDisponibles(int asientosDisponibles) {
        this.asientosDisponibles = asientosDisponibles;
    }
}