/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package scol.repositorio;

import java.util.List;
import scol.mapeamento.Chamado;

/**
 *
 * @author UhelberC
 */
public interface Chamados {
    public List<Chamado> todos();
    public List<Chamado> todosNaoFinalizados();
    public List<Chamado> todosFinalizados();
    public List<Chamado> todosCriticos();
    public List<Chamado> todosPrioridades();
    public List<Chamado> todosAndamento();
    public List<Chamado> todosEmEspera();
    public List<Chamado> todosAguradandoGarantia();
    public List<Chamado> todosAguardandoOi();
    public Chamado porId(Integer id);
    public void cadastrar(Chamado chamado);
    public void editar(Chamado chamado);
}
