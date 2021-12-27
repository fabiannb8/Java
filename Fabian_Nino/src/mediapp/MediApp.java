/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediapp;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.HistorialClinico;
import modelo.Medico;
import modelo.Paciente;

/**
 *
 * @author fabiannb8
 */
public class MediApp {

    private static String pacienteAModificar ;
    private static String medicoAModificar ;
    private static String historialAModificar ;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("**** Menú General ****"
                    + "\n\n1. Gestionar Pacientes \n2. Gestionar Médicos \n3. Gestionar Historial Clínico \n4. Salir"));
            switch (opcion) {
                case 1:
                    menuPacientes();
                    break;
                case 2:
                    menuMedicos();
                    break;
                case 3:
                    menuHistorialClinico();
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Saliendo del programa...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "La " + opcion +  " opción no existe");
            }
        } while (opcion != 4);
        
    }
         
    private static void menuPacientes() {
        ArrayList<Paciente> pacientes = new ArrayList<>();
        int opcion;
        do {opcion = Integer.parseInt(JOptionPane.showInputDialog("*** Menú Pacientes ***\n\n"
                + "1. Registra Paciente \n2. Mostrar Pacientes \n3. Modificar Paciente \n4. Eliminar Paciente \n5. Atrás"));
            switch (opcion) {
                case 1:
                    registrarPaciente(pacientes);
                    break;
                case 2:
                    mostrarPaciente(pacientes);
                    break;
                case 3:
                    modificarPaciente(pacientes);
                    break;
                case 4:
                    eliminarPaciente(pacientes);
                    break;
                case 5:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "La " + opcion +  " opción no existe");
            }
        } while (opcion != 5);
        
    }

    private static void menuMedicos() {
        ArrayList<Medico> medicos = new ArrayList();
        int opcion;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("*** Menú Médicos ***\n\n"
                    + "1. Registra Médico \n2. Mostrar Médicos \n3. Modificar Médico \n4. Eliminar Médico \n5. Atrás"));
            switch (opcion) {
                case 1:
                    registrarMedico(medicos);
                    break;
                case 2:
                    mostrarMedico(medicos);
                    break;
                case 3:
                    modificarMedico(medicos);
                    break;
                case 4:
                    eliminarMedico(medicos);
                    break;
                case 5:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "La " + opcion + " opción no existe");
            }
        } while (opcion != 5);
    }

    private static void menuHistorialClinico() {
        ArrayList<HistorialClinico> historialesClinicos = new ArrayList();
        int opcion;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("*** Menú Historial Clínico ***\n\n"
                    + "1. Registra Historial Clínico \n2. Mostrar los Historiales \n3. Modificar Historial Clínico \n4. Eliminar Historial Clínico \n5. Atrás"));
            switch (opcion) {
                case 1:
                    registrarHistorialClinico(historialesClinicos);
                    break;
                case 2:
                    mostrarHistorialClinico(historialesClinicos);
                    break;
                case 3:
                    modificarHistorialClinico(historialesClinicos);
                    break;
                case 4:
                    eliminarHistorialClinico(historialesClinicos);
                    break;
                case 5:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "La " + opcion + " opción no existe");
            }
        } while (opcion != 5);
    }

    private static void registrarPaciente(ArrayList<Paciente> pacientes) {
        String idPaciente = JOptionPane.showInputDialog("Ingrese el Id del nuevo paciente");
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del nuevo paciente");
        String apellido = JOptionPane.showInputDialog("Ingrese el apellido del nuevo paciente");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del nuevo paciente"));
        String genero = JOptionPane.showInputDialog("Ingrese el genero del nuevo paciente");
        Paciente p = new Paciente(idPaciente, nombre, apellido, edad, genero);
        pacientes.add(p);
    }

    private static void mostrarPaciente(ArrayList<Paciente> pacientes) {
        JOptionPane.showMessageDialog(null, imprimirPaciente(pacientes));
    }

    private static void modificarPaciente(ArrayList<Paciente> pacientes) {
        pacienteAModificar = JOptionPane.showInputDialog("Ingrese el Id del paciente a modificar");
        if (pacienteModificable(pacientes) >= 0) {
            System.out.println("El idPaciente a modificar es: " + pacienteModificable(pacientes));
            JOptionPane.showMessageDialog(null, "El paciente que vas a modificar es " + pacientes.get(pacienteModificable(pacientes)).getNombre()
            + " " + pacientes.get(pacienteModificable(pacientes)).getApellido());
            String idPaciente = pacienteAModificar;
            String nombre = JOptionPane.showInputDialog("Cambie el nombre del paciente");
            String apellido = JOptionPane.showInputDialog("Cambie el apellido del paciente");
            int edad = Integer.parseInt(JOptionPane.showInputDialog("Cambie la edad del paciente"));
            String genero = JOptionPane.showInputDialog("Cambie el genero del paciente");
            Paciente p = new Paciente(idPaciente, nombre, apellido, edad, genero);
            pacientes.set(pacienteModificable(pacientes), p);
            
        }else{
            JOptionPane.showMessageDialog(null, "El paciente no ha sido encontrado");
        }
        
    }

    private static void eliminarPaciente(ArrayList<Paciente> pacientes) {
        pacienteAModificar = JOptionPane.showInputDialog("Ingrese el Id del paciente a eliminar");
        if (pacienteModificable(pacientes)>=0) {
            int opcion = Integer.parseInt(JOptionPane.showInputDialog("Realemente desea eliminar a el paciente " + pacientes.get(pacienteModificable(pacientes)).getNombre()
            + " " + pacientes.get(pacienteModificable(pacientes)).getApellido()+ "\n\n1. Si \n2. No"));
            switch (opcion) {
                case 1:
                    pacientes.remove(pacienteModificable(pacientes));
                    JOptionPane.showMessageDialog(null, "El paciente se ha eliminado");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "El paciente no se ha eliminado");
                    menuPacientes();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "La " + opcion + " opción no existe");
            }
        }else{
            JOptionPane.showMessageDialog(null, "El paciente no ha sido encontrado");
        }
    }

    private static void registrarMedico(ArrayList<Medico> medicos) {
        String idMedico = JOptionPane.showInputDialog("Ingrese el Id del nuevo médico");
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del nuevo médico");
        String apellido = JOptionPane.showInputDialog("Ingrese el apellido del nuevo médico");
        String especialidad = JOptionPane.showInputDialog("Ingrese la especialidad del nuevo médico");
        Medico m = new Medico (idMedico, nombre, apellido, especialidad);
        medicos.add(m);
    }

    private static void mostrarMedico(ArrayList<Medico> medicos) {
        JOptionPane.showMessageDialog(null, imprimirMedico(medicos));
    }

    private static void modificarMedico(ArrayList<Medico> medicos) {
        medicoAModificar = JOptionPane.showInputDialog("Ingrese el Id del médico a modificar");
        if (medicoModificable(medicos) >= 0) {
            System.out.println("El idMedico a modificar es: " + medicoModificable(medicos));
            JOptionPane.showMessageDialog(null, "El médico que vas a modificar es " + medicos.get(medicoModificable(medicos)).getNombre()
                    + " " + medicos.get(medicoModificable(medicos)).getApellido());
            String idMedico = medicoAModificar;
            String nombre = JOptionPane.showInputDialog("Cambie el nombre del médico");
            String apellido = JOptionPane.showInputDialog("Cambie el apellido del médico");
            String especialidad = JOptionPane.showInputDialog("Cambie la especialidad del médico");
            Medico m = new Medico(idMedico, nombre, apellido, especialidad);
            medicos.set(medicoModificable(medicos), m);

        } else {
            JOptionPane.showMessageDialog(null, "El médico no ha sido encontrado");
        }
    }

    private static void eliminarMedico(ArrayList<Medico> medicos) {
        medicoAModificar = JOptionPane.showInputDialog("Ingrese el Id del médico a eliminar");
        if (medicoModificable(medicos) >= 0) {
            int opcion = Integer.parseInt(JOptionPane.showInputDialog("Realemente desea eliminar a el médico " + medicos.get(medicoModificable(medicos)).getNombre()
                    + " " + medicos.get(medicoModificable(medicos)).getApellido() + "\n\n1. Si \n2. No"));
            switch (opcion) {
                case 1:
                    medicos.remove(medicoModificable(medicos));
                    JOptionPane.showMessageDialog(null, "El médico se ha eliminado");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "El médico no se ha eliminado");
                    menuMedicos();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "La " + opcion + " opción no existe");
            }
        } else {
            JOptionPane.showMessageDialog(null, "El paciente no ha sido encontrado");
        }
    }

    private static void registrarHistorialClinico(ArrayList<HistorialClinico> historialesClinicos) {
        String codigo = "00"+String.valueOf(historialesClinicos.size()+1);
        String fecha = JOptionPane.showInputDialog("Ingrese la fecha del nuevo historial clínico");
        String idPaciente = JOptionPane.showInputDialog("Ingrese la identificación del paciente");
        String idMedico = JOptionPane.showInputDialog("Ingrese la identificación del médico");
        String observaciones = JOptionPane.showInputDialog("Observaciones del nuevo historial");
        HistorialClinico hc = new HistorialClinico(codigo, fecha, idPaciente, idMedico, observaciones);
        historialesClinicos.add(hc);
    }

    private static void mostrarHistorialClinico(ArrayList<HistorialClinico> historialesClinicos) {
        JOptionPane.showMessageDialog(null, imprimirHistorialClinico(historialesClinicos));
    }

    private static void modificarHistorialClinico(ArrayList<HistorialClinico> historialesClinicos) {
        historialAModificar = JOptionPane.showInputDialog("Ingrese el código del historial clínico a modificar");
        if (historialModificable(historialesClinicos) >= 0) {
            System.out.println("El código a modificar es: " + historialModificable(historialesClinicos));
            JOptionPane.showMessageDialog(null, "El historial que vas a modificar es " + historialesClinicos.get(historialModificable(historialesClinicos)).getCodigo());
            String codigo = historialAModificar;
            String fecha = JOptionPane.showInputDialog("Cambie la fecha del historial");
            String idPaciente = JOptionPane.showInputDialog("Cambie la identificación del paciente");
            String idMedico = JOptionPane.showInputDialog("Cambie la identificación del médico");
            String observaciones = JOptionPane.showInputDialog("Cambie las observaciones");
            HistorialClinico hc = new HistorialClinico(codigo, fecha, idPaciente, idMedico, observaciones);
            historialesClinicos.set(historialModificable(historialesClinicos), hc);

        } else {
            JOptionPane.showMessageDialog(null, "El historial no ha sido encontrado");
        }
    }

    private static void eliminarHistorialClinico(ArrayList<HistorialClinico> historialesClinicos) {
        historialAModificar = JOptionPane.showInputDialog("Ingrese el código del historial a eliminar");
        if (historialModificable(historialesClinicos) >= 0) {
            int opcion = Integer.parseInt(JOptionPane.showInputDialog("Realemente desea eliminar a el historial clínico: " + historialesClinicos.get(historialModificable(historialesClinicos)).getCodigo()
                    + "\n\n1. Si \n2. No"));
            switch (opcion) {
                case 1:
                    historialesClinicos.remove(historialModificable(historialesClinicos));
                    JOptionPane.showMessageDialog(null, "El historial se ha eliminado");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "El historial no se ha eliminado");
                    menuHistorialClinico();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "La " + opcion + " opción no existe");
            }
        } else {
            JOptionPane.showMessageDialog(null, "El historial clínico no ha sido encontrado");
        }
    }

    private static String imprimirPaciente(ArrayList<Paciente> pacientes) {
        String result ="";
        for (int i = 0; i < pacientes.size(); i++) {
            result += pacientes.get(i).toString();
        }
        return result;
    }
    private static String imprimirMedico(ArrayList<Medico> medicos) {
        String result ="";
        for (int i = 0; i < medicos.size(); i++) {
            result += medicos.get(i).toString();
        }
        return result;
    }
    private static String imprimirHistorialClinico(ArrayList<HistorialClinico> historialesClinicos) {
        String result ="";
        for (int i = 0; i < historialesClinicos.size(); i++) {
            result += historialesClinicos.get(i).toString();
        }
        return result;
    }

    private static int pacienteModificable(ArrayList<Paciente> pacientes) {
        for (int i = 0; i < pacientes.size(); i++) {
            if (pacientes.get(i).getIdPaciente().equals(pacienteAModificar)) {
               return i; 
            }
        }
        return -1;
        
    }
    private static int medicoModificable(ArrayList<Medico> medicos) {
        for (int i = 0; i < medicos.size(); i++) {
            if (medicos.get(i).getIdMedico().equals(medicoAModificar)) {
                return i;
            }
        }
        return -1;

    }
    private static int historialModificable(ArrayList<HistorialClinico> HistorialesClinicos) {
        for (int i = 0; i < HistorialesClinicos.size(); i++) {
            if (HistorialesClinicos.get(i).getCodigo().equals(historialAModificar)) {
                return i;
            }
        }
        return -1;

    }
}
