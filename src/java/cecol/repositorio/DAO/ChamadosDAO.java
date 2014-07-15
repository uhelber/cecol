/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cecol.repositorio.DAO;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import cecol.mapeamento.Chamado;
import cecol.repositorio.Chamados;

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
    public List<Chamado> naoFinalizados() {
        List<Chamado> chamados = this.sessao.createQuery("SELECT chmd FROM Chamado chmd where chmd.status.idstatus != :status order by chmd.status.idstatus, chmd.dataabertura")
                .setInteger("status", 7)
                .list();
        return chamados;
    }

    @Override
    public List<Chamado> finalizados() {
        List<Chamado> chamados = this.sessao.createQuery("SELECT chmd FROM Chamado chmd where chmd.status.idstatus = :status order by  chmd.status.idstatus, chmd.dataabertura")
                .setInteger("status", 7)
                .list();
        return chamados;
    }

    @Override
    public List<Chamado> criticos() {
        List<Chamado> chamados = this.sessao.createQuery("SELECT chmd FROM Chamado chmd where chmd.status.idstatus = :status order by chmd.status.idstatus, chmd.dataabertura")
                .setInteger("status", 1)
                .list();
        return chamados;
    }

    @Override
    public List<Chamado> prioridades() {
        List<Chamado> chamados = this.sessao.createQuery("SELECT chmd FROM Chamado chmd where chmd.status.idstatus = :status order by chmd.status.idstatus, chmd.dataabertura")
                .setInteger("status", 2)
                .list();
        return chamados;
    }

    @Override
    public List<Chamado> andamento() {
        List<Chamado> chamados = this.sessao.createQuery("SELECT chmd FROM Chamado chmd where chmd.status.idstatus = :status order by chmd.status.idstatus, chmd.dataabertura")
                .setInteger("status", 3)
                .list();
        return chamados;
    }

    @Override
    public List<Chamado> emEspera() {
        List<Chamado> chamados = this.sessao.createQuery("SELECT chmd FROM Chamado chmd where chmd.status.idstatus = :status order by chmd.status.idstatus, chmd.dataabertura")
                .setInteger("status", 4)
                .list();
        return chamados;
    }

    @Override
    public List<Chamado> aguradandoGarantia() {
        List<Chamado> chamados = this.sessao.createQuery("SELECT chmd FROM Chamado chmd where chmd.status.idstatus = :status order by chmd.status.idstatus, chmd.dataabertura")
                .setInteger("status", 5)
                .list();
        return chamados;
    }

    @Override
    public List<Chamado> aguardandoOi() {
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
