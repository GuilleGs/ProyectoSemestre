package Menu.Menus;

import Exceptions.LetraInvalida;
import Exceptions.NumeroInvalido;
import Menu.Controladores.CentroControlador;
import Menu.Controladores.UsuarioControlador;

import java.util.Scanner;

public class MenuCentro {
    public void CentroMenu() throws NumeroInvalido{
        CentroControlador centroControlador = new CentroControlador();
        int opt;
        Scanner entrada=new Scanner(System.in);
        try{
            do {
                System.out.println();
                System.out.println("    ----------- Menu -----------");
                System.out.println(" (1) -> Ingresar Centro");
                System.out.println(" (2) -> Mostrar Centro");
                System.out.println(" (3) -> Eliminar Centro");
                System.out.println(" (0) -> Salir");
                opt = Integer.parseInt(entrada.nextLine());
                if (opt == 1){
                    centroControlador.generarCentro();
                }
                if (opt ==2){
                    centroControlador.imprimirCentro();
                }
                if (opt==3){
                    centroControlador.eliminarCentro();
                }
                if (opt > 3|| opt < 0)
                    throw new NumeroInvalido();
            } while (opt != 0);
        }catch (NumberFormatException e){
                throw new LetraInvalida();
        }
    }
}