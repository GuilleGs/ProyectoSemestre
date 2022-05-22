
package Menus;

/**
 *
 * @author Guillermo González y Brayan Ocares
 */

import java.util.Scanner;

public class MenuConsola {
    public static void insertarDatos() {
        PMenu menuPaciente=new PMenu();
        PFMenu menuProfesional=new PFMenu();
        CSMenu menuCentro=new CSMenu();
        CasoMenu casoMenu=new CasoMenu();
        int opt;
        Scanner entrada=new Scanner(System.in);
        do {
            System.out.println();
            System.out.println("    ----------- Menu -----------");
            System.out.println(" (1) -> Ingresar Paciente");
            System.out.println(" (2) -> Ingrese Centro de salud");
            System.out.println(" (3) -> Ingrese Profesional de la salud");
            System.out.println(" (4) -> Ingrese Caso");
            System.out.println(" (0) -> Salir");
            opt = Integer.parseInt(entrada.nextLine());
            if (opt == 1){
                menuPaciente.generarPaciente();
            }
            if (opt ==2){
               menuCentro.generarCentro();
            }
            if (opt==3){
                menuProfesional.generarProfesional();
            }
            if (opt==4){
                casoMenu.generarCaso();
            }
            if (opt >4 || opt <0)
                System.out.println("Ingrese una opcion valida");
        } while (opt != 0);

    }
    public static void imprimirDatos() {
        PMenu menu= new PMenu();
        PFMenu menuProfesional=new PFMenu();
        CSMenu menuCentro=new CSMenu();
        CasoMenu casoMenu=new CasoMenu();
        int opt;
        Scanner entrada=new Scanner(System.in);
        do {
            System.out.println();
            System.out.println("    ----------- Menu -----------");
            System.out.println(" (1) -> Imprimir Paciente");
            System.out.println(" (2) -> Imprimir Centro de salud");
            System.out.println(" (3) -> Imprimir Profesional de la salud");
            System.out.println(" (4) -> Imprimir Caso");
            System.out.println(" (0) -> Salir");
            opt = Integer.parseInt(entrada.nextLine());
            if (opt == 1){
                menu.imprimirPaciente();
            }
            if (opt ==2){
               menuCentro.imprimirCentro();
            }
            if (opt==3){
                menuProfesional.imprimirProfesional();
            }
            if (opt==4){
                casoMenu.imprimirCaso();
            }
            if (opt >3 || opt <0)
                System.out.println("Ingrese una opcion valida");
        } while (opt != 0);

    }

    public static void eliminarDatos() {
        PMenu menu= new PMenu();
        PFMenu menuProfesional=new PFMenu();
        CSMenu menuCentro=new CSMenu();
        int opt;
        Scanner entrada=new Scanner(System.in);
        do {
            System.out.println();
            System.out.println("    ----------- Menu -----------");
            System.out.println(" (1) -> Eliminar Paciente");
            System.out.println(" (2) -> Eliminar Centro de salud");
            System.out.println(" (3) -> Eliminar Profesional de la salud");
            System.out.println(" (0) -> Salir");
            opt = Integer.parseInt(entrada.nextLine());
            if (opt == 1){
                menu.eliminarPaciente();
            }
            if (opt ==2){
                menuCentro.eliminarCentro();
            }
            if (opt==3){
                menuProfesional.eliminarProfesional();
            }
            if (opt >3 || opt <0)
                System.out.println("Ingrese una opcion valida");
        } while (opt != 0);

    }
    public static void modificarDatos() {
        PMenu menu= new PMenu();
        PFMenu menuProfesional=new PFMenu();
        CSMenu menuCentro=new CSMenu();
        int opt;
        Scanner entrada=new Scanner(System.in);
        do {
            System.out.println();
            System.out.println("    ----------- Menu -----------");
            System.out.println(" (1) -> Modificar Paciente");
            System.out.println(" (2) -> Modificar Centro de salud");
            System.out.println(" (3) -> Modificar Profesional de la salud");
            System.out.println(" (0) -> Salir");
            opt = Integer.parseInt(entrada.nextLine());
            if (opt == 1){
                menu.modificarPaciente();
            }
            if (opt ==2){
                menuCentro.modificarCentro();
            }
            if (opt==3){
                menuProfesional.modificarProfesional();
            }
            if (opt >3 || opt <0)
                System.out.println("Ingrese una opcion valida");
        } while (opt != 0);

    }
    public static void buscarDatos() {
        PMenu menu= new PMenu();
        PFMenu menuProfesional=new PFMenu();
        CSMenu menuCentro=new CSMenu();
        int opt;
        Scanner entrada=new Scanner(System.in);
        do {
            System.out.println();
            System.out.println("    ----------- Menu -----------");
            System.out.println(" (1) -> Cantidad Centros de Salud por Sistema");
            System.out.println(" (2) -> Cantidad Centros de Salud por Region");
            System.out.println(" (3) -> Cantidad Profesionales de Salud por Profesion");
            System.out.println(" (0) -> Salir");
            opt = Integer.parseInt(entrada.nextLine());
            if (opt == 1){
                menuCentro.cantidadSistema();
            }
            if (opt ==2){
                menuCentro.cantidadRegion();
            }
            if (opt==3){
                //menuProfesional.eliminarProfesional();
            }
            if (opt >3 || opt <0)
                System.out.println("Ingrese una opcion valida");
        } while (opt != 0);

    }
    public static void main(String[] args){
        PMenu menu;
        int opt;
        Scanner entrada=new Scanner(System.in);
        do {
            System.out.println();
            System.out.println("    ----------- Menu -----------");
            System.out.println(" (1) -> Ingresar Datos");
            System.out.println(" (2) -> Imprimir Datos");
            System.out.println(" (3) -> Eliminar Datos");
            System.out.println(" (4) -> Modificar Datos");
            System.out.println(" (5) -> Buscar Datos");
            System.out.println(" (0) -> Salir");
            opt = Integer.parseInt(entrada.nextLine());
            if (opt == 1){
                insertarDatos();
            }
            if (opt ==2){
                imprimirDatos();
            }
            if (opt ==3){
                eliminarDatos();
            }
            if (opt ==4){
                modificarDatos();
            }
            if (opt==5){
                buscarDatos();
            }
            if (opt >5 || opt <0)
                System.out.println("Ingrese una opcion valida");
        } while (opt != 0);

    }
}

