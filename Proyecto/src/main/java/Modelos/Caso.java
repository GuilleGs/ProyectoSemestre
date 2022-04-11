package Modelos;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.Scanner;

public class Caso {
    //Atributos
    private String descripcion;
    private Date FechaIngreso;
    private Paciente paciente;
    private Map<String,ProfesionalSalud> ProfesionalesInteresados;

   //Constructor
    public Caso(){

    }

    public Caso(String descripcion, Date fechaIngreso, Paciente paciente, Map<String, ProfesionalSalud> profesionalesInteresados) {
        this.descripcion = descripcion;
        this.FechaIngreso = fechaIngreso;
        this.paciente = paciente;
        this.ProfesionalesInteresados = profesionalesInteresados;
    }


    //Gett
    public String getDescripcion() {
        return descripcion;
    }

    public Date getFechaIngreso() {
        return FechaIngreso;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public Map<String, ProfesionalSalud> getProfesionalesInteresados() {
        return ProfesionalesInteresados;
    }

    //Sett

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        FechaIngreso = fechaIngreso;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public void setProfesionalesInteresados(Map<String, ProfesionalSalud> profesionalesInteresados) {
        ProfesionalesInteresados = profesionalesInteresados;
    }

    //Metodos
    public void InsertarDatos(){
        Scanner Entrada=new Scanner(System.in);
        String descripcion,Fecha;
        String rutPaciente;

    }

}
