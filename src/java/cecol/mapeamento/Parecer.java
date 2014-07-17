/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cecol.mapeamento;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author UhelberC
 */
@Entity
@Table
public class Parecer implements Serializable {

    @Id
    @GeneratedValue
    private Integer idparecer;
    @OneToOne
    private Usuario tecnico;
    private String parecer;
    private String dataatentimento;
    @ManyToOne
    private Chamado chamado;

    public Integer getIdparecer() {
        return idparecer;
    }

    public void setIdparecer(Integer idparecer) {
        this.idparecer = idparecer;
    }

    public Usuario getTecnico() {
        return tecnico;
    }

    public void setTecnico(Usuario tecnico) {
        this.tecnico = tecnico;
    }

    public String getParecer() {
        return parecer;
    }

    public void setParecer(String parecer) {
        this.parecer = parecer;
    }

    public String getDataatentimento() {
        return dataatentimento;
    }

    public void setDataatentimento(String dataatentimento) {
        this.dataatentimento = dataatentimento;
    }

    public Chamado getChamado() {
        return chamado;
    }

    public void setChamado(Chamado chamado) {
        this.chamado = chamado;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.idparecer);
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
        final Parecer other = (Parecer) obj;
        if (!Objects.equals(this.idparecer, other.idparecer)) {
            return false;
        }
        return true;
    }
    
}
