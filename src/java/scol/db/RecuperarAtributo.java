/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package scol.db;

import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author UhelberC
 */
public class RecuperarAtributo {

    private Object atributo;

    public Object getAtributo() {
        return atributo;
    }

    public void setAtributo(Object atributo) {
        this.atributo = atributo;
    }

    public RecuperarAtributo(String nome) {
        this.atributo = this.getRequestAttrute(nome);
    }

    public Object getRequestAttrute(String nome) {
        FacesContext fc = FacesContext.getCurrentInstance();
        ExternalContext ec = fc.getExternalContext();
        HttpServletRequest hsr = (HttpServletRequest) ec.getRequest();
        return hsr.getAttribute(nome);
    }
}
