package com.frank.app.proyectoarchivocentral.services.impl;

import com.frank.app.proyectoarchivocentral.entity.UnidadOrganica;
import com.frank.app.proyectoarchivocentral.repository.UnidadOrganicaRepository;
import com.frank.app.proyectoarchivocentral.services.UnidadOrganicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UnidadOrganicaServiceImpl implements UnidadOrganicaService {
    @Autowired
    UnidadOrganicaRepository unidadOrganicaRepository;
    @Override
    public UnidadOrganica setunidadOrganica(UnidadOrganica unidadOrganica) {
        return unidadOrganicaRepository.save(unidadOrganica);
    }

    @Override
    public Optional <UnidadOrganica> findById(Long co_unid) {
        return  unidadOrganicaRepository.findById(co_unid);
    }
}
