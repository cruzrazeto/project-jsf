/**
 * 
 */
package cl.fcr.projectjsf.controllers;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

/**
 * @author felipe
 * Clase para el funcionamiento de la pantalla de login
 */
@ManagedBean(name="loginController")
public class LoginController {
    private String usuario;
    private String password;
    
    public void ingresar() {
        System.out.print("Usuario" + usuario);
        if (usuario.equals("felipe") && password.equals("12345")) {
            FacesContext.getCurrentInstance().addMessage("formLogin:txtUsuario", new FacesMessage(FacesMessage.SEVERITY_INFO, "Usuario correcto", ""));
            
        } else {
            FacesContext.getCurrentInstance().addMessage("formLogin:txtUsuario", new FacesMessage(FacesMessage.SEVERITY_ERROR, "Usuario y/o contraseña incorrectos", ""));
        }
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
