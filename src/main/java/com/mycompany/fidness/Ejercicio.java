package com.mycompany.fidness;

public abstract class Ejercicio {

    protected String nombre;
    protected String nivelDificultad; //Avanzado, Intermedio, Basico
    protected String equipoRequerido;
    protected int duracionMinutos;

    public Ejercicio(String nombre, String nivelDificultad, String equipoRequerido, int duracionMinutos) {
        this.nombre = nombre;
        this.nivelDificultad = nivelDificultad;
        this.equipoRequerido = equipoRequerido;
        this.duracionMinutos = duracionMinutos;
    }

    //metodos
    public String detalles() {
        return "Ejercicio: " + nombre + "\nNivel: " + nivelDificultad + "\nEquipo: " + equipoRequerido + "\nDuración: " + duracionMinutos;
    }

    public abstract int calcularCaloriasQuemadas();

    public abstract String mostrarInstrucciones();

    //Getter & Setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNivelDificultad() {
        return nivelDificultad;
    }

    public void setNivelDificultad(String nivelDificultad) {
        this.nivelDificultad = nivelDificultad;
    }

    public String getEquipoRequerido() {
        return equipoRequerido;
    }

    public void setEquipoRequerido(String equipoRequerido) {
        this.equipoRequerido = equipoRequerido;
    }

    public int getDuracionMinutos() {
        return duracionMinutos;
    }

    public void setDuracionMinutos(int duracionMinutos) {
        this.duracionMinutos = duracionMinutos;
    }

    @Override
    public String toString() {
        return nombre;
    }

}
