/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioedaddeporte;

import javax.swing.JOptionPane;

/**
 *
 * @author fabiannb8
 */
public class EjercicioEdadDeporte {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double estatura=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingresa la estatura"));
        int edad=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa la edad"));
        
        if(estatura>2){
            if (edad>18) {
                JOptionPane.showMessageDialog(null,"Puedes jugar baloncesto, voleibol y futbol");
            }else if(edad<18){
                 JOptionPane.showMessageDialog(null,"Puedes jugar  voleibol y futbol");
                
            }
        }else if(estatura<2){
            if (edad<18) {
                 JOptionPane.showMessageDialog(null,"Puedes jugar  futbol");
            }
        
    }
    
}
}