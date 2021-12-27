/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menuexcepciones;

import javax.swing.JOptionPane;

/**
 *
 * @author fabiannb8
 */
public class MenuExcepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        try {
        int opcion=0;
            do {                
                opcion=Integer.parseInt(JOptionPane.showInputDialog(null,"Menú de opciones \n1. Opción 1 \n2. Opción 2 \n3. Opción 3 \n0. Salir "));
                        
                switch(opcion){
                    case 1:
                        JOptionPane.showMessageDialog(null,"Seleccionaste la opción 1");
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null,"Seleccionaste la opción 2");
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null,"Seleccionaste la opción 3");
                        break;
                }
                        
            } while (opcion!=0);
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Error en el ingreso de datos");
        }catch (NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "Error el dato no es un número");
        }   
    }
}