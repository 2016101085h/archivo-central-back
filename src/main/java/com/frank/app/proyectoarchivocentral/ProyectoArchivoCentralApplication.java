package com.frank.app.proyectoarchivocentral;

import com.frank.app.proyectoarchivocentral.entity.Rol;
import com.frank.app.proyectoarchivocentral.entity.Usuario;
import com.frank.app.proyectoarchivocentral.entity.UsuarioRol;

import com.frank.app.proyectoarchivocentral.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class ProyectoArchivoCentralApplication implements CommandLineRunner {
    @Autowired
    private UsuarioService usuarioService;
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;


    public static void main(String[] args) {
        SpringApplication.run(ProyectoArchivoCentralApplication.class, args);
    }
    @Override
    public void run(String... args) throws Exception {
//        Usuario usuario = new Usuario();
//        usuario.setNombre("Frank");
//        usuario.setApellido("Serrano");
//        usuario.setUsername("admin@test.com");
//        usuario.setCreated_at(new Date());
//        usuario.setPassword(bCryptPasswordEncoder.encode("123"));
//        usuario.setTelefono("924883733");
//        usuario.setDni("70236495");
//
//
//        Rol rol = new Rol();
//        rol.setRolId(1L);
//        rol.setNombre("ADMIN");
//
//        Set<UsuarioRol> usuarioRols = new HashSet<>();
//        UsuarioRol usuarioRol = new UsuarioRol();
//        usuarioRol.setRol(rol);
//        usuarioRol.setUsuario(usuario);
//
//        usuarioRols.add(usuarioRol);
//
//        Usuario usuarioGuardad = usuarioService.guardarUsuario(usuario, usuarioRols);
//        System.out.println(usuarioGuardad.toString());
    }
}
