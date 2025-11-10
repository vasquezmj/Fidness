package com.mycompany.fidness;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * Mauricio Vásquez loría
 */
public class Fidness {

    public static void main(String[] args) {

        try {
            List<Usuario> usuarios = new ArrayList<>();

            //usuarios precargados
            usuarios.add(new Usuario("admin", "1234"));
            usuarios.add(new Usuario("fatima", "abcd"));
            usuarios.add(new Usuario("mauricio", "5678"));

            Usuario.agregarUsuarioArchivo(usuarios);

            // Abrir GUI principal
            new GUI.InicioSesion().setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
