/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cecol.mapeamento;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


/**
 *
 * @author UhelberC
 */
@Entity
@Table
public class Chamado implements Serializable{
    @Id
    @GeneratedValue
    private Integer idchamado;
    @OneToOne
    private Escola escola;
    private String contato;
    private String telefone;
    private String telefone2;
    @OneToOne
    private Status status;
    private String descricao;
    @OneToOne
    private Usuario atendente;
    private String dt_abertura;
    private String dt_conclusao;
    @OneToMany
    private List<Parecer> parecer;

    public Integer getIdchamado() {
        return idchamado;
    }

    public void setIdchamado(Integer idchamado) {
        this.idchamado = idchamado;
    }

    public Escola getEscola() {
        return escola;
    }

    public void setEscola(Escola escola) {
        this.escola = escola;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getTelefone2() {
        return telefone2;
    }

    public void setTelefone2(String telefone2) {
        this.telefone2 = telefone2;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Usuario getAtendente() {
        return atendente;
    }

    public void setAtendente(Usuario atendente) {
        this.atendente = atendente;
    }

    public String getDt_abertura() {
        return dt_abertura;
    }

    public void setDt_abertura(String dt_abertura) {
        this.dt_abertura = dt_abertura;
    }

    public String getDt_conclusao() {
        return dt_conclusao;
    }

    public void setDt_conclusao(String dt_conclusao) {
        this.dt_conclusao = dt_conclusao;
    }

    public List<Parecer> getParecer() {
        return parecer;
    }

    public void setParecer(List<Parecer> parecer) {
        this.parecer = parecer;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 43 * hash + Objects.hashCode(this.idchamado);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Chamado other = (Chamado) obj;
        if (!Objects.equals(this.idchamado, other.idchamado)) {
            return false;
        }
        return true;
    }
    
}
