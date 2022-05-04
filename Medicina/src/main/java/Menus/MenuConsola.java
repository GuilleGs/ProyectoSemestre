
package Menus;

import Data.PacienteDF;
import Modelos.Paciente;

import java.util.Scanner;

/**
 *
 * @author ggonzalez
 */
//Metodo

public class MenuConsola {
    public static Paciente paciente = new Paciente();
    public static PacienteDF pacienteDF = new PacienteDF();
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
        Paciente paciente;
        System.out.println("Ingrese el rut");
        rut= Entrada.nextLine();
        paciente = buscarpaciente(rut);
        if (paciente != null){
            System.out.println("Nombre"+paciente.NombreCompleto());
        }
        else{
            System.out.println("No existe esta persona");
        }
    }
    public static void insertarDatos() {
        MenuConsola menu = new MenuConsola();
        int opt;
        Scanner entrada=new Scanner(System.in);
        do {
            System.out.println();
            System.out.println("    ----------- Menu -----------");
            System.out.println(" (1) -> Ingresar Paciente");
            System.out.println(" (2) -> Ingrese Centro de salud");
            System.out.println(" (3) -> Ingrese Profesional de la salud");
            System.out.println(" (0) -> Salir");
            opt = Integer.parseInt(entrada.nextLine());
            if (opt == 1){
                menu.generarPaciente();
            }
            if (opt ==2){
               // centros.InsertarDatos();
            }
            if (opt==3){
               // profesional.IngresarDatos();
            }
            if (opt >3 || opt <0)
                System.out.println("Ingrese una opcion valida");
        } while (opt != 0);

    }
    public static void imprimirDatos() {
        MenuConsola menu = new MenuConsola();
        int opt;
        Scanner entrada=new Scanner(System.in);
        do {
            System.out.println();
            System.out.println("    ----------- Menu -----------");
            System.out.println(" (1) -> Imprimir Paciente");
            System.out.println(" (2) -> Imprimir Centro de salud");
            System.out.println(" (3) -> Imprimir Profesional de la salud");
            System.out.println(" (0) -> Salir");
            opt = Integer.parseInt(entrada.nextLine());
            if (opt == 1){
                menu.imprimirPaciente();
            }
            if (opt ==2){
               // centros.imprimirDatos();
            }
            if (opt==3){
                //profesional.imprimirDatos();
            }
            if (opt >3 || opt <0)
                System.out.println("Ingrese una opcion valida");
        } while (opt != 0);

    }
    public static void main(String[] args){
        int opt;
        Scanner entrada=new Scanner(System.in);
        do {
            System.out.println();
            System.out.println("    ----------- Menu -----------");
            System.out.println(" (1) -> Ingresar Datos");
            System.out.println(" (2) -> Imprimir Datos");
            System.out.println(" (0) -> Salir");
            opt = Integer.parseInt(entrada.nextLine());
            if (opt == 1){
                insertarDatos();
            }
            if (opt ==2){
                imprimirDatos();
            }
            if (opt >2 || opt <0)
                System.out.println("Ingrese una opcion valida");
        } while (opt != 0);

    }
}

