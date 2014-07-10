/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package scol.repositorio;

import java.util.List;
import scol.mapeamento.Login;
import scol.mapeamento.Usuario;

/**
 *
 * @author Uhelber
 */
public interface Usuarios {
    
    public List<Usuario> todos();
    public List<Usuario> todosSemPermissao();
    public List<Usuario> todosTecnicos();
    public List<Usuario> todosAdministradores();
    public Usuario porId(Integer id);
    public Usuario validar(Login login);
    public void cadastrar(Usuario usuario);
    public void editar(Usuario usuario);
}
