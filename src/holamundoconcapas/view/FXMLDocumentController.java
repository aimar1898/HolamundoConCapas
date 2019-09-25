/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundoconcapas.view;

import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

/**
 * The FXML View Controller class.
 * @author aimar
 */
public class FXMLDocumentController {
    private static final Logger LOGGER=Logger.getLogger("holamundoconcapas.view.FXMLDocumentController");
    
    @FXML
    private Label greetingLbl;
    private String greeting;
    private Stage stage;
    
    /**
     * This method sets the behavior for the button.
     * @param e An ActionEvent object. 
     */
    @FXML
    public void handleButtonAction(ActionEvent e) {
        greetingLbl.setText(greeting+greeting);

    }
    
    /**
     * A setter for the greeting attribute
     * @param greeting A string that contains the greeting
     */
    public void setGreeting(String greeting) {
        this.greeting=greeting;
    }
    
    /**
     * This custom method initializes the stage with the settings we want.
     * @param root A Parent type object.
     */
    public void initStage(Parent root) {
        LOGGER.info("Starting initStage method");
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setOnShowing(this::handleOnShowing);
        stage.show();
        LOGGER.info("Ending initStage method");
    }
    
    /**
     * This method sets actions to do before showing the view.
     * @param e a WindowEvent object.
     */
    public void handleOnShowing(WindowEvent e) {
        greetingLbl.setText(greeting);
    }

    /**
     * A setter for the stage attibute.
     * @param stage a Stage object.
     */
    void setStage(Stage stage) {
        this.stage=stage;
    }
}
