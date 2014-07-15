/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cecol.repositorio;

import java.util.List;
import cecol.mapeamento.Chamado;

/**
 *
 * @author UhelberC
 */
public interface Chamados {
    public List<Chamado> todos();
    public List<Chamado> naoFinalizados();
    public List<Chamado> finalizados();
    public List<Chamado> criticos();
    public List<Chamado> prioridades();
    public List<Chamado> andamento();
    public List<Chamado> emEspera();
    public List<Chamado> aguradandoGarantia();
    public List<Chamado> aguardandoOi();
    public Chamado porId(Integer id);
    public void cadastrar(Chamado chamado);
    public void editar(Chamado chamado);
}
