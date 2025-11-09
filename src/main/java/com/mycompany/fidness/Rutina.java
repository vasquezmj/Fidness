package com.mycompany.fidness;

import java.util.ArrayList;
import java.util.List;

public class Rutina implements IExportar {

    private int idRutina;
    private String nombre;
    private List<Ejercicio> listaEjercicios;
    private int duracionTotal;
    private String nivel;

    public Rutina(int idRutina, String nombre, String nivel) {
        this.idRutina = idRutina;
        this.nombre = nombre;
        this.nivel = nivel;
        this.listaEjercicios = new ArrayList<Ejercicio>();
        this.duracionTotal = 0;
    }

    public void agregarEjercicio(Ejercicio e) {
        if (e == null) {
            return;
        }
        listaEjercicios.add(e);
        calcularDuracion();
    }

    public void eliminarEjercicio() {
        if (!listaEjercicios.isEmpty()) {
            listaEjercicios.remove(listaEjercicios.size() - 1); //se elimina el ultimo
            calcularDuracion();
        }
    }

    public void calcularDuracion() {
        int suma = 0;
        for (int i = 0; i < listaEjercicios.size(); i++) {
            suma += listaEjercicios.get(i).duracionMinutos;
        }
        duracionTotal = suma;
    }

    public String mostrarRutina() {
        String mensaje = "Rutina #" + idRutina + " - " + nombre + " (Nivel: " + nivel + ")\n";
        for (int i = 0; i < listaEjercicios.size(); i++) {
            Ejercicio e = listaEjercicios.get(i);
            mensaje += (i + 1) + ". " + e.nombre + " - " + e.detalles()
                    + "\n   Kcal: " + e.calcularCaloriasQuemadas() + "\n";
        }
        mensaje += "Duración total: " + duracionTotal + " min\n";
        return mensaje;
    }

    // Exportar
    public String exportarPDF() {
        return "Exportar PDF: " + nombre;
    }

    public String exportarPNG() {
        return "Exportar PNG: " + nombre;
    }
}
