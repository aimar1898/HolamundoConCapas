/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundoconcapas.controller;

import holamundoconcapas.model.Model;
import holamundoconcapas.view.View;

/**
 *
 * @author fanfu
 */
public class Controller {
    /**
     * 
     * @param view the view object.
     * @param model the model object.
     */
    public void run(View view,Model model) {
        String greeting = model.getGreeting();
        view.showGreeting(greeting);
    }
}
