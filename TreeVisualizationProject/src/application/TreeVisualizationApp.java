package application;

import javafx.application.Application;
import javafx.stage.Stage;
import mainmenu.MainScreen;

public class TreeVisualizationApp extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		new MainScreen().start(stage);
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
