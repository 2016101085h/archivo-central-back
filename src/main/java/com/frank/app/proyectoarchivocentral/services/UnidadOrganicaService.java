package com.frank.app.proyectoarchivocentral.services;

import com.frank.app.proyectoarchivocentral.entity.UnidadOrganica;

import java.util.Optional;

public interface UnidadOrganicaService {
    public UnidadOrganica setunidadOrganica(UnidadOrganica unidadOrganica);

    public Optional<UnidadOrganica> findById(Long co_unid) throws Exception;
}
