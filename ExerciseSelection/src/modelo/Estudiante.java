/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Next University
 */
public class Estudiante {
    
    private String codigo;
    private String nombre;
    private double nota1;
    private double nota2;
    private double nota3;
    private double notaFinal;

    public Estudiante(String codigo, String nombre, double nota1, double nota2, double nota3) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(double notaFinal) {
        this.notaFinal = notaFinal;
    }

    @Override
    public String toString() {
        //return "Codigo: "+codigo+"\nNombre: "+nombre+"\nNota 1: "+nota1+"\nNota 2: "+nota2
                //+"\nNota 3: "+nota3+"\nNota final: "+notaFinal+"\n\n";
                return notaFinal+" ";
    }
    
    
}
