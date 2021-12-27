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
public class Triangulo extends Figura{
    private int base=7;
    private int altura=3;
    private int lado1=5;
    private int lado2=8;

    @Override
    public void Area() {
        System.out.println("El área es "+((base*altura)/2)+"m2");
    }

    @Override
    public void Perimetro() {
        System.out.println("El perímetro es: "+(base+lado1+lado2));
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getLado1() {
        return lado1;
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public int getLado2() {
        return lado2;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }

    public Triangulo() {
        System.out.println("Esta figura es hija del triangulo");
    }
    
}
