package FakeData;
/**
 *
 * @author Guillermo González y Brayan Ocares
 */
import Data.datafile.PacienteDF;
import Data.datafile.ProfesionalSaludDF;
import Modelos.Paciente;
import Modelos.ProfesionalSalud;
import com.github.javafaker.Faker;

public class Fakedata {

    private final PacienteDF pacienteDataFile;
    private final ProfesionalSaludDF profesionalSaludDF;
    private final Faker faker;

    public Fakedata() {
        this.pacienteDataFile=new PacienteDF();
        this.profesionalSaludDF=new ProfesionalSaludDF();
        this.faker = new Faker();
    }

    public Paciente generatePaciente(){
        String rut,nombre,apPat,apMat,email,prevision;
        int edad;
        rut = Integer.toString(this.faker.number().numberBetween(25000000, 35000000))
                + "-" + Integer.toString(this.faker.number().numberBetween(0, 9));
        nombre = this.faker.name().firstName();
        apPat = this.faker.name().lastName();
        apMat = this.faker.name().lastName();
        email = this.faker.internet().emailAddress();
        prevision = this.faker.name().firstName();
        edad = this.faker.number().numberBetween(1,80);
        return new Paciente(rut,nombre,apPat,apMat,edad,email,prevision);
    }

    public ProfesionalSalud generateProfesional(){
        String rut,nombre,apPat,apMat,profesion,universidad;
        int edad,anioEgreso;
        rut = Integer.toString(this.faker.number().numberBetween(25000000, 35000000))
                + "-" + Integer.toString(this.faker.number().numberBetween(0, 9));
        nombre = this.faker.name().firstName();
        apPat = this.faker.name().lastName();
        apMat = this.faker.name().lastName();
        edad = this.faker.number().numberBetween(1,80);
        profesion = this.faker.name().username();
        universidad = this.faker.name().username();
        anioEgreso = this.faker.number().numberBetween(1900,2019);
        return new ProfesionalSalud(rut,nombre,apPat,apMat,edad,profesion,universidad,anioEgreso);
    }

    public void generateFakeData(){
        Paciente paciente;
        ProfesionalSalud profesionalSalud;
        for (short i=1; i<10;i++){
            paciente = generatePaciente();
            profesionalSalud = generateProfesional();
            pacienteDataFile.insertarPaciente(paciente);
            profesionalSaludDF.insertarProfesional(profesionalSalud);
        }
    }

    public static void main(String[] args){
        Fakedata fakeData=new Fakedata();
        fakeData.generateFakeData();
    }
}
