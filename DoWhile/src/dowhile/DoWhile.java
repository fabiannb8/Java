/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dowhile;

import javax.swing.JOptionPane;

/**
 *
 * @author fabiannb8
 */
public class DoWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opcion =0;
        
        do {    
            opcion= Integer.parseInt(JOptionPane.showInputDialog(null,"Menú de opciones \n 1. Opción 1 \n 2. Opción 2 \n 3. Opción 3 \n 0. Salir"));
            
            switch(opcion){
                case 1:
                    JOptionPane.showMessageDialog(null, "Selecionó la opción 1");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Selecionó la opción 2");
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Selecionó la opción 3");
                    break;
            }
        } while (opcion!=0);
    }
    
}
