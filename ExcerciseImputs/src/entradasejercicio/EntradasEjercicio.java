/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entradasejercicio;

import java.util.Scanner;

/**
 *
 * @author fabiannb8
 */
public class EntradasEjercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Tu nombre");
        String nombre = teclado.nextLine();
        
        System.out.println("Cédula");
        int cedula = teclado.nextInt();
        
        System.out.println("Estatura");
        double estatura = teclado.nextDouble();
        
        System.out.println("El nombre de el paciente es "+nombre);
        System.out.println("La cedula de el paciente es "+cedula);
        System.out.println("La estatura del paciente es " +estatura);
        
        teclado.close();
    }
    
}
