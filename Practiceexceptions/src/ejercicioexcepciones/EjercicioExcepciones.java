/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioexcepciones;

import javax.swing.JOptionPane;

/**
 *
 * @author fabiannb8
 */
public class EjercicioExcepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    int valor1=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el valor 1"));
    int valor2=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el valor 2"));
    int opcion=0;
    
        try {
            do {            
           opcion=Integer.parseInt(JOptionPane.showInputDialog(null,"Seleccione una opción:\n1. Sumar \n 2.Restar \n0. Salir"));
           switch(opcion){
               case 1:
                   JOptionPane.showMessageDialog(null,(valor1+valor2));
                   break;
                   
               case 2:
                   JOptionPane.showMessageDialog(null,(valor1-valor2));
                   break;
           }
        } while (opcion!=0);
            
        } catch (NullPointerException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null,"El valor no es un número o no corresponde al del menú");
        }
    }
    
}
