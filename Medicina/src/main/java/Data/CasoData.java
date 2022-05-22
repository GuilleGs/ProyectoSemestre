package Data;

import Modelos.Caso;
import Modelos.IDCaso;

import java.util.HashMap;

public interface CasoData  {
    public HashMap<IDCaso, Caso> getCaso();

    public HashMap<IDCaso,Caso> getCaso(String rutPaciente);

    public void insertarCaso(Caso caso);

    public void actualizarCaso(Caso caso);

    public void eliminarCaso(Caso caso);
}
