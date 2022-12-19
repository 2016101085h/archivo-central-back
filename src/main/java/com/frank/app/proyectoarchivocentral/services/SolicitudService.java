package com.frank.app.proyectoarchivocentral.services;

import com.frank.app.proyectoarchivocentral.entity.Solicitud;

import java.util.List;
import java.util.Optional;

public interface SolicitudService {
    public Solicitud setSolicitud(Solicitud solicitud) throws Exception;
    public List<Solicitud> getAllSolicitud() throws Exception;
    public Optional<Solicitud> findByID(Long cod_solicitud) throws Exception;

    public List<Solicitud> findByCodeSerie(String code_serie) throws Exception;

    public void exportPDF(Solicitud solicitud) throws Exception;
}
