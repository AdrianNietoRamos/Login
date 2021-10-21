package dad.login.ver;

import dad.login.ver.VerModel;
import dad.login.ver.VerView;
import javafx.event.ActionEvent;
import javafx.stage.Stage;

public class VerController {
	private VerView view = new VerView();
	public VerController() {
		view.getAccederButton().setOnAction(e->onAccederAction(e));
		view.getCancelarButton().setOnAction(e->onCancelarAction(e));
	}
	private void onCancelarAction(ActionEvent e) {
		
	}
	private void onAccederAction(ActionEvent e) {
		
	}
	public VerView getView() {
		return view;
	}
}
