package helpscreen;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import utils.WindowUtils;

public class HelpScreen {

	public void start(Stage stage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("HelpScreen.fxml"));
		
		// Event handling: Window close button
		WindowUtils.setCloseConfirmation(stage);
		
		Scene scene = new Scene(root);
		stage.setTitle("Help Menu");
		stage.setScene(scene);
		stage.show();
	}
}
