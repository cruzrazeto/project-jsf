package cl.fcr.projectjsf.controllers;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import cl.fcr.projectjsf.dto.UsuarioDTO;

/**
 * @author felipe
 * Clase para mantener el manejo de sessión con el usuario logeado
 */
@ManagedBean
@SessionScoped
public class SessionController {
	/**
	 * Usuario que se mantendra en sessión
	 */
	private UsuarioDTO usuarioDTO;
	
	@PostConstruct
	public void init() {
		System.out.println("Cargando información del usuario en sesión...");
	}

	public UsuarioDTO getUsuarioDTO() {
		return usuarioDTO;
	}

	public void setUsuarioDTO(UsuarioDTO usuarioDTO) {
		this.usuarioDTO = usuarioDTO;
	}
	
	

}
