package com.frank.app.proyectoarchivocentral.repository;

import com.frank.app.proyectoarchivocentral.entity.Solicitud;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SolicitudRepository extends CrudRepository<Solicitud, Long> {
    public abstract List<Solicitud> findBycodSerie(String cod_serie);
}
