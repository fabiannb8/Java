/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.builder;

import modelo.Computador;

/**
 *
 * @author Next University
 */
public abstract class ComputadorBuilder {
    
    protected Computador computador;

    public Computador getComputador() {
        return computador;
    }
    
    public void crearComputador(){
        computador = new Computador();
    }
    
    public abstract void buildMarca();
    public abstract void buildProcesador();
    public abstract void buildRam();
}
