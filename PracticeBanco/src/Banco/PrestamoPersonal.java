/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco;

/**
 *
 * @author fabiannb8
 */
public class PrestamoPersonal implements PrestamoBancario{
    @Override
    public void Saldo() {
        System.out.println("Su saldo del prestamo es: "); 
    }

    @Override
    public void Pagar() {
        System.out.println("Valor a pagar: ");
    }
}
