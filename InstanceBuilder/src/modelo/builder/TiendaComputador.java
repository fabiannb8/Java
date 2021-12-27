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
public class TiendaComputador {
    
    private ComputadorBuilder builder;

    public void setBuilder(ComputadorBuilder builder) {
        this.builder = builder;
    }
    
    public Computador getComputador(){
        return builder.getComputador();
    }
    
    public void construirComputador(){
        builder.crearComputador();
        builder.buildMarca();
        builder.buildProcesador();
        builder.buildRam();
    }
}
