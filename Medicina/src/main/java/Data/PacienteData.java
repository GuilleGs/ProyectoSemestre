package Data;

import Modelos.Paciente;

public interface PacienteData {
    public boolean deletePaciente(Paciente paciente);
    public boolean updatePaciente(Paciente paciente);
    public boolean insertarPaciente(Paciente paciente);
    public Paciente getPaciente(String rut);
}
