package Main;


import Modelos.CentroSalud;
import Modelos.Paciente;
import Modelos.ProfesionalSalud;

import java.util.Scanner;

/**
 *
 * @author Guillermo González y Brayan Ocares
 */

public class main {
    public static Paciente pacientes =new Paciente();
    public static CentroSalud centros=new CentroSalud();
    public static ProfesionalSalud profesional=new ProfesionalSalud();

    public static void insertarDatos() {
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
                pacientes.InsertarDatos();
            }
            if (opt ==2){
                centros.InsertarDatos();
            }
            if (opt==3){
                profesional.IngresarDatos();
            }
            if (opt >3 || opt <0)
                System.out.println("Ingrese una opcion valida");
        } while (opt != 0);

    }
    public static void imprimirDatos() {
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
                pacientes.ImprimirDatos();
            }
            if (opt ==2){
                centros.imprimirDatos();
            }
            if (opt==3){
                profesional.imprimirDatos();
            }
            if (opt >3 || opt <0)
                System.out.println("Ingrese una opcion valida");
        } while (opt != 0);

    }
    public static void main(String[] args) {
        pacientes.InsertarDatosFake();
        centros.InsertarDatosFake();
        profesional.IngresarDatosFake();
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
