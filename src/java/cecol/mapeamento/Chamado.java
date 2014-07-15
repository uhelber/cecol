/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cecol.mapeamento;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


/**
 *
 * @author UhelberC
 */
@Entity
@Table
public class Chamado implements Serializable{
    private Integer idchamado;
    private Escola escola;
    private String contato;
    private String telefone;
    private String telefone2;
    private Status status;
    private String descricao;
    private Usuario abertopor;
    private String dataabertura;
    private Usuario tecnico;

    @Id
    @GeneratedValue
    public Integer getIdchamado() {
        return idchamado;
    }

    public void setIdchamado(Integer idchamado) {
        this.idchamado = idchamado;
    }

    @ManyToOne
    @JoinColumn(name="escola")
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

    @ManyToOne
    @JoinColumn(name="status")
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

    @ManyToOne
    @JoinColumn(name="abertopor")
    public Usuario getAbertopor() {
        return abertopor;
    }

    public void setAbertopor(Usuario abertopor) {
        this.abertopor = abertopor;
    }

    public String getDataabertura() {
        return dataabertura;
    }

    public void setDataabertura(String dataabertura) {
        this.dataabertura = dataabertura;
    }

    @ManyToOne
    @JoinColumn(name="tecnico")
    public Usuario getTecnico() {
        return tecnico;
    }

    public void setTecnico(Usuario tecnico) {
        this.tecnico = tecnico;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + (this.idchamado != null ? this.idchamado.hashCode() : 0);
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
        if (this.idchamado != other.idchamado && (this.idchamado == null || !this.idchamado.equals(other.idchamado))) {
            return false;
        }
        return true;
    }

}
