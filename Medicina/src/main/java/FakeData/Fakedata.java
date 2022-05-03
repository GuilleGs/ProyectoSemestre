package FakeData;

import Data.PacienteDataFile;
import Modelos.Paciente;
import com.github.javafaker.Faker;

public class Fakedata {

    private final PacienteDataFile pacienteDataFile;
    private final Faker faker;

    public Fakedata() {
        this.pacienteDataFile=new PacienteDataFile();
        this.faker = new Faker();
    }

    public Paciente generatePaciente(){
        String rut,nombre,apPat,apMat,email,preivision;
        int edad;
        rut = Integer.toString(this.faker.number().numberBetween(25000000, 35000000))
                + "-" + Integer.toString(this.faker.number().numberBetween(0, 9));
        nombre = this.faker.name().firstName();
        apPat = this.faker.name().lastName();
        apMat = this.faker.name().lastName();
        email = this.faker.internet().emailAddress();
        preivision = this.faker.name().firstName();
        edad = this.faker.number().numberBetween(1,80);
        return new Paciente(rut,nombre,apPat,apMat,edad,email,preivision);
    }
    public void generateFakeData(){
        Paciente paciente;
        for (short i=1; i<10;i++){
            paciente = generatePaciente();
            pacienteDataFile.insertarPaciente(paciente);
        }
    }

    public static void main(String[] args){
        Fakedata fakeData=new Fakedata();
        fakeData.generateFakeData();
    }
}
