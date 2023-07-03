package mainmenu;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import utils.WindowUtils;

public class MainScreen {

	public void start(Stage stage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("MainScreen.fxml"));
		
		// Event handling: Window close button
		WindowUtils.setCloseConfirmation(stage);
		
		Scene scene = new Scene(root);
		stage.setTitle("Tree Visualization Application");
		stage.setScene(scene);
		stage.show();
	}
}
