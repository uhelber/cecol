/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cecol.mapeamento;

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
public class Atuacao {
    @Id
    @GeneratedValue
    private Integer idAtuacao;
    private Setor setor;
    private Regional regional;

    public Integer getIdAtuacao() {
        return idAtuacao;
    }

    public void setIdAtuacao(Integer idAtuacao) {
        this.idAtuacao = idAtuacao;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    public Regional getRegional() {
        return regional;
    }

    public void setRegional(Regional regional) {
        this.regional = regional;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.idAtuacao);
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
        final Atuacao other = (Atuacao) obj;
        if (!Objects.equals(this.idAtuacao, other.idAtuacao)) {
            return false;
        }
        return true;
    }
    
}
