package com.mycompany.fidness;

public class Usuario {
    private String nombreUsuario;
    private String contraseña;

    public Usuario(String nombreUsuario, String contraseña) {
        this.nombreUsuario = nombreUsuario;
        this.contraseña = contraseña;
    }
    
    public boolean validarContraseña(String contraseñaIngresada) {
        return this.contraseña != null && this.contraseña.equals(contraseñaIngresada);
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String nuevaContraseña) {
        this.contraseña = nuevaContraseña;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }
}
