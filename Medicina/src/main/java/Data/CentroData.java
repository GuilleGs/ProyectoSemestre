package Data;

import Modelos.CentroSalud;
import Modelos.Paciente;

public interface CentroData {

    public CentroSalud getCentro(String direccion);

    public boolean insertarCentro(CentroSalud centroSalud);

    public boolean updateCentro(CentroSalud centroSalud);

    public boolean deleteCentro(CentroSalud centroSalud);

}
