package treescreen;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import treedatastructure.GenericTree;
import utils.WindowUtils;

public class TreeScreen {

	public void start(GenericTree tree, Stage stage) throws Exception {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("TreeScreen.fxml"));
		Parent root = loader.load();
		
		TreeScreenController controller = loader.getController();
		controller.setTree(tree);
			
		// Event handling: Window close button
		WindowUtils.setCloseConfirmation(stage);
		
		Scene scene = new Scene(root);
		stage.setTitle("Tree Visualization");
		stage.setScene(scene);
		stage.show();
	}
}
