package Modelos;

/**
 *
 * @author Guillermo González y Brayan Ocares
 */

public class CentroSalud {
    private String nombre,direccion,comuna,region;
    private int telefono;

    public CentroSalud(String nombre, String direccion, String comuna, String region, int telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.comuna = comuna;
        this.region = region;
        this.telefono = telefono;
    }

    public CentroSalud() {

    }

    //Getters

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getComuna() {
        return comuna;
    }

    public String getRegion() {
        return region;
    }

    public int getTelefono() {
        return telefono;
    }


    //Setters

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }


}
