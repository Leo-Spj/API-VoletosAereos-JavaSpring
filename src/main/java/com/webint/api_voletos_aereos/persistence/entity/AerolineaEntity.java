package com.webint.api_voletos_aereos.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "aerolinea")
@Getter // Sirve para que no haya que escribir los getters
@Setter // Sirve para que no haya que escribir los setters
@NoArgsConstructor // Sirve para que haya un constructor vacío
public class AerolineaEntity implements GenericIdentifiable<Integer> {

    /*
    Para ignorar un atributo en la llamada: @JsonIgnore
    Para vevitar un llamdo infinito en la llamada: @JsonIdentityInfo o tambien con @JsonIgnore
    Para que no se cargue una relacion por ejemplo en @ManyToOne(fetch = FetchType.LAZY) usar el FetchType.LAZY

    Valores por defecto para Fetch

        LAZY: Solo se carga cuando se llama al metodo get
        @OneToMany(fetch = FetchType.LAZY)
        @ManyToMany(fetch = FetchType.LAZY)

        EAGER: Carga la relacion siempre
        @OneToOne(fetch = FetchType.EAGER)
        @ManyToOne(fetch = FetchType.EAGER)

     */


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "aerolineaid")
    private int aerolineaID;

    @Column(name = "nombre")
    private String nombre;

    @Override
    public Integer getID() {
        return aerolineaID;
    }

    // Getters y setters creados mediante Lombok con @Getter y @Setter en la clase

}
