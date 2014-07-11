/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package scol.bean;

import scol.mapeamento.Login;
import scol.mapeamento.Usuario;
import java.io.Serializable;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import org.hibernate.Session;
import scol.classes.Mensagem;
import scol.db.RecuperarAtributo;
import scol.mapeamento.Chamado;
import scol.regrasdenegocios.RnChamado;
import scol.regrasdenegocios.RnUsuario;
import scol.regrasdenegocios.excessoes.RnExcessoes;

/**
 *
 * @author UhelberC
 */
@ManagedBean
@SessionScoped
public class ScolBean implements Serializable {

    /*
     * Objetos
     */
    private Login login = new Login();
    private Usuario usuarioLogado = new Usuario();
    private Usuario novoUsuario = new Usuario();
    private Chamado chamado = new Chamado();
    private Mensagem mensagem = new Mensagem();
    
    
    /*
     * Listas
     */
    private List<Chamado> listarChamados;

    
    /**
     * Creates a new instance of ScolBean
     */
    public ScolBean() {
    }

    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }

    public Usuario getUsuario() {
        return usuarioLogado;
    }

    public void setUsuario(Usuario usuario) {
        this.usuarioLogado = usuario;
    }

    public List<Chamado> getListarChamados() {
        return listarChamados;
    }

    public void setListarChamados(List<Chamado> listarChamados) {
        this.listarChamados = listarChamados;
    }

    /*
     *==============================================================================
     *                                 Usuário
     *==============================================================================
     */
    public String validarUsuario() throws RnExcessoes {
        RnUsuario rnUsuario = new RnUsuario();
        String ir = "";
             
        try {
            Usuario usuario = rnUsuario.validar(this.login);
            try {
                usuario = rnUsuario.autorizar(usuario);
                if (this.usuarioLogado != null) {
                    this.usuarioLogado = usuario;
                    ir = "listarchamados";
                } else {
                    ir = "index";
                }
            } catch (RnExcessoes e) {
                this.mensagem.EviarMensagens("frm:aviso", FacesMessage.SEVERITY_ERROR, e.getMessage(), "");
            }
        } catch (RnExcessoes e) {
            this.mensagem.EviarMensagens("frm:aviso", FacesMessage.SEVERITY_ERROR, e.getMessage(), "Entre em contato com o Administrador...");
        }
        return ir;
    }
    
    public void casdastrar(){
        RnUsuario rnUsuario = new RnUsuario();
        try {
            rnUsuario.cadastrar(this.usuarioLogado, this.novoUsuario);
        } catch (RnExcessoes e) {
            this.mensagem.EviarMensagens("", FacesMessage.SEVERITY_INFO, e.getMessage(), "");
        }
        
    }
    
    public List<Usuario> listarTodos(){
        RnUsuario rnUsuario = new RnUsuario();
        return rnUsuario.todos(this.usuarioLogado);
    }
    
    public List<Usuario> listarTodosSemPermissao(){
        RnUsuario rnUsuario = new RnUsuario();
        return rnUsuario.todosSemPermissao(this.usuarioLogado);
    }
    
    public List<Usuario> listarTecnicos(){
        RnUsuario rnUsuario = new RnUsuario();
        return rnUsuario.todosTecnicos(this.usuarioLogado);
    }
    
    public List<Usuario> listarTodosAdministradores(){
        RnUsuario rnUsuario = new RnUsuario();
        return rnUsuario.todosAdministradores(this.usuarioLogado);
    }
    
    
    /*
     * =============================================================================
     *                               Chamado
     * =============================================================================
     */
    public List<Chamado> listarChamados(){
        RnChamado rnChamado = new RnChamado();
        return rnChamado.todos(this.usuarioLogado);
    }
    
    public List<Chamado> listarChamadosNaoFinalizados(){
        RnChamado rnChamado = new RnChamado();
        return rnChamado.naoFinalizados(this.usuarioLogado);
    }
    
    /*
     * =============================================================================
     *                               Logoff
     * =============================================================================
     */
    public String sair(){
        this.login = new Login();
        this.usuarioLogado = new Usuario();
        this.novoUsuario = new Usuario();
        this.chamado = new Chamado();
        this.mensagem = new Mensagem();
        this.listarChamados = null;
        
        return "index";
    }
}
