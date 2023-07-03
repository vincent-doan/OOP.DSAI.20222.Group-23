package helpscreen;

import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.stage.Stage;
import mainmenu.MainScreen;
import javafx.event.ActionEvent;

public class HelpScreenController {

	@FXML
	public void btnReturnPressed(ActionEvent event) throws Exception {
		new MainScreen().start(new Stage());
		((Node)(event.getSource())).getScene().getWindow().hide();
	}
}
