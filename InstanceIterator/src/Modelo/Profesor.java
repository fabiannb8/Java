/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author fabiannb8
 */
public class Profesor {
    private String nombre;
    private int identificacion;
    private String asignaturas;

    public Profesor(String nombre, int identificacion, String asignaturas) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.asignaturas = asignaturas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public String getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(String asignaturas) {
        this.asignaturas = asignaturas;
    }

    @Override
    public String toString() {
        return "Profesor: " + nombre + ", identificacion: " + identificacion + "\nAsignaturas: " + asignaturas + "\n\n";
    }
    
    
}
