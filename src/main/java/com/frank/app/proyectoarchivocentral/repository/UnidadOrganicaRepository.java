package com.frank.app.proyectoarchivocentral.repository;

import com.frank.app.proyectoarchivocentral.entity.UnidadOrganica;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UnidadOrganicaRepository extends CrudRepository<UnidadOrganica, Long> {
}
