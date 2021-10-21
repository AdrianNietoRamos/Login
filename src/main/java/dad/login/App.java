package dad.login;

import dad.login.ver.VerController;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
private VerController vercontroller;
private Scene scene;
	@Override
	public void start(Stage primaryStage) throws Exception {
		vercontroller=new VerController();
		scene=new Scene(vercontroller.getView(),480,320);
		primaryStage.setTitle("");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	

	public Scene getScene() {
		return scene;
	}


	public static void main(String[] args) {
		launch(args);

	}

}
