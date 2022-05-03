package Data;

import Modelos.Paciente;

public interface PacienteData {

    public Paciente getPaciente(String rut);

    public boolean updatePaciente(Paciente paciente);

    public boolean insertarPaciente(Paciente paciente);

    public boolean deletePaciente(Paciente paciente);

}
