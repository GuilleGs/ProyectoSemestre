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
public class Paciente {
    //Atributos
    private String Nombre,ApellidoPaterno,ApellidoMaterno,rut;
    private short Edad;
    private String Telefono;
    private String Correo;
    private ArrayList<Paciente> LPacientes=new ArrayList<Paciente>();

    //
    public Paciente(){

    }

    public Paciente(String nombre, String apellidoPaterno, String apellidoMaterno, String rut, short edad, String telefono, String correo) {
        this.Nombre = nombre;
        this.ApellidoPaterno = apellidoPaterno;
        this.ApellidoMaterno = apellidoMaterno;
        this.rut = rut;
        this.Edad = edad;
        this.Telefono = telefono;
        this.Correo = correo;
    }
    //Getter y Setters

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellidoPaterno() {
        return ApellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        ApellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return ApellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        ApellidoMaterno = apellidoMaterno;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public short getEdad() {
        return Edad;
    }

    public void setEdad(short edad) {
        Edad = edad;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }
    
    //Metodos
    public String getNombreCompleto() {
        return this.Nombre + " " + this.ApellidoPaterno + " " + this.ApellidoMaterno;
    }
    public void InsertarDatos(){
        Scanner Entrada=new Scanner(System.in);
        String Nombre,ApellidoP,ApellidoM,rut,Correo,Caso,telefono;
        short edad;
        System.out.println("Nombre:");
        Nombre=Entrada.nextLine();
        System.out.println("Apellido paterno");
        ApellidoP=Entrada.nextLine();
        System.out.println("Apellido Materno");
        ApellidoM=Entrada.nextLine();
        System.out.println("Rut");
        rut=Entrada.nextLine();
        System.out.println("Correo");
        Correo=Entrada.nextLine();
        System.out.println("Edad");
        edad=Short.parseShort(Entrada.nextLine());
        System.out.println("Telefono (9xxxxxxxx)");
        telefono=Entrada.nextLine();
        Paciente paciente=new Paciente(Nombre,ApellidoP,ApellidoM,rut,edad,Correo,telefono);
        LPacientes.add(paciente);

    }
    public void InsertarDatos(Paciente paciente){
        LPacientes.add(paciente);
    }
    public void InsertarDatosFake(){
        String Nombre,ApellidoP,ApellidoM,rut,Correo,Caso,telefono;
        short edad;
        Nombre="Pedro";
        ApellidoP="Pascal";
        ApellidoM="Jimenez";
        rut="234565891";
        Correo="ficticio@gmail.com";
        edad=25;
        telefono="956478954";
        Paciente paciente=new Paciente(Nombre,ApellidoP,ApellidoM,rut,edad,Correo,telefono);
        LPacientes.add(paciente);
    }
    public void ImprimirDatos(){
        for(int i=0;i<LPacientes.size();i++){
            System.out.println("Nombre: "+LPacientes.get(i).getNombreCompleto());
            System.out.println("Rut: "+LPacientes.get(i).getRut());
            System.out.println("Edad: "+LPacientes.get(i).getEdad());
            System.out.println("Correo: "+LPacientes.get(i).getCorreo());
            System.out.println("Telefono: "+LPacientes.get(i).getTelefono());
            System.out.println();
        }
    }

    
}
