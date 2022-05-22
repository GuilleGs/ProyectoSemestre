package Data;

import Modelos.ProfesionalSalud;

public interface ProfesionalData {

    public boolean insertarProfesional(ProfesionalSalud profesionalSalud);

    public boolean updateProfesional(ProfesionalSalud profesionalSalud);

    public boolean deleteProfesional(ProfesionalSalud profesionalSalud);
}
