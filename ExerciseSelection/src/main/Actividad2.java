/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Estudiante;

/**
 *
 * @author Next University
 */
public class Actividad2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Estudiante> estudiantes = new ArrayList<>();
        int opcion = 0;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "***** Menu de opciones *****"
                    + "\n\n1.Agregar.\n2.Mostrar ascendentemente.\n3.Mostrar descendentemente.\n4.Salir."));
            
            switch (opcion) {
                case 1:
                    agregar(estudiantes);
                    break;
                case 2:
                    ordenar(estudiantes, true);
                    mostrar(estudiantes);
                    break;
                case 3:
                    ordenar(estudiantes, false);
                    mostrar(estudiantes);
                case 4:
                    JOptionPane.showMessageDialog(null, "Fin de la ejecucion...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion invalida");
            }
        } while (opcion != 4);
        
    }
    
    private static void agregar(ArrayList<Estudiante> lista){
        String codigo = JOptionPane.showInputDialog("Ingrese codigo del estudiante");
        String nombre = JOptionPane.showInputDialog("Ingrese nombre del estudiante");
        double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese primera nota del estudiante"));
        double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese segunda nota del estudiante"));
        double nota3 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese tercera nota del estudiante"));
        Estudiante e = new Estudiante(codigo, nombre, nota1, nota2, nota3);
        calcularNotaFinal(e);
        lista.add(e);
    }
    
    private static void mostrar(ArrayList<Estudiante> lista){
        String result="Lista de estudiantes\n\n";
        for (int i = 0; i < lista.size(); i++) {
            result += "Codigo: "+lista.get(i).getCodigo()+"  Nombre: "+lista.get(i).getNombre()
                    +"  Nota 1: "+lista.get(i).getNota1()+"  Nota 2: "+lista.get(i).getNota2()
                    +"  Nota 3: "+lista.get(i).getNota3()+"  Nota final: "+lista.get(i).getNotaFinal()+"\n";
        }
        JOptionPane.showMessageDialog(null, result);
    }
    
    private static void ordenar(ArrayList<Estudiante> lista, boolean orden){
        for (int i = 0 ; i < lista.size() - 1 ; i++) {
            int min = i;
            
            for (int j = i + 1 ; j < lista.size() ; j++) {
                if (orden) {
                    if (lista.get(j).getNotaFinal() < lista.get(min).getNotaFinal()) {
                        min = j;
                    }
                }else{
                    if (lista.get(j).getNotaFinal() > lista.get(min).getNotaFinal()) {
                        min = j;
                    }
                }
            }
 
            if (i != min) {
                Estudiante aux = lista.get(i);
                lista.set(i, lista.get(min));
                lista.set(min, aux);
            }
        }
    }
    
    private static void calcularNotaFinal(Estudiante e){
        e.setNotaFinal(e.getNota1()*0.3+e.getNota2()*0.3+e.getNota3()*0.4);
    }
}
