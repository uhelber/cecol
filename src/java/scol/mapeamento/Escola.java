/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package scol.mapeamento;

import java.io.Serializable;
import javax.persistence.Column;
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
public class Escola implements Serializable {
    private Integer idescola;
    private Regional regional;
    private Cidade cidade;
    private Integer inep;
    private String nome;
    private String endereco;
    private String bairro;
    private String telefone;
    private String telefone2;
    private String modalidade;
    private String modalidade2;

    @Id
    @GeneratedValue
    public Integer getIdescola() {
        return idescola;
    }

    public void setIdescola(Integer idescola) {
        this.idescola = idescola;
    }

    @ManyToOne
    @JoinColumn(name="regional")
    public Regional getRegional() {
        return regional;
    }

    public void setRegional(Regional regional) {
        this.regional = regional;
    }

    @ManyToOne
    @JoinColumn(name="cidade")
    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public Integer getInep() {
        return inep;
    }

    public void setInep(Integer inep) {
        this.inep = inep;
    }

    @Column(name="escola")
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
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

    public String getModalidade() {
        return modalidade;
    }

    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }

    public String getModalidade2() {
        return modalidade2;
    }

    public void setModalidade2(String modalidade2) {
        this.modalidade2 = modalidade2;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + (this.idescola != null ? this.idescola.hashCode() : 0);
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
        final Escola other = (Escola) obj;
        if (this.idescola != other.idescola && (this.idescola == null || !this.idescola.equals(other.idescola))) {
            return false;
        }
        return true;
    }

}
