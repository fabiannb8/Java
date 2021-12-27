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
public class CuentaAhorro implements CuentaBancaria{

    @Override
    public void Saldo() {
        System.out.println("Su saldo es: "); 
    }

    @Override
    public void Pagar() {
        System.out.println("Pagar a: ");
    }

    @Override
    public void Depositar() {
        System.out.println("Depositar en: ");
    }

    @Override
    public void Retirar() {
        System.out.println("Cantidad a retirar: ");
    }
    
}
