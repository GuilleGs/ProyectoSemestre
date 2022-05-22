package Data.datafile;
/**
 *
 * @author Guillermo González y Brayan Ocares
 */
import Data.CasoData;
import Modelos.Caso;
import Modelos.IDCaso;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CasoDF implements CasoData {
    private final DataFile dataFile;

    public CasoDF() {
        this.dataFile = new DataFile("Caso");
    }

    public String CasotoCSV(Caso caso){
        List<String> datalist = new ArrayList<>();
        datalist.add(caso.getId().rutPaciente);
        datalist.add(caso.getDescripcion());
        return DataFile.listToCSV(datalist);
    }

    public Caso CasofromCSV(String csv){
        String[] parts = csv.split(",");
        return new Caso(new IDCaso(parts[0]),parts[1]);
    }

    public Caso obtener(IDCaso id){
        return null;
    }

    public HashMap<IDCaso, Caso> getCaso(){
        HashMap<IDCaso,Caso> registro = new HashMap<>();
        List<String> data = this.dataFile.getData();
        IDCaso id;
        String[] parts;
        for (String csv: data){
            parts = csv.split(",");
            id = new IDCaso(parts[0]);
            registro.put(id,CasofromCSV(csv));
        }
        return registro;
    }

    public HashMap<IDCaso,Caso> getCaso(String rutPaciente){
        HashMap<IDCaso,Caso> registro = new HashMap<>();
        List<String> data = this.dataFile.getData();
        IDCaso id;
        String[] parts;
        for (String csv : data){
            parts=csv.split(",");
            if (parts[0].equals(rutPaciente)){
                id=new IDCaso(parts[0]);
                registro.put(id,CasofromCSV(csv));
            }
        }
        return registro;
    }

    public void insertarCaso(Caso caso){
        this.dataFile.insertLine(CasotoCSV(caso));
    }

    public void actualizarCaso(Caso caso){
        String oldLine=CasotoCSV(obtener(caso.getId())),newLine=CasotoCSV(caso);
        this.dataFile.updateLine(oldLine,newLine);
    }
    public void eliminarCaso(Caso caso){
        this.dataFile.deleteLine(CasotoCSV(caso));
    }


}
