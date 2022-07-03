package Menu.Menus;

import Exceptions.LetraInvalida;
import Exceptions.NumeroInvalido;
import Menu.Controladores.UsuarioControlador;

import java.util.Scanner;

public class MenuUsuario {
    public void MenuUsuario(){
        UsuarioControlador usuarioControlador=new UsuarioControlador();
        usuarioControlador.generarUsuario();
    }
}

