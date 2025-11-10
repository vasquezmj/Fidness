package com.mycompany.fidness;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Usuario implements Serializable {
    private static final long serialVersionUID = 1L;

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
    //metodos de serializacion

    public static void agregarUsuarioArchivo(List<Usuario> usuarios) {
        try {
            FileOutputStream archivoUsuarios = new FileOutputStream("ListaUsuarios.extension");
            ObjectOutputStream output = new ObjectOutputStream(archivoUsuarios);
            output.writeObject(usuarios);
            output.close();
            archivoUsuarios.close();

        } catch (IOException ex) {
            System.out.println("Exception: " + ex.getMessage());
        }
    }

    public static List<Usuario> leerUsuarios() {
        List<Usuario> usuariosLeidos = new ArrayList<>();

        try {
            FileInputStream archivoUsuarios2 = new FileInputStream("ListaUsuarios.extension");
            ObjectInputStream input = new ObjectInputStream(archivoUsuarios2);
            usuariosLeidos = (List<Usuario>) input.readObject();
            System.out.println(usuariosLeidos.toString());
            input.close();
            archivoUsuarios2.close();
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println("Exception: " + ex.getMessage());
        } finally {
            return usuariosLeidos;
        }
    }
}
