/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author fabiannb8
 */
public class Pc {
    private String mac;
    private String procesador;
    private String ram;
    private String discoDuro;

    public Pc(String mac, String procesador, String ram, String discoDuro) {
        this.mac = mac;
        this.procesador = procesador;
        this.ram = ram;
        this.discoDuro = discoDuro;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getDiscoDuro() {
        return discoDuro;
    }

    public void setDiscoDuro(String discoDuro) {
        this.discoDuro = discoDuro;
    }

    @Override
    public String toString() {
        return "Pc [" + "mac: " + mac + ", procesador: " + procesador + ", ram: " + ram + ", discoDuro: " + discoDuro + "]\n";
    }

    
}
