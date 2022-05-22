package Data.datafile;
/**
 *
 * @author Guillermo González y Brayan Ocares
 */
import Data.ProfesionalData;
import Modelos.Paciente;
import Modelos.ProfesionalSalud;
import java.util.List;
import java.util.ArrayList;
public class ProfesionalSaludDF implements ProfesionalData{
    private final DataFile dataFile;

    public ProfesionalSaludDF (){
        this.dataFile=new DataFile("ProfesionalSalud");
    }

    public String profesionalaCSV(ProfesionalSalud profesionalSalud){
        List<String> datalist=new ArrayList<>();
        datalist.add(profesionalSalud.getRut());
        datalist.add(profesionalSalud.getNombre());
        datalist.add(profesionalSalud.getApPaterno());
        datalist.add(profesionalSalud.getApMaterno());
        datalist.add(Integer.toString(profesionalSalud.getEdad()));
        datalist.add(profesionalSalud.getProfesion());
        datalist.add(profesionalSalud.getUniversidad());
        datalist.add(Integer.toString(profesionalSalud.getAnioEgreso()));
        return DataFile.listToCSV(datalist);
    }

    public ProfesionalSalud profesinaldeCSV(String csv){
        String[] parts = csv.split(",");
        return new ProfesionalSalud(parts[0],parts[1],parts[2],parts[3],Integer.parseInt(parts[4]),parts[5],parts[6],Integer.parseInt(parts[7]));
    }

    public ProfesionalSalud getProfesional(String rut){
        List<String> data = this.dataFile.getData();
        for (String csv : data){
            if (csv.split(",")[0].equals(rut))
                return profesinaldeCSV(csv);
        }
        return null;
    }

    public boolean insertarProfesional(ProfesionalSalud profesionalSalud){
        return this.dataFile.insertLine(profesionalaCSV(profesionalSalud));
    }

    public boolean updateProfesional(ProfesionalSalud profesionalSalud){
        String oldLine = profesionalaCSV(null), newLine = profesionalaCSV(profesionalSalud);
        return this.dataFile.updateLine(oldLine,newLine);
    }

    public boolean deleteProfesional(ProfesionalSalud profesionalSalud){
        return this.dataFile.deleteLine(profesionalaCSV(profesionalSalud));
    }






}
