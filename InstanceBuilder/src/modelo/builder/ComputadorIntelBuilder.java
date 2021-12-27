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
public class ComputadorIntelBuilder extends ComputadorBuilder{

    @Override
    public void buildMarca() {
        computador.setMarca("Intel");
    }

    @Override
    public void buildProcesador() {
        computador.setProcesador("I7-4770K");
    }

    @Override
    public void buildRam() {
        computador.setRam(8);
    }
    
}
