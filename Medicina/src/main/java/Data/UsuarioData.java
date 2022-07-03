package Data;

import Modelos.Usuario;

public interface UsuarioData {

    public Usuario getUsuarios(String user);
    public boolean getUsuario(String user,String contraseña);
    public boolean insertarUsuario(Usuario usuario);
    public boolean updateUsuario(Usuario usuario);
    public boolean deleteUsuario(Usuario usuario);
}
