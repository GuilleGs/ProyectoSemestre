package Menu;

import Exceptions.LetraInvalida;
import Exceptions.NumeroInvalido;
import Menu.Menus.MenuCaso;
import Menu.Menus.MenuCentro;
import Menu.Menus.MenuPaciente;
import Menu.Menus.MenuProfesional;

import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws NumeroInvalido, LetraInvalida {
        MenuPaciente menuPaciente=new MenuPaciente();
        MenuCaso menuCaso=new MenuCaso();
        MenuProfesional menuProfesional=new MenuProfesional();
        MenuCentro menuCentro=new MenuCentro();
        int opt;
        Scanner entrada=new Scanner(System.in);
        try {
            do {
                System.out.println();
                System.out.println("    ----------- Menu -----------");
                System.out.println(" (1) -> Menu Paciente");
                System.out.println(" (2) -> Menu Caso");
                System.out.println(" (3) -> Menu Profesional Salud");
                System.out.println(" (4) -> Menu Centro Salud");
                System.out.println(" (0) -> Salir");
                opt = Integer.parseInt(entrada.nextLine());
                if (opt == 1){
                    menuPaciente.PacienteMenu();
                }
                if (opt ==2){
                    menuCaso.CasoMenu();
                }
                if (opt == 3){
                    menuProfesional.ProfecionalMenu();
                }
                if(opt==4){
                    menuCentro.CentroMenu();
                }

                if (opt > 4 || opt < 0){
                    throw new NumeroInvalido();
                }

            } while (opt != 0);
        }catch (NumberFormatException e){
                throw new LetraInvalida();
        }
    }
}
