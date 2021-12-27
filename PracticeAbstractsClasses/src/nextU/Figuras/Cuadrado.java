/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NextU.Figuras;

/**
 *
 * @author fabiannb8
 */
public class Cuadrado extends Figura{
    private int lado=9;

    @Override
    public void Area() {
        System.out.println("El área del cuadrado es: "+(lado*lado)+"m2");
    }

    @Override
    public void Perimetro() {
        System.out.println("El perímetro del cuadrado es: "+(lado*4));
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }
    
}
