/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entradas;

import java.util.Scanner;

/**
 *
 * @author fabiannb8
 */
public class Entradas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese una palabra");
        String palabra=teclado.nextLine();
        
        System.out.println("Ingrese un numero entero");
        int entero=teclado.nextInt();
        
        System.out.println("Ingrese un decimal");
        double decimal=teclado.nextDouble();
        
        System.out.println("La palabra ingresada es "+palabra);
        System.out.println("La entero ingresada es "+entero);
        System.out.println("La decimal ingresada es "+decimal);
        
        teclado.close();
    }
    
}
