package Modelos;

import java.util.Scanner;

public class Paciente extends Persona {

    private String email,prevision;

    public Paciente(String rut, String nombre, String apPaterno, String apMaterno, int edad, String email, String prevision) {
        super(rut, nombre, apPaterno, apMaterno, edad);
        this.email = email;
        this.prevision = prevision;
    }

    public Paciente(){
        super();

    }

    //Getters


    public String getEmail() {
        return email;
    }

    public String getPrevision() {
        return prevision;
    }

    //Setters

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPrevision(String prevision) {
        this.prevision = prevision;
    }

    //Metodo


}
