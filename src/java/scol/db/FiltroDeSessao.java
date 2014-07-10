/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package scol.db;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author UhelberC
 */
@WebFilter(servletNames={"Faces Servlet"})
public class FiltroDeSessao implements Filter{
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        FabricaDeSessao fds = new FabricaDeSessao();
        Session sessao = fds.getSessao();
        Transaction trx = null;
        
        try {
            trx = sessao.beginTransaction();
            request.setAttribute("sessao", sessao);
            
            chain.doFilter(request, response);
            
            trx.commit();
        } catch (Exception e) {
            if(trx != null){
                trx.rollback();                
            }
        }finally{
            sessao.close();            
        }
    }

    @Override
    public void destroy() {
    }
    
}
