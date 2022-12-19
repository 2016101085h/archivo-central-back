package com.frank.app.proyectoarchivocentral.services.impl;

import com.frank.app.proyectoarchivocentral.entity.Solicitud;
import com.frank.app.proyectoarchivocentral.repository.SolicitudRepository;
import com.frank.app.proyectoarchivocentral.services.SolicitudService;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.util.JRLoader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

@Service
public class SolicitudServiceImpl implements SolicitudService {
    private String upload_folder    = "D://ARCHIVO_CENTRAL//FILES//";

    @Autowired
    private SolicitudRepository solicitudRepository;

    @Override
    public Solicitud setSolicitud(Solicitud solicitud) throws Exception {
        return solicitudRepository.save(solicitud);
    }
    @Override
    public List<Solicitud> getAllSolicitud() throws Exception {
        return (List<Solicitud>) solicitudRepository.findAll();
    }

    @Override
    public Optional<Solicitud> findByID(Long cod_solicitud) throws Exception {
        return solicitudRepository.findById(cod_solicitud);
    }

    @Override
    public List<Solicitud> findByCodeSerie(String code_serie) throws Exception {
        return solicitudRepository.findBycodSerie(code_serie);
    }

    @Override
    public void exportPDF(Solicitud solicitud) throws Exception {

        File jasperFile = ResourceUtils.getFile("classpath:jasperreports/F-TD-10.2.jasper");
        File logoSunarp = ResourceUtils.getFile("classpath:img/logo_sunarp.png");
        JasperReport jasperReport = (JasperReport) JRLoader.loadObject(jasperFile);

        HashMap<String, Object> parameters = new HashMap<>();
        parameters.put("unidad_organica", solicitud.getUnidadOrganica().getDe_unid());
        parameters.put("fecha_solicitud", new Date());
        parameters.put("serie_doc", solicitud.getSerie_doc());
        parameters.put("num_anexo", solicitud.getCodSerie());
        parameters.put("cod_doc", solicitud.getSerie_doc());
        parameters.put("obs" , solicitud.getObs());
        parameters.put("logo", new FileInputStream(logoSunarp));

        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, new JREmptyDataSource());
        byte[] reporte = JasperExportManager.exportReportToPdf(jasperPrint);
        //String sdf = (new SimpleDateFormat("dd/MM/yyyy")).format(new Date());

        Path directorioPdf = Paths.get(upload_folder);
        String rutaAbsoluta = directorioPdf.toFile().getAbsolutePath();
        int numRamdom = (int) (1000 + Math.random() * 9000);
        Path rutaCompleta = Paths.get(rutaAbsoluta + "//PDF//" + solicitud.getCod_solicitud() +"-"+ numRamdom+ ".pdf");

        try {
            if (!Files.exists(rutaCompleta)) {
                Files.write(rutaCompleta, reporte);
            }
        } catch (IOException e) {

            e.printStackTrace();
        }


    }
}
