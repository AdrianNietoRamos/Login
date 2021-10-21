package dad.login.ver;

import dad.login.ver.VerModel;
import dad.login.ver.VerView;
import javafx.event.ActionEvent;

public class VerController {
	private VerView view = new VerView();
	public VerController() {
		view.getAccederButton().setOnAction(e->onAccederAction(e));
		view.getCancelarButton().setOnAction(e->onCancelarAction(e));
	}
	private Object onCancelarAction(ActionEvent e) {
		// TODO Auto-generated method stub
		return null;
	}
	private Object onAccederAction(ActionEvent e) {
		// TODO Auto-generated method stub
		return null;
	}
}
