package dad.login.ver;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class VerModel {
	String usuario;
	String contrasena;
	public VerModel(String user,String password) {
		usuario=user;
		this.contrasena=password;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getContrasena() {
		return contrasena;
	}
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	
	

	
}
