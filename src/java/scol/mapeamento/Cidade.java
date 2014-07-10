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
@Table(name="cidades")
public class Cidade implements Serializable{
    private Integer idcidades;
    private String nome;

    @Id
    @GeneratedValue
    public Integer getIdcidades() {
        return idcidades;
    }

    public void setIdcidades(Integer idcidades) {
        this.idcidades = idcidades;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + (this.idcidades != null ? this.idcidades.hashCode() : 0);
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
        final Cidade other = (Cidade) obj;
        if (this.idcidades != other.idcidades && (this.idcidades == null || !this.idcidades.equals(other.idcidades))) {
            return false;
        }
        return true;
    }

}
