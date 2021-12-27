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
public class Circulo extends Figura{
    
    private int radio=11;
    private double phi=3.1416;

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    @Override
    public void Area() {
        System.out.println("El área del circulo es: "+((radio*radio)*phi)+"m2");
    }

    @Override
    public void Perimetro() {
        System.out.println("El perímetro del circulo es: "+((radio*2)*phi));
    }
    
}
