package dad.login.ver;

import javafx.application.Platform;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class VerView extends VBox{
	private Label usuarioLabel;
	private TextField usuarioText;
	private Label contrasenaLabel;
	private PasswordField contrasenaText;
	private CheckBox usarCheck;
	private Button accederButton;
	private Button cancelarButton;
	public VerView() {
		super();
		usuarioLabel=new Label("Usuario:");
		usuarioText=new TextField("Nombre de usuario");
		contrasenaLabel=new Label("Contraseña:");
		contrasenaText=new PasswordField();
		usarCheck=new CheckBox();
		usarCheck.setAlignment(Pos.CENTER);
		accederButton=new Button("Acceder");
		cancelarButton=new Button("Cancelar");
		
		HBox botonesBox=new HBox(5);
		botonesBox.setSpacing(10);
		botonesBox.setAlignment(Pos.CENTER_LEFT);
		botonesBox.getChildren().addAll(accederButton,cancelarButton);
		HBox checkboxBox=new HBox(5);
		checkboxBox.setSpacing(10);
		checkboxBox.setAlignment(Pos.CENTER_LEFT);
		checkboxBox.getChildren().addAll(usarCheck,new Label("Usar LDAP"));
		
	GridPane ver=new GridPane();
	ver.setGridLinesVisible(false);
	ver.setAlignment(Pos.BASELINE_CENTER);
	ver.setVgap(10);
	ver.setHgap(10);
	ver.addRow(0, usuarioLabel,usuarioText);
	ver.addRow(1, contrasenaLabel,contrasenaText);
	
	ver.addColumn(1, checkboxBox);
	ver.addRow(3, new Label(""), botonesBox);
	
	
	ColumnConstraints[] cons1 = { new ColumnConstraints(), new ColumnConstraints(), };
	cons1[0].setHalignment(HPos.LEFT);
	cons1[1].setFillWidth(true);
	
	
	ver.getColumnConstraints().setAll(cons1);
	

	this.setSpacing(15);
	this.setAlignment(Pos.CENTER);
	this.setPrefHeight(20);
	this.getChildren().addAll(ver);
	this.setPadding(new Insets(30, 50, 50, 5));		
}
	public void mostrarAlertAccesoPermitido() {
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Iniciar sesión");
		alert.setHeaderText("Acceso permitido");
		alert.setContentText("Las credenciales de acceso son válidas.");

		alert.showAndWait();
		Platform.exit();
	}
	
	public void mostrarAlertAccesoDenegado() {
		Alert alert = new Alert(AlertType.ERROR);
		alert.setTitle("Iniciar sesión");
		alert.setHeaderText("Acceso denegado");
		alert.setContentText("El usuario y/o la contraseña no son válidos.");

		alert.showAndWait();
		
	}
	
	public void mostrarAlertFicheroNoEncontrado() {
		Alert alert = new Alert(AlertType.ERROR);
		alert.setTitle("Iniciar sesión");
		alert.setHeaderText("Fichero no encontrado");
		alert.setContentText("Se ha producido un error intentando acceder al fichero con los datos de los usuarios");

		alert.showAndWait();
	}

	public TextField getUsuarioText() {
		return usuarioText;
	}
	
	public PasswordField getContrasenaText() {
		return contrasenaText;
	}
	
	public CheckBox getUsarCheck() {
		return usarCheck;
	}
	
	public Button getAccederButton() {
		return accederButton;
	}
	
	public Button getCancelarButton() {
		return cancelarButton;
	}
	
}