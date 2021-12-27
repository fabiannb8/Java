/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.adapter;

import javax.swing.JOptionPane;
import modelo.DiscoDuro;
import modelo.DiscoDuroPortatil;

/**
 *
 * @author Next University
 */
public class DiscoDuroPortatilAdapter extends DiscoDuro{
    
    private DiscoDuroPortatil discoDuro;

    public DiscoDuroPortatilAdapter() {
        this.discoDuro = new DiscoDuroPortatil();
    }

    @Override
    public String almacenar() {
        return discoDuro.conectarAlPuertoUSB() +"\n"+discoDuro.almacenarInfo();
    }

    @Override
    public String borrar() {;
        if (JOptionPane.showConfirmDialog(null, "¿Desea desconectar disco duro?") == 0) {
            return discoDuro.borrarInfo()+"\n"+discoDuro.desconectarDelPuertoUSB();
        }
        return discoDuro.borrarInfo();
    }
    
}
