/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundoconcapas.view;


import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

/**
 *
 * @author fanfu
 */
public class FXMLDocumentController {
    
    @FXML
    private Label greetingLbl;
    private Button closeBtn;
    private String greeting;
    private Stage stage;
    
    @FXML
    public void handleButtonAction(ActionEvent e) {
        greetingLbl.setText(greeting+greeting);
    }
    
    public void setGreeting(String greeting) {
        this.greeting=greeting;
    }
    
    public void initStage(Parent root) {
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setOnShowing(this::handleOnShowing);
        stage.show();
    }
    
    public void handleOnShowing(WindowEvent e) {
        greetingLbl.setText(greeting);
    }

    void setStage(Stage stage) {
        this.stage=stage;
    }
}
