/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package scol.classes;

import scol.db.FabricaDeSessao;
import scol.mapeamento.Usuario;
import java.sql.SQLException;
import java.util.List;
import org.hibernate.Session;
import scol.mapeamento.Chamado;
import scol.mapeamento.Login;
import scol.repositorio.Chamados;
import scol.repositorio.DAO.ChamadosDAO;
import scol.repositorio.DAO.UsuariosDAO;
import scol.repositorio.Usuarios;

/**
 *
 * @author UhelberC
 */
public class Teste {

    public static void main(String args[]) throws ClassNotFoundException, SQLException {
        FabricaDeSessao fabrica = new FabricaDeSessao();
        Session sessao = fabrica.getSessao();

        try {
            Login login = new Login();
            login.setUsuario("uhelber");
            login.setSenha("lcosta");
            Usuarios usuarios = new UsuariosDAO(sessao);
            Chamados chamados = new ChamadosDAO(sessao);
            List<Usuario> tecnicos = usuarios.todos();
            List<Chamado> chmd = chamados.todosPrioridades();
            //Usuario usuario = (Usuario) sesessao.createQuery("select usr from Usuario usr where usr.login.usuario = :nome and usr.login.senha = :senha").setString("nome", login.getUsuario()).setString("senha", login.getSenha()).uniqueResult();
            Usuario usuario = usuarios.validar(login);
            
            if(usuario != null){
                System.out.println("\n\n\n"+usuario.getNome() + " " + usuario.getSobrenome());
            }else{
                System.out.println("\n\n\nUsuário não encontrado...");
            }
            
            
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            sessao.close();
        }

    }
}
