package mainmenu;

import javax.swing.JOptionPane;

import exception.MaximumDepthException;
import helpscreen.HelpScreen;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;
import treedatastructure.BalancedBinaryTree;
import treedatastructure.BalancedTree;
import treedatastructure.BinaryTree;
import treedatastructure.GenericTree;
import treescreen.TreeScreen;

public class MainScreenController {

	@FXML
	public void btnCreateGenericTreePressed(ActionEvent event) throws Exception {
		new TreeScreen().start(new GenericTree(), new Stage());
		((Node)(event.getSource())).getScene().getWindow().hide();
	}

	@FXML
	public void btnCreateBalancedTreePressed(ActionEvent event) throws Exception {
	    int maxDepth = handleMaximumDepthInput();
	    if (maxDepth != -1) {
	    	new TreeScreen().start(new BalancedTree(), new Stage());
			((Node)(event.getSource())).getScene().getWindow().hide();
	    }
	}

	@FXML
	public void btnCreateBinaryTreePressed(ActionEvent event) throws Exception {
		new TreeScreen().start(new BinaryTree(), new Stage());
		((Node)(event.getSource())).getScene().getWindow().hide();
	}

	@FXML
	public void btnCreateBalancedBinaryTreePressed(ActionEvent event) throws Exception {
		int maxDepth = handleMaximumDepthInput();
	    if (maxDepth != -1) {
	    	new TreeScreen().start(new BalancedBinaryTree(), new Stage());
			((Node)(event.getSource())).getScene().getWindow().hide();
	    }
	}

	@FXML
	public void btnHelpPressed(ActionEvent event) throws Exception {
		new HelpScreen().start(new Stage());
		((Node)(event.getSource())).getScene().getWindow().hide();
	}

	@FXML
	public void btnQuitPressed(ActionEvent event) {
		// Create a confirmation dialog
        Alert confirmationDialog = new Alert(AlertType.CONFIRMATION);
        confirmationDialog.setTitle("Confirmation");
        confirmationDialog.setHeaderText("Are you sure you want to quit?");
        
        // Show the confirmation dialog and wait for user response
        confirmationDialog.showAndWait().ifPresent(response -> {
            if (response == ButtonType.OK) {
                // Close the application
                System.exit(0);
            }
        });
	}
	
	private int handleMaximumDepthInput() {
		try {
	        String input = JOptionPane.showInputDialog("Please enter the maximum depth: ");
	        // User clicks Cancel
	        if (input == null) {
	        	return -1;
	        }
	        // User provides input
	        int maxDepth = Integer.parseInt(input);
	        if (maxDepth <= 0) {
	            throw new MaximumDepthException();
	        }
	        return maxDepth;
	    } catch (NumberFormatException | MaximumDepthException e) {
	        JOptionPane.showMessageDialog(null, "Maximum depth must be a positive integer!", "Error", JOptionPane.WARNING_MESSAGE);
	        return -1;
	    }
	}
}
