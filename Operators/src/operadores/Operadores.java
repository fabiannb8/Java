/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadores;

/**
 *
 * @author fabiannb8
 */
public class Operadores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a =6;
        int b =4;
        
        System.out.println("Esta es la suma "+(a+b));
        System.out.println("Esta es la resta "+(a-b));
        System.out.println("Esta es la multiplicación "+ a*b);
        System.out.println("Esta es la divición "+a/b);
        System.out.println("Este es el módulo "+a%b);
        
        a+=4; //a=a+4
        b-=2; //b=b-2
        
        System.out.println("El resultado final del operador += es "+a +"\nEl resultado final del operador -= "+b);
        
        boolean x=5<4;
        System.out.println("La operación boolean X es: "+x);
        
        boolean y=6<=6;
        System.out.println("El boolean de Y es: "+y);
        
        boolean z=(5<6 && 4<5);
        System.out.println("El resultado del boolean Z es: "+z);
        
        boolean r=(5<6 || 8>10);
        System.out.println("El resultado de R es"+r);
        
        boolean s=(x && y);
        System.out.println("El resultado de S es: "+s);
    }
    
}
