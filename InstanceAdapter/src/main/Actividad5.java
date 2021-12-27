/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import javax.swing.JOptionPane;
import modelo.DiscoDuro;
import modelo.DiscoDuroATA;
import modelo.DiscoDuroSATA;
import modelo.adapter.DiscoDuroPortatilAdapter;

/**
 *
 * @author Next University
 */
public class Actividad5 {

    /**
     * @param args the command line arguments
     */
    private static DiscoDuro discoDuro;
    
    public static void usarDiscoDuro(){
        JOptionPane.showMessageDialog(null, discoDuro.almacenar()+"\n"+discoDuro.borrar());
    }
    
    public static void main(String[] args) {
        
        int opcion = 0;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("***** Menu principal *****"
                    + "\n\n1.Disco duro ATA.\n2.Disco duro SATA.\n3.Disco duro portatil.\n4.Salir."));
            
            switch (opcion) {
                case 1:
                    discoDuro = new DiscoDuroATA();
                    usarDiscoDuro();
                    break;
                case 2:
                    discoDuro = new DiscoDuroSATA();
                    usarDiscoDuro();
                    break;
                case 3:
                    discoDuro = new DiscoDuroPortatilAdapter();
                    usarDiscoDuro();
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Fin de la ejecucion...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion invalida.");
            }
            
        } while (opcion != 4);
        
    }
    
}
