package dad.login.ver;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


import org.apache.commons.codec.digest.DigestUtils;

import dad.login.auth.AuthService;
import dad.login.auth.FileAuthService;
import dad.login.auth.LdapAuthService;
import dad.login.ver.VerModel;
import dad.login.ver.VerView;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

public class VerController {
	
	private VerView view = new VerView();
	private VerModel model=new VerModel();
	private BufferedReader br;
	int i;
	
	
	public VerController() {
		view.getUsuarioText().textProperty().bindBidirectional(model.usuarioProperty());
		view.getContrasenaText().textProperty().bindBidirectional(model.contrasenaProperty());
		view.getUsarCheck().selectedProperty().bindBidirectional(model.checkProperty());
		view.getAccederButton().setOnAction(e->onAccederButton(e));
		view.getCancelarButton().setOnAction(e->onCancelarButton(e));
	}
	
	private void onAccederButton(ActionEvent e)  {
		if(!model.isCheck()) {
			try {
				br = new BufferedReader(new FileReader("src\\main\\resources\\users.csv"));
				String linea = br.readLine();
				int user = 0;
				int password = 0;
				String[] valores;
				while (null != linea) {
					valores = linea.split(",");
					linea = br.readLine();
					for (int i = 0; i < valores.length; i++) {
						if (i % 2 == 0) {
							if (model.getUsuario().equals(valores[i])) {
								user++;
							}
						} else {
							String contra = model.getContrasena();
							String md5 = DigestUtils.md5Hex(contra).toUpperCase();
							if (md5.equals(valores[i])) {
								password++;
							}
						}

					}
				}
				if (user > 0 && password > 0) {
					Alert alert = new Alert(AlertType.INFORMATION);
					alert.setTitle("Login");
					alert.setHeaderText("Acceso permitido");
					alert.setContentText("El usuario y la contraseña son correctos");
					alert.showAndWait();
					System.exit(0);
				} else {
					Alert alert = new Alert(AlertType.ERROR);
					alert.setTitle("Login");
					alert.setHeaderText("Acceso denegado");
					alert.setContentText("El usuario y/o contraseña son incorrectos");
					alert.showAndWait();
					model.setContrasena("");
				}

			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}else {
			boolean checkldap = true;
			AuthService ldap = checkldap ? new LdapAuthService() : new FileAuthService();
			try {
				if (ldap.login(model.getUsuario(), model.getContrasena()) == true) {
					Alert alert = new Alert(AlertType.INFORMATION);
					alert.setTitle("Login");
					alert.setHeaderText("Acceso permitido");
					alert.setContentText("El usuario y la contraseña son correctos");
					alert.showAndWait();
					System.exit(0);

				} else {
					Alert alert = new Alert(AlertType.ERROR);
					alert.setTitle("Login");
					alert.setHeaderText("Acceso denegado");
					alert.setContentText("El usuario y/o contraseña son incorrectos");
					alert.showAndWait();
					model.setContrasena("");
				}
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}

	}
	private void onCancelarButton(ActionEvent e) {
		System.exit(0);
	}
	public VerView getView() {
		return view;
	}
	public VerModel getModel() {
		return model;
	}
}
