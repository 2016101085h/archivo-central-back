package com.frank.app.proyectoarchivocentral.controllers;

import com.frank.app.proyectoarchivocentral.entity.Solicitud;
import com.frank.app.proyectoarchivocentral.entity.UnidadOrganica;
import com.frank.app.proyectoarchivocentral.services.SolicitudService;
import com.frank.app.proyectoarchivocentral.services.UnidadOrganicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.GeneratedValue;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/v1/solicitud")
public class SolicitudController {

    @Autowired
    SolicitudService solicitudService;

    @Autowired
    UnidadOrganicaService unidadOrganicaService;

    @PostMapping("/save")
    public Solicitud guardarSolicitud(@RequestBody Solicitud solicitud) throws Exception {

        //Guardar en PDF
        solicitudService.exportPDF(solicitud);

        return  solicitudService.setSolicitud(solicitud);

    }

    @GetMapping("/list")
    public List<Solicitud> getListSocilitud(){
        List<Solicitud> solicitudList = null;
        try {
            solicitudList = solicitudService.getAllSolicitud();
        }catch (Exception e){
            e.printStackTrace();
        }
        return solicitudList;
    }

    @GetMapping("/get")
    public List<Solicitud> getSolicitudByCodeSerie(@RequestParam("cod_serie") String cod_serie) throws Exception {
        return  solicitudService.findByCodeSerie(cod_serie);

    }
}
