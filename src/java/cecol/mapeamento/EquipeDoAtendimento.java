/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cecol.mapeamento;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author UhelberC
 */
@Entity
@Table
public class EquipeDoAtendimento implements Serializable {
    @Id
    @GeneratedValue
    private Integer idequipedoatendimento;
    @OneToMany
    private Usuario tecnico;

    public Integer getIdequipedoatendimento() {
        return idequipedoatendimento;
    }

    public void setIdequipedoatendimento(Integer idequipedoatendimento) {
        this.idequipedoatendimento = idequipedoatendimento;
    }

    public Usuario getTecnico() {
        return tecnico;
    }

    public void setTecnico(Usuario tecnico) {
        this.tecnico = tecnico;
    }
    
}
