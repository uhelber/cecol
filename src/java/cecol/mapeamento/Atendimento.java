/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cecol.mapeamento;

import java.io.Serializable;
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
public class Atendimento implements Serializable {
    @Id
    @GeneratedValue
    private Integer idAtendimento;
    @OneToOne
    private EquipeDoAtendimento equipe;
    @OneToOne
    private Chamado chamado;
    @OneToMany
    private Parecer parecer;

    public Integer getIdAtendimento() {
        return idAtendimento;
    }

    public void setIdAtendimento(Integer idAtendimento) {
        this.idAtendimento = idAtendimento;
    }

    public EquipeDoAtendimento getEquipe() {
        return equipe;
    }

    public void setEquipe(EquipeDoAtendimento equipe) {
        this.equipe = equipe;
    }
    
    public Chamado getChamado() {
        return chamado;
    }

    public void setChamado(Chamado chamado) {
        this.chamado = chamado;
    }

    public Parecer getParecer() {
        return parecer;
    }

    public void setParecer(Parecer parecer) {
        this.parecer = parecer;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + Objects.hashCode(this.idAtendimento);
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
        final Atendimento other = (Atendimento) obj;
        if (!Objects.equals(this.idAtendimento, other.idAtendimento)) {
            return false;
        }
        return true;
    }
    
    
}
