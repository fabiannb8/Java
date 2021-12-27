/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioarraybidimencional;

import java.util.Arrays;
import javax.swing.JOptionPane;


/**
 *
 * @author fabiannb8
 */
public class EjercicioArrayBidimencional {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[][] arrayA = new int[2][3];
        
        for (int a = 0; a < arrayA.length; a++) {
            for (int aa = 0; aa < arrayA[0].length; aa++) {
                arrayA[a][aa]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor para los valores de A: "+a+" - "+aa));
            }
        }
        JOptionPane.showMessageDialog(null, "Arreglo A= \n"+imprimirArrayA(arrayA));
        
         int[][] arrayB = new int[2][3];
        
        for (int i = 0; i < arrayB.length; i++) {
            for (int j = 0; j < arrayB[0].length; j++) {
                arrayB[i][j]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor para los valores de B: "+i+" - "+j));
            }
        }
        JOptionPane.showMessageDialog(null, "Arreglo B= \n"+imprimirArrayB(arrayB));
        
        int[][] arrayC = new int [2][3];
        
        for (int i = 0; i < arrayC.length; i++) {
            for (int j = 0; j < arrayC[0].length; j++) {
                arrayC[i][j]= arrayA[i][j]+arrayB[i][j];
            }
        }
        JOptionPane.showMessageDialog(null, "La suma del arreglo A + B = \n"+imprimirArrayA(arrayA)+"+\n"+imprimirArrayB(arrayB)+"=\n"+imprimirArrayC(arrayC));
    }
    public static String imprimirArrayA(int arrayA[][]){
        String result = "";
        for (int i = 0; i < arrayA.length; i++) {
            result += Arrays.toString(arrayA[i])+"\n";
        }
        return result;
    }
    public static String imprimirArrayB(int arrayB[][]){
        String result = "";
        for (int i = 0; i < arrayB.length; i++) {
            result += Arrays.toString(arrayB[i])+"\n";
        }
        return result;
    }
    public static String imprimirArrayC(int arrayC[][]){
        String result = "";
        for (int i = 0; i < arrayC.length; i++) {
            result += Arrays.toString(arrayC[i])+"\n";
        }
        return result;
    }
}
