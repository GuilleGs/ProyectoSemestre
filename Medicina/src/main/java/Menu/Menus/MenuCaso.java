package Menu.Menus;

import Exceptions.LetraInvalida;
import Exceptions.NumeroInvalido;
import Menu.Controladores.CasoControlador;

import java.util.Scanner;

public class MenuCaso {
    public void CasoMenu() throws NumeroInvalido{
        CasoControlador casoControlador=new CasoControlador();
        int opt;
        Scanner entrada=new Scanner(System.in);
        try{
            do {
                System.out.println();
                System.out.println("    ----------- Menu -----------");
                System.out.println(" (1) -> Ingresar Caso");
                System.out.println(" (2) -> Mostrar Caso");
                System.out.println(" (3) -> Eliminar Caso");
                System.out.println(" (0) -> Salir");
                opt = Integer.parseInt(entrada.nextLine());
                if (opt == 1){
                    casoControlador.generarCaso();
                }
                if (opt ==2){
                casoControlador.ImprimrCasos();
                }
                if (opt >3 || opt <0)
                    throw new NumeroInvalido();
            } while (opt != 0);
        }catch (NumberFormatException e){
                throw new LetraInvalida();
                }
    }
}
