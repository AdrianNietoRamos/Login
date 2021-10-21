package dad.login.ver;

import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
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
		usuarioText=new TextField();
		contrasenaLabel=new Label("Contraseña:");
		contrasenaText=new PasswordField();
		usarCheck=new CheckBox();
		accederButton=new Button("Acceder");
		cancelarButton=new Button("Cancelar");
		
		HBox botonesBox=new HBox(5);
		botonesBox.setSpacing(10);
		botonesBox.setAlignment(Pos.CENTER);
		botonesBox.getChildren().addAll(accederButton,cancelarButton);
		
	GridPane ver=new GridPane();
	ver.setGridLinesVisible(false);
	ver.setAlignment(Pos.BASELINE_CENTER);
	ver.setVgap(10);
	ver.setHgap(10);
	ver.addRow(0, usuarioLabel,usuarioText);
	ver.addRow(1, contrasenaLabel,contrasenaText);
	ver.addRow(2, usarCheck,new Label("Usar LDAP"));
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