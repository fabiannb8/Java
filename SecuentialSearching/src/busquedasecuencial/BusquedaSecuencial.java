/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busquedasecuencial;

import javax.swing.JOptionPane;

/**
 *
 * @author fabiannb8
 */
public class BusquedaSecuencial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int arreglo[]={3,7,5,4,9,2,8};
        int dato = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dato a buscar"));
        int busqueda = busquedaSecuencial(arreglo, dato);
        
        if (busqueda != -1) {
            JOptionPane.showMessageDialog(null, "El dato ha sido encontrado dentro del arreglo en la posición "+busqueda);
        }else{
             JOptionPane.showMessageDialog(null, "El dato no ha sido encontrado dentro del arreglo");
        }
    }
    
    public static int busquedaSecuencial(int arreglo[], int dato){
        for (int i = 0; i < arreglo.length; i++) {
            if (dato == arreglo[i]){
                return 1;
            }
        }
        return -1;
     }
}
