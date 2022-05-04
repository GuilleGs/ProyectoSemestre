
package Menus;

import Modelos.Paciente;

import java.util.Scanner;

/**
 *
 * @author ggonzalez
 */
//Metodo

public class MenuConsola {
    public static void insertarDatos() {
        PacienteMenu menuPaciente=new PacienteMenu();
        PFMenu menuProfesional=new PFMenu();
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
                menuPaciente.generarPaciente();
            }
            if (opt ==2){
               // centros.InsertarDatos();
            }
            if (opt==3){
                menuProfesional.generarProfesional();
            }
            if (opt >3 || opt <0)
                System.out.println("Ingrese una opcion valida");
        } while (opt != 0);

    }
    public static void imprimirDatos() {
        PacienteMenu menu= new PacienteMenu();
        PFMenu menuProfesional=new PFMenu();
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
                menuProfesional.imprimirProfesional();
            }
            if (opt >3 || opt <0)
                System.out.println("Ingrese una opcion valida");
        } while (opt != 0);

    }
    public static void main(String[] args){
        PacienteMenu menu;
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

