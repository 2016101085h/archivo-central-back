package com.frank.app.proyectoarchivocentral.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "solicitud")
@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Solicitud {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long cod_solicitud;
    @Column(name = "cod_serie")
    private String codSerie;
    private String desc_soli;
    private Date mes;
    private Date anio;
    private String serie_doc;
    private String uc;
    private Double ut;
    private String obs;
    private Boolean condicion;

    @ManyToOne
    private UnidadOrganica unidadOrganica;
    @JsonIgnore
    private String co_usua_crea;
    @Temporal(TemporalType.TIMESTAMP)
    @JsonIgnore
    private Date fe_usua_crea;
    @Temporal(TemporalType.TIMESTAMP)
    @JsonIgnore
    private Date co_usua_modi;
    @Temporal(TemporalType.TIMESTAMP)
    @JsonIgnore
    private Date fe_usua_modi;

    private byte[] arch_soli;
}
