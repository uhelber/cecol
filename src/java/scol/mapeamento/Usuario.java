/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package scol.mapeamento;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author UhelberC
 */

@Entity
@Table(name="usuarios")
public class Usuario implements Serializable {

    private Integer idusuarios;
    private String nome;
    private String sobrenome;
    private Setor setor;
    private Funcao funcao;
    private Date datanascimento;
    private String datacadastro;
    private Integer cadastrador;
    private String telefone;
    private String matricula;
    private Login login;
    private Permissao permissao;
    private AtivarConta ativarconta;

    @Id
    @GeneratedValue
    public Integer getIdusuarios() {
        return idusuarios;
    }

    public void setIdusuarios(Integer idusuarios) {
        this.idusuarios = idusuarios;
    }

    @Column
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Column
    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    @ManyToOne
    @JoinColumn(name="setor")
    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    @ManyToOne
    @JoinColumn(name="funcao")
    public Funcao getFuncao() {
        return funcao;
    }

    public void setFuncao(Funcao funcao) {
        this.funcao = funcao;
    }

    @Temporal(javax.persistence.TemporalType.DATE)
    public Date getDatanascimento() {
        return datanascimento;
    }

    public void setDatanascimento(Date datanascimento) {
        this.datanascimento = datanascimento;
    }

    public String getDatacadastro() {
        return datacadastro;
    }

    public void setDatacadastro(String datacadastro) {
        this.datacadastro = datacadastro;
    }

    public Integer getCadastrador() {
        return cadastrador;
    }

    public void setCadastrador(Integer cadastrador) {
        this.cadastrador = cadastrador;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @ManyToOne
    @JoinColumn(name="login")
    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }

    @ManyToOne
    @JoinColumn(name="permissao")
    public Permissao getPermissao() {
        return permissao;
    }

    public void setPermissao(Permissao permissao) {
        this.permissao = permissao;
    }

    @ManyToOne
    @JoinColumn(name="ativarconta")
    public AtivarConta getAtivarconta() {
        return ativarconta;
    }

    public void setAtivarconta(AtivarConta ativarconta) {
        this.ativarconta = ativarconta;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + (this.idusuarios != null ? this.idusuarios.hashCode() : 0);
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
        final Usuario other = (Usuario) obj;
        if (this.idusuarios != other.idusuarios && (this.idusuarios == null || !this.idusuarios.equals(other.idusuarios))) {
            return false;
        }
        return true;
    }
}
