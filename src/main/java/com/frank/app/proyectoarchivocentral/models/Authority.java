package com.frank.app.proyectoarchivocentral.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
@Setter
@Getter
@AllArgsConstructor
public class Authority implements GrantedAuthority {
    private Long id;
    private String authority;
    @Override
    public String getAuthority() {
        return this.authority;
    }
}
