package Modelos;

/**
 *
 * @author Guillermo González y Brayan Ocares
 */

import java.util.HashMap;
import java.util.Map;

public class Paciente extends Persona {

    private String email,prevision;
    private HashMap<IDCaso,Caso> casos;

    public Paciente(String rut, String nombre, String apPaterno, String apMaterno, int edad, String email, String prevision) {
        super(rut, nombre, apPaterno, apMaterno, edad);
        this.email = email;
        this.prevision = prevision;
    }

    public Paciente() {
        super();
    }


    //Getters


    public String getEmail() {
        return email;
    }

    public String getPrevision() {
        return prevision;
    }

    public Caso getCaso(String rut){
        for (Map.Entry<IDCaso,Caso> caso: this.casos.entrySet()){
            if (caso.getKey().rutPaciente.compareTo(rut)==0){
                return caso.getValue();
            }
        }
        return null;
    }
    //Setters

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPrevision(String prevision) {
        this.prevision = prevision;
    }

    public void setCaso (HashMap<IDCaso,Caso> caso){
        this.casos = caso;
    }

    //Metodo

    @Override
    public String toString(){
        return super.toString("Paciente") +
                "  -> Email     : " + email + "\n" +
                "  -> Prevision : " + prevision + "\n";
    }

    @Override
    public String toString(String titulo){
        return super.toString(titulo)+
                " -> Email     : " + email + "\n" +
                " -> Prevision : " + prevision + "\n";
    }
}
