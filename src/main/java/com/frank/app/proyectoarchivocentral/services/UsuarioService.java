package com.frank.app.proyectoarchivocentral.services;

import com.frank.app.proyectoarchivocentral.entity.Usuario;
import com.frank.app.proyectoarchivocentral.entity.UsuarioRol;

import java.util.Set;

public interface UsuarioService {
    public Usuario guardarUsuario(Usuario usuario, Set<UsuarioRol> usuarioRoles) throws  Exception;
    public Usuario obtenerUsuario(String username);
    public void eliminarUsuario(Long usuarioId);
}
