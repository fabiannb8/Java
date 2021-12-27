/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.builder;

/**
 *
 * @author Next University
 */
public class ComputadorAMDBuilder extends ComputadorBuilder{

    @Override
    public void buildMarca() {
        computador.setMarca("AMD");
    }

    @Override
    public void buildProcesador() {
        computador.setProcesador("A10-6800K");
    }

    @Override
    public void buildRam() {
        computador.setRam(12);
    }
    
}
