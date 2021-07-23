package bean;

import java.io.IOException;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

import dto.UsuarioDTO;

@ManagedBean(name = "loginBean")
public class LoginController {

	private String user;
	private String pswd;
	
	// Mantiene la información en sesión
	@ManagedProperty("#{sessionController}")
	private SessionController sessionController;

	public void ingresar() throws IOException {
		if (user.equals("developer") && pswd.equals("1234")) {
			
			try {
				UsuarioDTO usuarioDTO = new UsuarioDTO();
				usuarioDTO.setUsuario(this.user);
				usuarioDTO.setPassword(this.pswd);
				
				this.sessionController.setUsuarioDTO(usuarioDTO);
				this.redireccionar("Principal.xhtml");
			} catch (IOException e) {
				FacesContext.getCurrentInstance().addMessage("formLogin:txtUser",
						new FacesMessage(FacesMessage.SEVERITY_FATAL, "No se econtró la página", ""));
				System.out.println("Error al direccionar: "+ e.getMessage());
			}
			
			FacesContext.getCurrentInstance().addMessage("formLogin:txtUser",
					new FacesMessage(FacesMessage.SEVERITY_INFO, "Usuario correcto", ""));
		} else {
			System.out.println("Usuario: " + user);
			System.out.println("Contraseña: " + pswd);
			FacesContext.getCurrentInstance().addMessage("formLogin:txtUser",
					new FacesMessage(FacesMessage.SEVERITY_ERROR, "Usuario y/o contraseña incorrectos", ""));
		}
	}
	
	private void redireccionar(String pagina) throws IOException{
		ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
		ec.redirect(pagina);
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPswd() {
		return pswd;
	}

	public void setPswd(String pswd) {
		this.pswd = pswd;
	}

	public SessionController getSessionController() {
		return sessionController;
	}

	public void setSessionController(SessionController sessionController) {
		this.sessionController = sessionController;
	}
}