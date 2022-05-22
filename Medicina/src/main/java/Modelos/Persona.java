package Modelos;
/**
 *
 * @author Guillermo González y Brayan Ocares
 */
public abstract class Persona {

    private String rut,nombre,apPaterno,apMaterno;
    private int edad;

    public Persona(String rut, String nombre, String apPaterno, String apMaterno, int edad) {
        this.rut = rut;
        this.nombre = nombre;
        this.apPaterno = apPaterno;
        this.apMaterno = apMaterno;
        this.edad = edad;
    }

    public Persona() {

    }

    //Getters
    public String getRut() {
        return rut;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApPaterno() {
        return apPaterno;
    }

    public String getApMaterno() {
        return apMaterno;
    }

    public int getEdad() {
        return edad;
    }

    //Setters

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApPaterno(String apPaterno) {
        this.apPaterno = apPaterno;
    }

    public void setApMaterno(String apMaterno) {
        this.apMaterno = apMaterno;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String NombreCompleto(){
        return this.nombre+" "+this.apPaterno+" "+this.apMaterno;
    }
    
    @Override
    public String toString(){
        return "Datos persona: \n"+
                "  -> RUT              : " + rut +"\n" +
                "  -> Nombres          : " + nombre + "\n" +
                "  -> Apellido paterno : " + apPaterno + "\n" +
                "  -> Apellido materno : " + apMaterno + "\n";
    }

    public String toString(String titulo) {
        return "Datos " + titulo + ": \n" +
                "    -> RUT              : " + rut + "\n" +
                "    -> Nombres          : " + nombre + "\n" +
                "    -> Apellido paterno : " + apPaterno + "\n" +
                "    -> Apellido materno : " + apMaterno + "\n";
    }
    
}
