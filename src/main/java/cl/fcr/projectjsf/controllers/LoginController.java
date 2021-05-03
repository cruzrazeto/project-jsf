/**
 * 
 */
package cl.fcr.projectjsf.controllers;

import java.io.IOException;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

import cl.fcr.projectjsf.dto.UsuarioDTO;

/**
 * @author felipe Clase para el funcionamiento de la pantalla de login
 */
@ManagedBean(name = "loginController")
public class LoginController {
	private String usuario;
	private String password;
	
	/*
	 * Bean que mantiene la información en sesion
	 */
	@ManagedProperty("#{sessionController}")
	private SessionController sessionController;

	public SessionController getSessionController() {
		return sessionController;
	}

	public void setSessionController(SessionController sessionController) {
		this.sessionController = sessionController;
	}

	public void ingresar() {
		try {
			System.out.print("Usuario" + usuario);
			if (usuario.equals("felipe") && password.equals("12345")) {
				UsuarioDTO usuarioDTO = new UsuarioDTO();
				usuarioDTO.setUsuario(usuario);
				this.sessionController.setUsuarioDTO(usuarioDTO);
				this.redireccionar("empleado.xhtml");
			} else {
				FacesContext.getCurrentInstance().addMessage("formLogin:txtUsuario",
						new FacesMessage(FacesMessage.SEVERITY_ERROR, "Usuario y/o contraseña incorrectos", ""));
			}
		} catch (IOException e) {
			FacesContext.getCurrentInstance().addMessage("formLogin:txtUsuario",
					new FacesMessage(FacesMessage.SEVERITY_FATAL, "La página no existe", ""));
			e.printStackTrace();
		}

	}

	private void redireccionar(String pagina) throws IOException {
		ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
		ec.redirect(pagina);
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
