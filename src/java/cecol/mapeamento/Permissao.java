/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cecol.mapeamento;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author UhelberC
 */
@Entity
@Table(name="Permissoes")
public class Permissao implements Serializable {
    private Integer idpermissao;
    private String tipo;

    @Id
    @GeneratedValue
    public Integer getIdpermissao() {
        return idpermissao;
    }

    public void setIdpermissao(Integer idpermissao) {
        this.idpermissao = idpermissao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + (this.idpermissao != null ? this.idpermissao.hashCode() : 0);
        hash = 71 * hash + (this.tipo != null ? this.tipo.hashCode() : 0);
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
        final Permissao other = (Permissao) obj;
        if (this.idpermissao != other.idpermissao && (this.idpermissao == null || !this.idpermissao.equals(other.idpermissao))) {
            return false;
        }
        if ((this.tipo == null) ? (other.tipo != null) : !this.tipo.equals(other.tipo)) {
            return false;
        }
        return true;
    }
    
    
}
