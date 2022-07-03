package Menu.Controladores;

import Data.file.UsuarioDF;
import Modelos.Usuario;

import java.util.Scanner;

public class UsuarioControlador {

    public Usuario usuario=new Usuario();
    public UsuarioDF usuarioDF= new UsuarioDF();

    //Metodo que crea un objeto Usuario
    public Usuario usuarioCreado(){
        Scanner Entrada=new Scanner(System.in);
        String rut,contrasenia;
        int opcion;
        System.out.println("Usuario");
        rut=Entrada.nextLine();
        System.out.println("Contrseña");
        contrasenia=Entrada.nextLine();
        System.out.println("Elija si es un paciente o profesional");
        System.out.println("1.- Paciente");
        System.out.println("2.- Profesional Salud");
        opcion=Integer.parseInt(Entrada.nextLine());
        return new Usuario(rut,contrasenia,opcion);
    }

    //Metodo que agrega un objeto Usuario

    public void generarUsuario(){
        usuario = usuarioCreado();
        usuarioDF.insertarUsuario(usuario);
    }

}
