/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package scol.regrasdenegocios;

import java.util.List;
import org.hibernate.Session;
import scol.db.RecuperarAtributo;
import scol.mapeamento.Chamado;
import scol.mapeamento.Login;
import scol.mapeamento.Usuario;
import scol.regrasdenegocios.excessoes.RnExcessoes;
import scol.repositorio.Chamados;
import scol.repositorio.DAO.ChamadosDAO;
import scol.repositorio.DAO.UsuariosDAO;
import scol.repositorio.Usuarios;

/**
 *
 * @author UhelberC
 */
public class RnChamado {

    private RecuperarAtributo atributo = new RecuperarAtributo("sessao");
    private Session sessao = (Session) atributo.getAtributo();
    private Chamados chamados = new ChamadosDAO(sessao);

    public List<Chamado> todos(Usuario u) {
        Usuarios usuarios = null;
        if (u != null) {
            this.chamados = new ChamadosDAO(this.sessao);
        }
        return chamados.todos();
    }

    public List<Chamado> naoFinalizados(Usuario u) {
        Usuarios usuarios = null;
        if (u != null) {
            this.chamados = new ChamadosDAO(this.sessao);
        }
        return chamados.naoFinalizados();
    }

    
}
