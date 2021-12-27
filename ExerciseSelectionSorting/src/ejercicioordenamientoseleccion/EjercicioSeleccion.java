/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioordenamientoseleccion;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Alumno;

/**
 *
 * @author fabiannb8
 */
public class EjercicioSeleccion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Alumno> lista = new ArrayList<>();
        imprimirLista(lista);
        
        lista.add(new Alumno(5642,"Juan",4.2,3.5,3.5));
        lista.add(new Alumno(4585,"Pedro",3.1,2.5,4.1));
        lista.add(new Alumno(1238,"Luis",1.2,4.5,2.5));
        lista.add(new Alumno(4812,"Maria",4.8,3.9,3.3));
        
        JOptionPane.showMessageDialog(null, lista);
    }
    private static String imprimirLista(ArrayList<Alumno>lista){
       String result ="";
        for (int i = 0; i < lista.size(); i++) {
           result += lista.get(i).toString();
        }
        return result;
    }
    private static void ordenarLista(ArrayList<Alumno> lista) {
        for (int i = 0; i < lista.size(); i++) {
            int minimo = i;
            for (int j = i+1 ; j < lista.size(); j++) {
                if(lista.get(j).getNotaFinal() < lista.get(minimo).getNotaFinal()){
                    minimo = j;
                }
                if (i != minimo) {
                    double aux = lista.get(i).getNotaFinal();
                    lista.get(i).setNotaFinal(lista.get(minimo).getNotaFinal());
                    lista.get(minimo).setNotaFinal(aux);
                }
         }
      }
    }
}
