/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundoconcapas.controller;

import holamundoconcapas.model.ModelInterface;
import holamundoconcapas.view.ViewInterface;

/**
 *
 * @author fanfu
 */
public class Controller {
    
    public void run(ViewInterface view,ModelInterface model) {
        String greeting = model.getGreeting();
        view.showGreeting(greeting);
    }
}
