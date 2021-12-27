/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioswitch;

import javax.swing.JOptionPane;

/**
 *
 * @author fabiannb8
 */
public class EjercicioSwitch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int a = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el primer número"));
        int b = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el segundo número"));
        
        int operacion = Integer.parseInt(JOptionPane.showInputDialog(null, "Seleccione que desea hacer: \n 1. Ver el número mayor \n 2. Ver la suma de los dos números \n 3. Ver la resta de los dos números"));
        
        switch (operacion){
            case 1:
                if (a>b){
                    JOptionPane.showMessageDialog(null,"El número mayor es "+a);
                }else if (a<b){
                    JOptionPane.showMessageDialog(null,"El número menor es "+b);
                }else{
                   JOptionPane.showMessageDialog(null,"Los numero son iguales");
                }
                break;
            case 2:
                JOptionPane.showMessageDialog(null,"La suma de los dos números es "+(a+b));
                break;
            case 3:
                JOptionPane.showMessageDialog(null,"La resta de los dos números es"+(a-b));
                break;
            default:
                JOptionPane.showMessageDialog(null, "Esta no es una opción disponible");
        }
    }
    
}
