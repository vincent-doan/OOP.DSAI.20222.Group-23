package treescreen;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
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
    private Tab tabInsert;
	
	@FXML
    private Tab tabDelete;

    @FXML
    private Tab tabSearch;
    
    @FXML
    private Tab tabUpdate;
    
    @FXML
    private Tab tabTraverse;
	
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
    
    @FXML
    private ProgressBar progressBar;
    
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
    
    // Set the initial state of TreeScreen window
	@FXML
    public void initialize() {
    	// Disable play-related buttons
        btnBackward.setDisable(true);
        btnForward.setDisable(true);
        btnPause.setDisable(true);
        btnContinue.setDisable(true);
        
        // Disable Parent Node text field
        tfParentNode.setDisable(true);
        
        // Disable all tabs except Insert Node
        tabDelete.setDisable(true);
        tabSearch.setDisable(true);
        tabUpdate.setDisable(true);
        tabTraverse.setDisable(true);
        
        // Bind the pseudocode pane visibility to tab selected
        srcInsert.visibleProperty().bind(tabInsert.selectedProperty());
        srcDelete.visibleProperty().bind(tabDelete.selectedProperty());
        srcUpdate.visibleProperty().bind(tabUpdate.selectedProperty());
        srcSearch.visibleProperty().bind(tabSearch.selectedProperty());
        srcTraverse.visibleProperty().bind(tabTraverse.selectedProperty());
    }
    
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
    void btnSearchPressed(ActionEvent event) {

    }

    @FXML
    void btnTraversePressed(ActionEvent event) {

    }

    @FXML
    void btnUpdatePressed(ActionEvent event) {

    }
    
    // Blank out entire drawPane and start from scratch
    @FXML
    void btnRedoPressed(ActionEvent event) {

    }  
    
    // Return to main menu
    @FXML
    void btnReturnPressed(ActionEvent event) throws Exception {
    	new MainScreen().start(new Stage());
		((Node)(event.getSource())).getScene().getWindow().hide();
    }
}
