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

	
}
