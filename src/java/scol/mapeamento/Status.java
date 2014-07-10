/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package scol.mapeamento;

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
@Table
public class Status implements Serializable {
    
    private Integer idstatus;
    private String nome;
    private String imagem;

    
    @Id
    @GeneratedValue
    public Integer getIdstatus() {
        return idstatus;
    }

    public void setIdstatus(Integer idstatus) {
        this.idstatus = idstatus;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }
    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + (this.idstatus != null ? this.idstatus.hashCode() : 0);
        hash = 59 * hash + (this.nome != null ? this.nome.hashCode() : 0);
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
        final Status other = (Status) obj;
        if (this.idstatus != other.idstatus && (this.idstatus == null || !this.idstatus.equals(other.idstatus))) {
            return false;
        }
        if ((this.nome == null) ? (other.nome != null) : !this.nome.equals(other.nome)) {
            return false;
        }
        return true;
    }
    
    
}
