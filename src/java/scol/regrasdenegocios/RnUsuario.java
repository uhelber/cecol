/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package scol.regrasdenegocios;

import java.util.List;
import org.hibernate.Session;
import scol.db.RecuperarAtributo;
import scol.mapeamento.Login;
import scol.mapeamento.Usuario;
import scol.regrasdenegocios.excessoes.RnExcessoes;
import scol.repositorio.DAO.UsuariosDAO;
import scol.repositorio.Usuarios;

/**
 *
 * @author UhelberC
 */
public class RnUsuario {

    private RecuperarAtributo atributo = new RecuperarAtributo("sessao");
    private Session sessao = (Session) atributo.getAtributo();
    private Usuarios usuarios = new UsuariosDAO(sessao);

    public Usuario validar(Login login) throws RnExcessoes {
        Usuario usuario = this.usuarios.validar(login);
        System.out.println(usuario.getSobrenome());
        if (usuario == null) {
            throw new RnExcessoes("Usuário ou senha inválida");
        }
        return usuario;
    }

    public Usuario autorizar(Usuario usuario) throws RnExcessoes {
        Usuario u = null;
        if (usuario.getAtivarconta().getIdativarconta() == 1) {
            throw new RnExcessoes("Usuário está bloqueado pelo Administrador");
        } else {
            u = usuario;
        }
        return u;
    }

    public List<Usuario> todos(Usuario u) {
        Usuarios usuarios = null;
        if (u != null) {
            usuarios = new UsuariosDAO(this.sessao);
        }
        return usuarios.todos();
    }

    public List<Usuario> todosSemPermissao(Usuario u) {
        Usuarios usuarios = null;
        if (u != null) {
            usuarios = new UsuariosDAO(this.sessao);
        }
        return usuarios.todosSemPermissao();
    }

    public List<Usuario> todosTecnicos(Usuario u) {
        Usuarios usuarios = null;
        if (u != null) {
            usuarios = new UsuariosDAO(this.sessao);
        }
        return usuarios.todosTecnicos();
    }

    public List<Usuario> todosAdministradores(Usuario u) {
        Usuarios usuarios = null;
        if (u != null) {
            usuarios = new UsuariosDAO(this.sessao);
        }
        return usuarios.todosAdministradores();
    }
    
    public void cadastrar(Usuario usuarioLogado, Usuario novoUsuario) throws RnExcessoes{
        Usuarios usuarios = new UsuariosDAO(this.sessao);
        if(usuarioLogado != null){
            usuarios.cadastrar(novoUsuario);
            throw new RnExcessoes("Usuário cadastrado com sucesso...");
        }
    }
}
