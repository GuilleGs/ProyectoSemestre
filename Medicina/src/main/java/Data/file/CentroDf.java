package Data.file;

import Modelos.CentroSalud;
import Data.CentroData;

import java.util.ArrayList;
import java.util.List;

public class CentroDf implements CentroData {
    private final Data dataFile;

    public CentroDf(){
        this.dataFile=new Data("CentroSalud");
    }

    public String centrotoCSV(CentroSalud centroSalud){
        List<String> datalist=new ArrayList<>();
        datalist.add(centroSalud.getNombre());
        datalist.add(centroSalud.getDireccion());
        datalist.add(centroSalud.getComuna());
        datalist.add(centroSalud.getRegion());
        datalist.add(centroSalud.getSistema());
        datalist.add(Integer.toString(centroSalud.getTelefono()));
        return Data.listToCSV(datalist);
    }

    public CentroSalud centrofromCSV(String csv){
        String[] parts=csv.split(",");
        return new CentroSalud(parts[0],parts[1],parts[2],parts[3],parts[4],Integer.parseInt(parts[5]));
    }

    public CentroSalud getCentro(String direccion){
        List<String> data = this.dataFile.getData();
        for (String csv : data){
            if (csv.split(",")[1].equals(direccion))
                return centrofromCSV(csv);
        }
        return null;
    }

    public int getCentroRegion(String region){
        List<String> data = this.dataFile.getData();
        int contador=0;
        for (String csv : data){
            if (csv.split(",")[0].equals(region))
                contador+=1;
        }
        return contador;
    }

    public int getCentroSistema(String sistema){
        List<String> data = this.dataFile.getData();
        int contador=0;
        for (String csv : data){
            if (csv.split(",")[4].equals(sistema))
                contador+=1;
        }
        return contador;
    }
    public boolean insertarCentro(CentroSalud centroSalud){
        return this.dataFile.insertLine(centrotoCSV(centroSalud));
    }

    public boolean updateCentro(CentroSalud centroSalud){
        String oldLine=centrotoCSV(null),newLine=centrotoCSV(centroSalud);
        return this.dataFile.updateLine(oldLine,newLine);
    }

    public boolean deleteCentro(CentroSalud centroSalud){
        return this.dataFile.deleteLine(centrotoCSV(centroSalud));
    }
}
