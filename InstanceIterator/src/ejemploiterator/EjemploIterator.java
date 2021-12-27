/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploiterator;

import Modelo.Profesor;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author fabiannb8
 */
public class EjemploIterator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Profesor> profesores = new ArrayList<>();
        int opcion = 0;
        
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("**** Menú de opciones ****"
                    + "\n\n 1. Agregar profesor\n2. Ver profesores\n3. Salir"));
            switch (opcion) {
                case 1:
                    agregar(profesores);
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, imprimir(profesores));
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "La aplicación ha terminado");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no valida");
            }
        } while (opcion != 3);
        
       
    }

    private static void agregar(ArrayList<Profesor> profesores) {
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del profesor");
        int identificacion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese identificación del profesor"));
        String asignaturas = JOptionPane.showInputDialog("Ingrese las asignaturas del profesor");
        Profesor p = new Profesor(nombre, identificacion, asignaturas);
        profesores.add(p);
    }

    private static String imprimir(ArrayList<Profesor> profesores) {
        String result ="";
        for(Profesor item:profesores){
            result += item.toString();
        }
        return result;
    }
    
}
