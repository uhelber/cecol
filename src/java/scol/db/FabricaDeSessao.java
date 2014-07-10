/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package scol.db;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 *
 * @author Uhelber
 */
public class FabricaDeSessao {

    private static final SessionFactory fabricaSessao;

    static {
        try {
            Configuration configuracao = new Configuration();
            configuracao.configure();

            ServiceRegistry serviceRegistry = new ServiceRegistryBuilder()
                    .applySettings(configuracao.getProperties()).buildServiceRegistry();

            fabricaSessao = configuracao.buildSessionFactory(serviceRegistry);
        } catch (Throwable ex) {
            throw new ExceptionInInitializerError(ex);
        }
    }
    
    public Session getSessao(){
        return this.fabricaSessao.openSession();
    }
}
