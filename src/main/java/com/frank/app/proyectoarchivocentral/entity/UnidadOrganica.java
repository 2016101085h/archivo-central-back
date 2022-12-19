package com.frank.app.proyectoarchivocentral.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "unid_orga")
public class UnidadOrganica {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long co_unid;
    private String de_unid;
    private String de_abrv;
    @JsonIgnore
    private Character in_std;
    @JsonIgnore
    private Character co_zona;
    @JsonIgnore
    private Character co_ofic_rgst;
    @JsonIgnore
    private String co_usua_crea;

    @Temporal(TemporalType.TIMESTAMP)
    @JsonIgnore
    private Date fe_usua_crea;
    @JsonIgnore
    @Temporal(TemporalType.TIMESTAMP)
    private Date co_usua_modi;
    @JsonIgnore
    @Temporal(TemporalType.TIMESTAMP)
    private Date fe_usua_modi;


}
