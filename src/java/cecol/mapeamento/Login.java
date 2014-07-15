/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cecol.mapeamento;

import java.io.Serializable;
import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author UhelberC
 */
@Entity
@Table
public class Login implements Serializable {

    private Integer idlogin;
    private String usuario;
    private String senha;
    private Date ultimoacesso;

    @Id
    @GeneratedValue
    public Integer getIdlogin() {
        return idlogin;
    }

    public void setIdlogin(Integer idlogin) {
        this.idlogin = idlogin;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Date getUltimoacesso() {
        return ultimoacesso;
    }

    public void setUltimoacesso(Date ultimoacesso) {
        this.ultimoacesso = ultimoacesso;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 19 * hash + (this.idlogin != null ? this.idlogin.hashCode() : 0);
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
        final Login other = (Login) obj;
        if (this.idlogin != other.idlogin && (this.idlogin == null || !this.idlogin.equals(other.idlogin))) {
            return false;
        }
        return true;
    }

    

    
}
