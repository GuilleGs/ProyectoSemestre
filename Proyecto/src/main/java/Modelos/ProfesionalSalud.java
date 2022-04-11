/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author Guillermo González y Brayan Ocares
 */
public class ProfesionalSalud{
    //Atributos
    private String Nombre,ApellidoPaterno,ApellidoMaterno,rut;
    private short Edad;
    private String Profesion,InstitucionEgreso,LugaresAtencion,Prestacion;
    private Vector<CentroSalud>centroSalud=new Vector<CentroSalud>();
    private ArrayList<ProfesionalSalud>LProfesionales=new ArrayList<ProfesionalSalud>();

    //Constructor
    public ProfesionalSalud() {

    }

    public ProfesionalSalud(String nombre, String apellidoPaterno, String apellidoMaterno, String rut, short edad, String profesion, String institucionEgreso, String lugaresAtencion, String prestacion) {
        this.Nombre = nombre;
        this.ApellidoPaterno = apellidoPaterno;
        this.ApellidoMaterno = apellidoMaterno;
        this.rut = rut;
        this.Edad = edad;
        this.Profesion = profesion;
        this.InstitucionEgreso = institucionEgreso;
        this.LugaresAtencion = lugaresAtencion;
        this.Prestacion = prestacion;
    }

    public ProfesionalSalud(String nombre, String apellidoPaterno, String apellidoMaterno, String rut, short edad, String profesion, String institucionEgreso, String lugaresAtencion, String prestacion, Vector<CentroSalud> centroSalud, ArrayList<ProfesionalSalud> LProfesionales) {
        this.Nombre = nombre;
        this.ApellidoPaterno = apellidoPaterno;
        this.ApellidoMaterno = apellidoMaterno;
        this.rut = rut;
        this.Edad = edad;
        this.Profesion = profesion;
        this.InstitucionEgreso = institucionEgreso;
        this.LugaresAtencion = lugaresAtencion;
        this.Prestacion = prestacion;
        this.centroSalud = centroSalud;
        this.LProfesionales = LProfesionales;
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

    public String getProfesion() {
        return Profesion;
    }

    public void setProfesion(String Profesion) {
        this.Profesion = Profesion;
    }

    public String getInstitucionEgreso() {
        return InstitucionEgreso;
    }

    public void setInstitucionEgreso(String InstitucionEgreso) {
        this.InstitucionEgreso = InstitucionEgreso;
    }

    public String getLugaresAtencion() {
        return LugaresAtencion;
    }

    public void setLugaresAtencion(String LugaresAtencion) {
        this.LugaresAtencion = LugaresAtencion;
    }

    public String getPrestacion() {
        return Prestacion;
    }

    public void setPrestacion(String Prestacion) {
        this.Prestacion = Prestacion;
    }
    
    //Metodos

    public String getNombreCompleto() {
        return this.Nombre + " " + this.ApellidoPaterno + " " + this.ApellidoMaterno;
    }

    public void IngresarDatos(){
        Scanner Entrada=new Scanner(System.in);
        String Nombre,ApellidoP,ApellidoM,rut,Profesion,InstitucionEgreso,lugaresAtencion,prestacion;
        short edad;

        System.out.println("Nombre:");
        Nombre=Entrada.nextLine();
        System.out.println("Apellido paterno");
        ApellidoP=Entrada.nextLine();
        System.out.println("Apellido Materno");
        ApellidoM=Entrada.nextLine();
        System.out.println("Rut");
        rut=Entrada.nextLine();
        System.out.println("Edad");
        edad=Short.parseShort(Entrada.nextLine());
        System.out.println("Profesion");
        Profesion=Entrada.nextLine();
        System.out.println("Institucion egreso");
        InstitucionEgreso=Entrada.nextLine();
        System.out.println("Lugar de atencion");
        LugaresAtencion=Entrada.nextLine();
        Paciente paciente=new Paciente();
        System.out.println("Prestacion");
        prestacion=Entrada.nextLine();
        ProfesionalSalud profesional=new ProfesionalSalud(Nombre,ApellidoPaterno,ApellidoMaterno,rut,edad,Profesion,InstitucionEgreso,LugaresAtencion,prestacion);
        LProfesionales.add(profesional);
    }
    public void IngresarDatosFake(){

        String Nombre,ApellidoP,ApellidoM,rut,Profesion,InstitucionEgreso,lugaresAtencion,prestacion;
        short edad;

        Nombre="Andres";
        ApellidoP="Gonzalez";
        ApellidoM="Ramirez";
        rut="215849441";
        edad=42;
        Profesion="Kinesiologo";
        InstitucionEgreso="PUCV";
        lugaresAtencion="Hospital Van Buren";
        prestacion="Fonasa";
        ProfesionalSalud profesional=new ProfesionalSalud(Nombre,ApellidoP,ApellidoM,rut,edad,Profesion,InstitucionEgreso,lugaresAtencion,prestacion);
        LProfesionales.add(profesional);
    }
    public void InsertarDatos(ProfesionalSalud profesionalSalud){
        LProfesionales.add(profesionalSalud);
    }
    public void imprimirDatos(){
        for(int i=0;i<LProfesionales.size();i++){
            System.out.println("Nombre: "+LProfesionales.get(i).getNombreCompleto());
            System.out.println("Rut: "+LProfesionales.get(i).getRut());
            System.out.println("Edad: "+LProfesionales.get(i).getEdad());
            System.out.println("Profesion: "+LProfesionales.get(i).getProfesion());
            System.out.println("Institucion de egreso: "+LProfesionales.get(i).getInstitucionEgreso());
            System.out.println("Lugares de atencion: "+LProfesionales.get(i).getLugaresAtencion());
            System.out.println("Prestacion: "+LProfesionales.get(i).getPrestacion());
            System.out.println();
        }
    }

}
