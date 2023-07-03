package treescreen;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import mainmenu.MainScreen;
import treedatastructure.BalancedBinaryTree;
import treedatastructure.BalancedTree;
import treedatastructure.BinaryTree;
import treedatastructure.GenericTree;

public class TreeScreenController {
	
	private GenericTree tree;
	
    @FXML
    private TextField tfParentNode;

    @FXML
    private TextField tfChildNode;

    @FXML
    private TextField tfDeleteNode;

    @FXML
    private TextField tfSearchNode;

    @FXML
    private TextField tfOldNode;

    @FXML
    private TextField tfNewNode;

    @FXML
    private ToggleGroup algorithmChoice;

    @FXML
    private Pane drawPane;

    @FXML
    private Rectangle rtgLine1;

    @FXML
    private Rectangle rtgLine2;

    @FXML
    private Rectangle rtgLine3;

    @FXML
    private Rectangle rtgLine4;

    @FXML
    private Rectangle rtgLine5;

    @FXML
    private Rectangle rtgLine6;

    @FXML
    private Pane srcInsert;

    @FXML
    private Pane srcDelete;

    @FXML
    private Pane srcSearch;

    @FXML
    private Pane srcUpdate;

    @FXML
    private Pane srcTraverse;

    @FXML
    private Button btnBackward;

    @FXML
    private Button btnForward;

    @FXML
    private Button btnPause;

    @FXML
    private Button btnContinue;
    
    // Set the correct child-class data type to the attribute tree
    public void setTree(GenericTree tree) {
        if (tree instanceof BalancedBinaryTree) {
            BalancedBinaryTree tree2 = (BalancedBinaryTree) tree;
            this.tree = tree2;
        } else if (tree instanceof BalancedTree) {
            BalancedTree tree2 = (BalancedTree) tree;
            this.tree = tree2;
        } else if (tree instanceof BinaryTree) {
            BinaryTree tree2 = (BinaryTree) tree;
            this.tree = tree2;
        }
    }
        
    public Pane getDrawPane() {
		return drawPane;
	}

	@FXML
    public void initialize() {
    	// Disable buttons
        btnBackward.setDisable(true);
        btnForward.setDisable(true);
        btnContinue.setDisable(true);
        
        // Disable text field
        tfParentNode.setDisable(true);
    }
    
    @FXML
    private ProgressBar progressBar;
    
	@FXML
    void btnBackwardPressed(ActionEvent event) {

    }

    @FXML
    void btnContinuePressed(ActionEvent event) {

    }

    @FXML
    void btnDeletePressed(ActionEvent event) {

    }

    @FXML
    void btnForwardPressed(ActionEvent event) {

    }

    @FXML
    void btnInsertPressed(ActionEvent event) {

    }

    @FXML
    void btnPausePressed(ActionEvent event) {

    }

    @FXML
    void btnRedoPressed(ActionEvent event) {

    }

    @FXML
    void btnReturnPressed(ActionEvent event) throws Exception {
    	new MainScreen().start(new Stage());
		((Node)(event.getSource())).getScene().getWindow().hide();
    }

    @FXML
    void btnSearchPressed(ActionEvent event) {

    }

    @FXML
    void btnTraversePressed(ActionEvent event) {

    }

    @FXML
    void btnUpdatePressed(ActionEvent event) {

    }
}
