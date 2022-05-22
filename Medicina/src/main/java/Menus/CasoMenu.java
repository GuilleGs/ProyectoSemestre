package Menus;

import Data.datafile.CasoDF;
import Data.datafile.PacienteDF;
import Modelos.Caso;
import Modelos.IDCaso;
import Modelos.Paciente;

import java.util.HashMap;
import java.util.Scanner;

public class CasoMenu {
    public Caso caso = new Caso();
    public CasoDF casoDF = new CasoDF();
    public Paciente paciente = new Paciente();
    public PacienteDF pacienteDF =new PacienteDF();
    public HashMap<IDCaso,Caso> map = new HashMap<>();
    public Paciente buscarpaciente(String rut){
        paciente = pacienteDF.getPaciente(rut);
        return paciente;
    }
    public Caso buscarCaso(String rut){
        IDCaso id=new IDCaso(rut);
        caso=casoDF.obtener(id);
        return caso;
    }
    public Caso casoCreado(){
        Scanner Entrada = new Scanner(System.in);
        String rut,caso;
        IDCaso id;
        Paciente paciente;
        System.out.println("Rut");
        rut= Entrada.nextLine();
        paciente=buscarpaciente(rut);
        if(paciente.getRut().equals(rut)){
            id=new IDCaso(rut);
            System.out.println("Ingrese el caso");
            caso= Entrada.nextLine();
            return new Caso(id,caso);
        }
        System.out.println("El paciente no esta ingresado");
        return null;
    }

    public void generarCaso() {
        Caso caso;
        caso = casoCreado();
        casoDF.insertarCaso(caso);
    }

    public void imprimirCaso(){
        String id;
        Scanner Entrada=new Scanner(System.in);
        System.out.println("Ingrese el rut del paciente");
        id= Entrada.nextLine();
        caso=buscarCaso(id);
        System.out.println(caso.getId());
    }

}

