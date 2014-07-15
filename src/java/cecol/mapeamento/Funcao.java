/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cecol.mapeamento;

import java.io.Serializable;
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
public class Funcao implements Serializable {
    
    private Integer idfuncao;
    private String nome;
    
    @Id
    @GeneratedValue
    public Integer getIdfuncao() {
        return idfuncao;
    }

    public void setIdfuncao(Integer idfuncao) {
        this.idfuncao = idfuncao;
    }

    @Column
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + (this.idfuncao != null ? this.idfuncao.hashCode() : 0);
        hash = 23 * hash + (this.nome != null ? this.nome.hashCode() : 0);
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
        final Funcao other = (Funcao) obj;
        if (this.idfuncao != other.idfuncao && (this.idfuncao == null || !this.idfuncao.equals(other.idfuncao))) {
            return false;
        }
        if ((this.nome == null) ? (other.nome != null) : !this.nome.equals(other.nome)) {
            return false;
        }
        return true;
    }

    
}
