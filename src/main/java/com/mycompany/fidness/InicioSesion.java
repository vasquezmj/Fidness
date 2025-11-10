package com.mycompany.fidness;

import java.util.List;

public class InicioSesion {

    private List<Usuario> usuarios;
    private Usuario usuarioAutenticado;

    public InicioSesion(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public boolean inicioSesion(String nombre, String contraseña) {
        usuarioAutenticado = null;
        for (int i = 0; i < usuarios.size(); i++) {
            Usuario u = usuarios.get(i);
            if (u.getNombreUsuario().equalsIgnoreCase(nombre) && u.validarContraseña(contraseña)) {
                usuarioAutenticado = u;
                return true;
            }
        }
        return false;
    }

    public void cerrarSesion() {
        usuarioAutenticado = null;
    }

    public Usuario buscarUsuario(String nombre) {
        for (int i = 0; i < usuarios.size(); i++) {
            Usuario u = usuarios.get(i);
            if (u.getNombreUsuario().equalsIgnoreCase(nombre)) {
                return u;
            }
        }
        return null;
    }

}
