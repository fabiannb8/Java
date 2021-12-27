/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglobidimencional;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author fabiannb8
 */
public class ArregloBidimencional {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int arreglo[][] = new int [2][3];
        
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo[0].length; j++) {
                arreglo[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor para el elemento "+i+"-"+j));
            }
        }
        JOptionPane.showMessageDialog(null, imprimirArregloB(arreglo));
    }
    private static String imprimirArregloB (int arreglo[][]){
        String result = "";
        for (int i = 0; i < arreglo.length; i++) {
            result += Arrays.toString(arreglo[i])+"\n";
        }
        return result;
    }
    
}
