/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cecol.regrasdenegocios;

import java.util.List;
import org.hibernate.Session;
import cecol.db.RecuperarAtributo;
import cecol.mapeamento.Chamado;
import cecol.mapeamento.Login;
import cecol.mapeamento.Usuario;
import cecol.regrasdenegocios.excessoes.RnExcessoes;
import cecol.repositorio.Chamados;
import cecol.repositorio.DAO.ChamadosDAO;
import cecol.repositorio.DAO.UsuariosDAO;
import cecol.repositorio.Usuarios;

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
