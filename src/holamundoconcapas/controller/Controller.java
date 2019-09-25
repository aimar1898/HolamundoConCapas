/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundoconcapas.controller;

import holamundoconcapas.model.Model;
import holamundoconcapas.view.View;
import java.util.logging.Logger;

/**
 *
 * @author aimar
 */
public class Controller {
    private static final Logger LOGGER=Logger.getLogger("holamundoconcapas.controller.Controller");
    /**
     * Este método recibe la vista y el modelo e inicia la aplicación.
     * @param view the view object.
     * @param model the model object.
     */
    public void run(View view,Model model) {
        try {
            LOGGER.info("Starting run method");
            //String greeting = model.getGreeting();
            //view.showGreeting(greeting);
            view.showGreeting(model.getGreeting());
            LOGGER.info("Ending run method");
        } catch (Exception e) {
            LOGGER.severe(e.getMessage());
        }
        
    }
}
