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
public class HistorialClinico extends Persona{
    String codigo;
    String fecha;
    String observaciones;

    public HistorialClinico(String codigo, String fecha, String idPaciente, String idMedico, String observaciones) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.idPaciente = idPaciente;
        this.idMedico = idMedico;
        this.observaciones = observaciones;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(String idPaciente) {
        this.idPaciente = idPaciente;
    }

    public String getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(String idMedico) {
        this.idMedico = idMedico;
    }

    @Override
    public String toString() {
        return "Historial Clinico: " +  codigo + "      fecha: " + fecha 
                +"\nId Paciente: "  + idPaciente + "        Id Médico: " + idMedico + 
                "\nObservaciones: " + observaciones + "\n\n";
    }
    
    
}
