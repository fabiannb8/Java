/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import javax.swing.JOptionPane;
import modelo.builder.ComputadorAMDBuilder;
import modelo.builder.ComputadorIntelBuilder;
import modelo.builder.TiendaComputador;

/**
 *
 * @author Next University
 */
public class Actividad3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        TiendaComputador tienda = new TiendaComputador();
        tienda.setBuilder(new ComputadorIntelBuilder());
        tienda.construirComputador();
        JOptionPane.showMessageDialog(null, tienda.getComputador());
        tienda.setBuilder(new ComputadorAMDBuilder());
        tienda.construirComputador();
        JOptionPane.showMessageDialog(null, tienda.getComputador());
    }
    
}
