package com.mycompany.fidness;

public class Tutorial {

    private int idTutorial;
    private String titulo;
    private String descripcion;
    private String videoURL;
    private Ejercicio ejercicioAsociado;

    // Constructor
    public Tutorial(int idTutorial, String titulo, String descripcion, String videoURL, Ejercicio ejercicioAsociado) {
        this.idTutorial = idTutorial;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.videoURL = videoURL;
        this.ejercicioAsociado = ejercicioAsociado;
    }

    // Métodos
    public String reproducir() {
        return "Reproduce: " + videoURL;
    }

    public String mostrarDetalles() {
        String nombreEjercicio;
        if (ejercicioAsociado != null) {
            nombreEjercicio = ejercicioAsociado.nombre;
        } else {
            nombreEjercicio = "Ninguno";
        }

        return "Tutorial #" + idTutorial + " - " + titulo + "\n" + descripcion + "\n" + "Ejercicio: " + nombreEjercicio;
    }


    public Ejercicio EjercicioAsociado() {
        return ejercicioAsociado;
    }
}
