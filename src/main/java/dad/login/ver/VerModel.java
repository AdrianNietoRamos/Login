package dad.login.ver;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class VerModel {
private final StringProperty usuario=new SimpleStringProperty();

public final StringProperty usuarioProperty() {
	return this.usuario;
	
}
}
