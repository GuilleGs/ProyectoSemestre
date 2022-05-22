package Modelos;
/**
 *
 * @author Guillermo González y Brayan Ocares
 */
public class IDCaso {
    public String rutPaciente;

    public IDCaso(String rutPaciente) {
        this.rutPaciente = rutPaciente;
    }

    public String getRutPaciente(String rut) {
        return rutPaciente;
    }

    public void setRutPaciente(String rutPaciente) {
        this.rutPaciente = rutPaciente;
    }
}
