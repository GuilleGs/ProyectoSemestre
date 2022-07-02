package Exceptions;

public class LetraInvalida extends NumberFormatException{
    public LetraInvalida(){
        super("La opcion no es un numero, es una letra o caracter.");
    }
    public void errorMsg(){
        System.out.println("La opcion no es un numero.");
    }
}
