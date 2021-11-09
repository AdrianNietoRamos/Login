package dad.login.ver;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import org.apache.commons.codec.digest.DigestUtils;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.scene.control.PasswordField;

public class VerModel {
	private StringProperty usuario= new SimpleStringProperty();
	private StringProperty contrasena= new SimpleStringProperty();
    private BooleanProperty check=new SimpleBooleanProperty();
	public StringProperty usuarioProperty() {
		return this.usuario;
	}
	
	public String getUsuario() {
		return this.usuarioProperty().get();
	}
	
	public void setUsuario(final String usuario) {
		this.usuarioProperty().set(usuario);
	}
	
	public StringProperty contrasenaProperty() {
		return this.contrasena;
	}
	
	public String getContrasena() {
		return this.contrasenaProperty().get();
	}
	
	public void setContrasena(final String contrasena) {
		this.contrasenaProperty().set(contrasena);
	}
	
	public BooleanProperty checkProperty() {
		return this.check;
	}
	
	public boolean isCheck() {
		return this.checkProperty().get();
	}
	
	public void setCheck(final boolean check) {
		this.checkProperty().set(check);
	}
	
	
	
	
	
	
	
	
	
	
	

	
}
