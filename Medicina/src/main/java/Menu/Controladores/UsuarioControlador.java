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
        System.out.println("Usuario");
        rut=Entrada.nextLine();
        System.out.println("Contrseña");
        contrasenia=Entrada.nextLine();
        return new Usuario(rut,contrasenia);
    }

    //Metodo que agrega un objeto Usuario

    public void generarUsuario(){
        usuario = usuarioCreado();
        usuarioDF.insertarUsuario(usuario);
    }

}
