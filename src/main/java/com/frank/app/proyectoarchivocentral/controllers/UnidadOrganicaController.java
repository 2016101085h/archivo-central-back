package com.frank.app.proyectoarchivocentral.controllers;

import com.frank.app.proyectoarchivocentral.entity.UnidadOrganica;
import com.frank.app.proyectoarchivocentral.services.UnidadOrganicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("/v1")
public class UnidadOrganicaController {

    @Autowired
    UnidadOrganicaService unidadOrganicaService;

    @PostMapping("/unidad-organica/save")
    public UnidadOrganica setUnidadOrganica(@RequestBody  UnidadOrganica unidadOrganica){
        return unidadOrganicaService.setunidadOrganica(unidadOrganica);
    }
}
