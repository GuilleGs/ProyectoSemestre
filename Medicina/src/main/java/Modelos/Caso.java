package Modelos;

/**
 *
 * @author Guillermo González y Brayan Ocares
 */

public class Caso {
    private IDCaso id;
    private String descripcion;


    public Caso(IDCaso id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
    }

    public IDCaso getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setId(IDCaso id) {
        this.id = id;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
