/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplolinkedlist;

import Modelo.Persona;
import java.util.LinkedList;
import javax.swing.JOptionPane;

/**
 *
 * @author fabiannb8
 */
public class EjemploLinkedList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedList<Persona> lista = new LinkedList<>();
        
        lista.add(new Persona("1","Pedro"));
        lista.add(new Persona("2","Juan"));
        lista.add(new Persona("3","Luis"));
        
        JOptionPane.showMessageDialog(null, imprimirLista(lista));
        
        lista.addFirst(new Persona ("4","Jorge"));
        
        JOptionPane.showMessageDialog(null, imprimirLista(lista));
        
        lista.removeFirst();
        
        JOptionPane.showMessageDialog(null, imprimirLista(lista));
        
        lista.addLast(new Persona("4", "Manuela"));
    }
    private static String imprimirLista(LinkedList<Persona> lista){
        String result ="";
        for (int i = 0; i < lista.size(); i++) {
            result += lista.get(i).toString();
        }
        
       return result;
    }
}
