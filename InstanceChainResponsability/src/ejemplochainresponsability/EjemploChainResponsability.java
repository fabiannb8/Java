/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplochainresponsability;

import javax.swing.JOptionPane;
import modelo.Restaurante;

/**
 *
 * @author fabiannb8
 */
public class EjemploChainResponsability {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String descripcion = JOptionPane.showInputDialog("Ingrese la petición");
       int tiempo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tiempo de espera de la petición"));
   
       Restaurante restaurante = new Restaurante();
       restaurante.peticion(descripcion, tiempo);
    }
    
}
