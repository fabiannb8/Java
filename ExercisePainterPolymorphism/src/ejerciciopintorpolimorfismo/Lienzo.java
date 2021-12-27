/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciopintorpolimorfismo;

/**
 *
 * @author fabiannb8
 */
public class Lienzo extends AplicacionDeDibujo {
    private int alto;
    private int ancho;
    
    public void lienzoGrande(){
        alto=50;
        ancho=70;
        System.out.println("Estas utilizando un lienzo grande altura: "+alto+"cm"+" ancho: "+ancho+"cm");
    }
    public void lienzoPequeño(){
        alto=35;
        ancho=50;
        System.out.println("Estas utilizando un lienzo pequeño altura: "+alto+"cm"+" ancho: "+ancho+"cm");
    }
    
}
