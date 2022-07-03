/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data.file;

import Modelos.ProfesionalSalud;
import Modelos.Usuario;
import Data.UsuarioData;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ggonzalez
 */
public class UsuarioDF implements UsuarioData {
    private final Data dataFile;
    
    public UsuarioDF(){
        this.dataFile=new Data("Usuario");
    }

    public String usuariotoCSV(Usuario usuario){
        List<String> datalist=new ArrayList<>();
        datalist.add((usuario.getRut()));
        datalist.add(usuario.getContraseña());
        datalist.add(Integer.toString(usuario.getTipo()));
        return Data.listToCSV(datalist);
    }

    public Usuario usuariosfromCSV(String csv){
        String[] parts = csv.split(",");
        return new Usuario(parts[0],parts[1],Integer.parseInt(parts[2]));
    }

    public Usuario getUsuarios(String user) {
        List<String> data = this.dataFile.getData();
        for (String csv : data) {
            if (csv.split(",")[0].equals(user))
                return usuariosfromCSV(csv);
        }
        return null;
    }

    public boolean getUsuario(String user,String contraseña){
        List<String> data = this.dataFile.getData();
        for (String csv:data){
            if (csv.split(",")[0].equals(user) && csv.split(",")[1].equals(contraseña))
                return true;
        }
        return false;
    }

    public boolean insertarUsuario(Usuario usuario){
        return this.dataFile.insertLine(usuariotoCSV(usuario));
    }

    public boolean updateUsuario(Usuario usuario){
        String oldLine=usuariotoCSV(null), newLine=usuariotoCSV(usuario);
        return this.dataFile.updateLine(oldLine,newLine);
    }

    public boolean deleteUsuario(Usuario usuario){
        return this.dataFile.deleteLine(usuariotoCSV(usuario));
    }
}
