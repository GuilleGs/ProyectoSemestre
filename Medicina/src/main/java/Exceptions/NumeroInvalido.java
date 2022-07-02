package Exceptions;

public class NumeroInvalido extends Exception    {
    public NumeroInvalido() {
        super("El valor ingresado no corresponde a una opcion valida.");
    }
}
