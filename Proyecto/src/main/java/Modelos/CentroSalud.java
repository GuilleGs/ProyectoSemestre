/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Guillermo González y Brayan Ocares
 */
public class CentroSalud {
    //Atributos
    private String NombreCentro,PrevisionCentro,DireccionCentro,Region,Comuna,TelefonoCentro;
    private ArrayList<CentroSalud> LCentros=new ArrayList<CentroSalud>();

    //Constructore
    public CentroSalud(){

    }

    public CentroSalud(String nombreCentro, String previsionCentro, String direccionCentro, String region, String comuna, String telefonoCentro) {
        this.NombreCentro = nombreCentro;
        this.PrevisionCentro = previsionCentro;
        this.DireccionCentro = direccionCentro;
        this.Region = region;
        this.Comuna = comuna;
        this.TelefonoCentro = telefonoCentro;
    }


    //Getter y Setters

    public String getNombreCentro() {
        return NombreCentro;
    }

    public void setNombreCentro(String NombreCentro) {
        this.NombreCentro = NombreCentro;
    }

    public String getPrevisionCentro() {
        return PrevisionCentro;
    }

    public void setPrevisionCentro(String PrevisionCentro) {
        this.PrevisionCentro = PrevisionCentro;
    }

    public String getDireccionCentro() {
        return DireccionCentro;
    }

    public void setDireccionCentro(String DireccionCentro) {
        this.DireccionCentro = DireccionCentro;
    }

    public String getRegion() {
        return Region;
    }

    public void setRegion(String Region) {
        this.Region = Region;
    }

    public String getComuna() {
        return Comuna;
    }

    public void setComuna(String Comuna) {
        this.Comuna = Comuna;
    }

    public String getTelefonoCentro() {
        return TelefonoCentro;
    }

    public void setTelefonoCentro(String TelefonoCentro) {
        this.TelefonoCentro = TelefonoCentro;
    }
    
    //Metodos
    public void InsertarDatos(){
        Scanner Entrada=new Scanner(System.in);
        String Nombre,Prevision,Direccion,region,comuna,telefono;

        System.out.println("Nombre:");
        Nombre=Entrada.nextLine();
        System.out.println("Prevision");
        Prevision=Entrada.nextLine();
        System.out.println("Direccion");
        Direccion=Entrada.nextLine();
        System.out.println("Region");
        region=Entrada.nextLine();
        System.out.println("Comuna");
        comuna=Entrada.nextLine();
        System.out.println("Telefono (9xxxxxxxx)");
        telefono=Entrada.nextLine();
        CentroSalud centro=new CentroSalud(Nombre,Prevision,Direccion,region,comuna,telefono);
        LCentros.add(centro);
    }
    public void InsertarDatosFake(){
        Scanner Entrada=new Scanner(System.in);
        String Nombre,Prevision,Direccion,region,comuna,telefono;

        Nombre="Hospital Van Buren";
        Prevision="Fonasa";
        Direccion="Avenida Argentina";
        region="Valparaiso";
        comuna="Valparaiso";
        telefono="945215876";
        CentroSalud centro=new CentroSalud(Nombre,Prevision,Direccion,region,comuna,telefono);
        LCentros.add(centro);
    }
    public void InsetarDatos(CentroSalud centroSalud){
        LCentros.add(centroSalud);
    }

    public void imprimirDatos(){
        for(int i=0;i<LCentros.size();i++){
            System.out.println("Nombre: "+LCentros.get(i).getNombreCentro());
            System.out.println("Prevision: "+LCentros.get(i).getPrevisionCentro());
            System.out.println("Direccion: "+LCentros.get(i).getDireccionCentro());
            System.out.println("Region: "+LCentros.get(i).getRegion());
            System.out.println("Comuna: "+LCentros.get(i).getComuna());
            System.out.println("Telefono: "+LCentros.get(i).getTelefonoCentro());
            System.out.println();
        }
    }

}
