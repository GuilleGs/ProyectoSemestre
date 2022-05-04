/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Menus;

import Data.datafile.PacienteDF;
import Modelos.Paciente;
import java.util.Scanner;

/**
 *
 * @author ggonzalez
 */
public class PacienteMenu {
    public  Paciente paciente = new Paciente();
    public  PacienteDF pacienteDF = new PacienteDF();

    public Paciente pacientecreado(){
        Scanner Entrada=new Scanner(System.in);
        String rut,nombre,apPaterno,apMaterno,email,prevision;
        int edad;
        System.out.println("Rut");
        rut=Entrada.nextLine();
        System.out.println("Nombre:");
        nombre=Entrada.nextLine();
        System.out.println("Apellido Paterno");
        apPaterno=Entrada.nextLine();
        System.out.println("Apellido Materno");
        apMaterno=Entrada.nextLine();
        System.out.println("Edad");
        edad=Integer.parseInt(Entrada.nextLine());
        System.out.println("Correo");
        email=Entrada.nextLine();
        System.out.println("Prevision");
        prevision=Entrada.nextLine();
        return new Paciente(rut,nombre,apPaterno,apMaterno,edad,email,prevision);
    }
    public void generarPaciente(){
        Paciente paciente;
        paciente = pacientecreado();
        pacienteDF.insertarPaciente(paciente);
    }
    public Paciente buscarpaciente(String rut){
        paciente = pacienteDF.getPaciente(rut);
        return paciente;
    }
    public void imprimirPaciente(){
        String rut;
        Scanner Entrada=new Scanner(System.in);
        System.out.println("Ingrese el rut");
        rut= Entrada.nextLine();
        paciente = buscarpaciente(rut);
        if (paciente != null){
            System.out.println("Nombre: "+paciente.NombreCompleto());
            System.out.println("");
        }
        else{
            System.out.println("No existe esta persona");
        }
    }
    public Paciente eliminarPaciente(){
        String rut;
        Scanner Entrada=new Scanner(System.in);
        System.out.println("Ingrese el rut");
        rut= Entrada.nextLine();
        paciente = buscarpaciente(rut);
        pacienteDF.deletePaciente(paciente);
        return paciente;
    }
    public boolean modificarPaciente(){
        String rut;
        Scanner Entrada=new Scanner(System.in);
        System.out.println("Ingrese el rut");
        rut= Entrada.nextLine();
        paciente = buscarpaciente(rut);
        if (paciente == null)
            return false;
        else
            pacienteDF.updatePaciente(paciente);
            return true;
    }
}
