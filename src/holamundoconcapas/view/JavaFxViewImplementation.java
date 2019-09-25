/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundoconcapas.view;

import java.util.logging.Logger;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.stage.Stage;

/**
 *
 * @author aimar
 * Convertimos la clase en aplicación haciendo que herede de javafx.application.Aplication.
 */
public class JavaFxViewImplementation extends javafx.application.Application implements View {
    private static final Logger LOGGER=Logger.getLogger("holamundoconcapas.view.JavaFXViewImplementation");

    private String greeting;
    /**
     * This method creates a loader, loads the elements of the stage, creates
     * a controller. Sends the greeting, the stage and initialates it.
     * @param stage A stage object.
     * @throws Exception
     */
    @Override
    public void start(Stage stage) throws Exception {
        try {
            LOGGER.info("Starting start method");
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Ventana.fxml"));
            Parent root = (Parent)loader.load();
            FXMLDocumentController viewController = ((FXMLDocumentController)loader.getController());
            viewController.setGreeting(greeting);
            viewController.setStage(stage);
            viewController.initStage(root);
            LOGGER.info("Ending start method");
        } catch(Exception e) {
            LOGGER.severe(e.getMessage());
            
        }
    }
    
    /**
     * 
     * @param greeting A string that contains the greeting.
     */
    @Override
    public void showGreeting(String greeting) {
       launch(greeting);
    }
    
    @Override
    public void init() throws Exception {
        this.greeting=getParameters().getRaw().get(0);
    }

    public void setGreeting(String greeting) {
        this.greeting=greeting;
    }
    
}
