package Modelos;

import java.util.ArrayList;


public class ProfesionalSalud extends Persona {

    private String profesion,universidad;
    private int anioEgreso;
    private ArrayList<CentroSalud> centrosAtencion;

    public ProfesionalSalud(String rut, String nombre, String apPaterno, String apMaterno, int edad, String profesion, String universidad, int anioEgreso) {
        super(rut, nombre, apPaterno, apMaterno, edad);
        this.profesion = profesion;
        this.universidad = universidad;
        this.anioEgreso = anioEgreso;
    }

    public ProfesionalSalud() {

    }

    //Getters


    public String getProfesion() {
        return profesion;
    }

    public String getUniversidad() {
        return universidad;
    }

    public int getAnioEgreso() {
        return anioEgreso;
    }

    public ArrayList<CentroSalud> getCentrosAtencion() {
        return centrosAtencion;
    }

    //Setters

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }

    public void setAnioEgreso(int anioEgreso) {
        this.anioEgreso = anioEgreso;
    }

    public void setCentrosAtencion(ArrayList<CentroSalud> centrosAtencion) {
        this.centrosAtencion = centrosAtencion;
    }


}
