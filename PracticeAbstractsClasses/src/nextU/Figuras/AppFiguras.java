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
public class AppFiguras {
    
    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo();
        triangulo.Area();
        triangulo.Perimetro();
        
        Cuadrado cuadrado = new Cuadrado();
        cuadrado.Area();
        cuadrado.Perimetro();
        
        Circulo circulo = new Circulo ();
        circulo.Area();
        circulo.Perimetro();
        
        TrianguloEquilatero trianguloEquilatero = new TrianguloEquilatero();
        trianguloEquilatero.Area();
        trianguloEquilatero.Perimetro();
        
    }
  
}
