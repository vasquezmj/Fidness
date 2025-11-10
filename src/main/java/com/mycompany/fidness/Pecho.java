package com.mycompany.fidness;

public class Pecho extends Ejercicio{
    
    private String zonaMuscular;

    public Pecho(String zonaMuscular, String nombre, String nivelDificultad, String equipoRequerido, int duracionMinutos) {
        super(nombre, nivelDificultad, equipoRequerido, duracionMinutos);
        this.zonaMuscular = "Pecho";
    }

    public String getZonaMuscular() {
        return zonaMuscular;
    }

    public void setZonaMuscular(String zonaMuscular) {
        this.zonaMuscular = zonaMuscular;
    }
    @Override
    public String detalles() {
        String base = super.detalles();
        return base + "\nZona muscular: " + zonaMuscular + "\nSeries sugeridas: " + cantidadNivel();
    }

    @Override
    public int calcularCaloriasQuemadas() {
        return cantidadNivel() * duracionMinutos;
    }

    @Override
    public String mostrarInstrucciones() {
        return "Instruciones aqui";
    
    }
    
    public int cantidadNivel(){
        String nivel = nivelDificultad;
        if (nivel.equalsIgnoreCase("Avanzado")) {
            return 10;    
        } else if (nivel.equalsIgnoreCase("Intermedio")) {
            return 6;
            
        } else {
            return 3;
        }
    }
}
