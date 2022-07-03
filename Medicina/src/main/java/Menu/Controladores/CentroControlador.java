package Menu.Controladores;

import Data.file.CentroDf;
import Modelos.CentroSalud;

import java.util.Scanner;

public class CentroControlador {
    public CentroSalud centroSalud;
    public CentroDf centroSaludDF = new CentroDf();

    //Metodo que crea un objeto centroSalud
    public CentroSalud centroCreado(){
        Scanner Entrada=new Scanner(System.in);
        String nombre,direccion,comuna,region,sistema;
        int telefono;
        System.out.println("Nombre:");
        nombre=Entrada.nextLine();
        System.out.println("Direccion");
        direccion=Entrada.nextLine();
        System.out.println("Comuna");
        comuna=Entrada.nextLine();
        System.out.println("Region");
        region=Entrada.nextLine();
        System.out.println("Sistema");
        sistema= Entrada.nextLine();
        System.out.println("Telefono");
        telefono=Integer.parseInt(Entrada.nextLine());
        return new CentroSalud(nombre,direccion,comuna,region,sistema,telefono);
    }

    //Metodo que agrega un objeto centroSalud
    public void generarCentro(){
        centroSalud = centroCreado();
        centroSaludDF.insertarCentro(centroSalud);
    }

    //Metodo que busca un centroSalud por su direccion
    public CentroSalud buscarCentro(String direccion){
        centroSalud = centroSaludDF.getCentro(direccion);
        return centroSalud;
    }

    //Metodo que imprime por consola un centroSalud
    public void imprimirCentro(){
        String direccion;
        Scanner Entrada=new Scanner(System.in);
        System.out.println("Ingrese la direccion");
        direccion= Entrada.nextLine();
        centroSalud = buscarCentro(direccion);
        if (centroSalud != null){
            System.out.println("Nombre: "+centroSalud.getNombre());
            System.out.println("Direccion: "+centroSalud.getDireccion());

        }
        else{
            System.out.println("No existe esta persona");
        }
    }

    //Metodo que elmina un objeto centroSalud
    public CentroSalud eliminarCentro(){
        String direccion;
        Scanner Entrada=new Scanner(System.in);
        System.out.println("Ingrese la direccion");
        direccion= Entrada.nextLine();
        centroSalud = buscarCentro(direccion);
        centroSaludDF.deleteCentro(centroSalud);
        return centroSalud;
    }
}
