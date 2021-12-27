/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author fabiannb8
 */
public class Alumno {
    private int codigo;
    private String nombre;
    private double nota1;
    private double nota2;
    private double nota3;
    private double notaFinal;

    public Alumno(int codigo, String nombre, double nota1, double nota2, double nota3) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(double notaFinal) {
        this.notaFinal = notaFinal;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
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

  
    @Override
    public String toString() {
        return nombre + " | Código:" + codigo + "\nnota1= " + nota1 + ", nota2= " + nota2 + ", nota3= " + nota3 + "\nNotaFinal= " + calcularNotaFinal()+"\n";
    }
    public double calcularNotaFinal(){
        double notaFinal=0;
        notaFinal = (nota1*0.3)+(nota2*0.3)+(nota3*0.4);
        return notaFinal;
    }
}
