/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package scol.repositorio.DAO;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import scol.mapeamento.Chamado;
import scol.repositorio.Chamados;

/**
 *
 * @author UhelberC
 */
public class ChamadosDAO implements Chamados {

    private Session sessao;

    public ChamadosDAO(Session sessao) {
        this.sessao = sessao;
    }

    @Override
    public List<Chamado> todos() {
        List<Chamado> chamados = this.sessao.createCriteria(Chamado.class)
                .addOrder(Order.asc("status"))
                .addOrder(Order.asc("dataabertura"))
                .list();
        return chamados;
    }

    @Override
    public List<Chamado> todosNaoFinalizados() {
        List<Chamado> chamados = this.sessao.createQuery("SELECT chmd FROM Chamado chmd where chmd.status.idstatus != :status order by chmd.status.idstatus, chmd.dataabertura")
                .setInteger("status", 7)
                .list();
        return chamados;
    }

    @Override
    public List<Chamado> todosFinalizados() {
        List<Chamado> chamados = this.sessao.createQuery("SELECT chmd FROM Chamado chmd where chmd.status.idstatus = :status order by  chmd.status.idstatus, chmd.dataabertura")
                .setInteger("status", 7)
                .list();
        return chamados;
    }

    @Override
    public List<Chamado> todosCriticos() {
        List<Chamado> chamados = this.sessao.createQuery("SELECT chmd FROM Chamado chmd where chmd.status.idstatus = :status order by chmd.status.idstatus, chmd.dataabertura")
                .setInteger("status", 1)
                .list();
        return chamados;
    }

    @Override
    public List<Chamado> todosPrioridades() {
        List<Chamado> chamados = this.sessao.createQuery("SELECT chmd FROM Chamado chmd where chmd.status.idstatus = :status order by chmd.status.idstatus, chmd.dataabertura")
                .setInteger("status", 2)
                .list();
        return chamados;
    }

    @Override
    public List<Chamado> todosAndamento() {
        List<Chamado> chamados = this.sessao.createQuery("SELECT chmd FROM Chamado chmd where chmd.status.idstatus = :status order by chmd.status.idstatus, chmd.dataabertura")
                .setInteger("status", 3)
                .list();
        return chamados;
    }

    @Override
    public List<Chamado> todosEmEspera() {
        List<Chamado> chamados = this.sessao.createQuery("SELECT chmd FROM Chamado chmd where chmd.status.idstatus = :status order by chmd.status.idstatus, chmd.dataabertura")
                .setInteger("status", 4)
                .list();
        return chamados;
    }

    @Override
    public List<Chamado> todosAguradandoGarantia() {
        List<Chamado> chamados = this.sessao.createQuery("SELECT chmd FROM Chamado chmd where chmd.status.idstatus = :status order by chmd.status.idstatus, chmd.dataabertura")
                .setInteger("status", 5)
                .list();
        return chamados;
    }

    @Override
    public List<Chamado> todosAguardandoOi() {
        List<Chamado> chamados = this.sessao.createQuery("SELECT chmd FROM Chamado chmd where chmd.status.idstatus = :status order by chmd.status.idstatus, chmd.dataabertura")
                .setInteger("status", 6)
                .list();
        return chamados;
    }

    @Override
    public Chamado porId(Integer id) {
        return (Chamado) this.sessao.get(Chamado.class, id);
    }

    @Override
    public void cadastrar(Chamado chamado) {
        this.sessao.merge(chamado);
    }

    @Override
    public void editar(Chamado chamado) {
        this.sessao.merge(chamado);
    }
}
