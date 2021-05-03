/**
 * 
 */
package cl.fcr.projectjsf.controllers;

import java.io.IOException;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

/**
 * @author felipe
 * Clase que se encarga de cerrar la sesión
 */

@ManagedBean
public class SessionClosedController {
	
	@PostConstruct
    public void init() {
    	System.out.println("Sesión cerrada");
    }
	
	/*
	 * Metodo que permite cerrar la session del usuario
	 */
	public void cerrarSession()  {
		ExternalContext externalContext =FacesContext.getCurrentInstance().getExternalContext();
		externalContext.invalidateSession();
		try {
			redirect("login.xhtml");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void redirect(String page) throws IOException {
		ExternalContext externalContext =FacesContext.getCurrentInstance().getExternalContext();
		externalContext.redirect(page);
	}
	
}
