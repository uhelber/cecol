/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mapeamento;

import java.io.Serializable;
import java.sql.Date;
import java.util.Objects;
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
public class Login implements Serializable{
    private Integer idlogin;
    private String usuario;
    private String senha;
    private Date ultimoacesso;
    private Integer numacesso;

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

    public Integer getNumacesso() {
        return numacesso;
    }

    public void setNumacesso(Integer numacesso) {
        this.numacesso = numacesso;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + Objects.hashCode(this.idlogin);
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
        if (!Objects.equals(this.idlogin, other.idlogin)) {
            return false;
        }
        return true;
    }
    
}
