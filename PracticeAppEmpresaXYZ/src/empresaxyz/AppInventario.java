/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresaxyz;

import java.util.LinkedList;
import javax.swing.JOptionPane;
import modelo.Pc;

/**
 *
 * @author fabiannb8
 */
public class AppInventario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList<Pc> inventarioXYZ = new LinkedList<>();
        
        inventarioXYZ.add(new Pc("65684asd6f4", "Core i3", "8Gb", "512Gb"));
        inventarioXYZ.add(new Pc("545sdf45s", "Core i3", "32Gb", "1Tb"));
        inventarioXYZ.add(new Pc("75s5d45s4f", "Core i3", "8Gb", "2Tb"));
        inventarioXYZ.add(new Pc("75sf4s12df", "Core i3", "16Gb", "1Tb"));
        
        JOptionPane.showMessageDialog(null, imprimirInventario(inventarioXYZ));
        
        inventarioXYZ.remove(Integer.parseInt(JOptionPane.showInputDialog("Ingrresa numero del PC a remover")));
        
        JOptionPane.showMessageDialog(null, imprimirInventario(inventarioXYZ));
        
        inventarioXYZ.addFirst(new Pc(JOptionPane.showInputDialog("MAC del nuevo PC"),JOptionPane.showInputDialog("Procesador del nuevo PC"),JOptionPane.showInputDialog("RAM del nuevo PC"),JOptionPane.showInputDialog("Disco Duro del nuevo PC")));
        
        JOptionPane.showMessageDialog(null, imprimirInventario(inventarioXYZ));
    }

    private static String imprimirInventario(LinkedList<Pc> inventarioXYZ) {
        String result = "";
        for (int i = 0; i < inventarioXYZ.size(); i++) {
            result += i+" "+inventarioXYZ.get(i).toString();
            
        }
        return result;
    }
}
