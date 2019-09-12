/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundoconcapas;

import holamundoconcapas.controller.Controller;
import holamundoconcapas.model.ModelFactory;
import holamundoconcapas.view.ViewFactory;

/**
 *
 * @author fanfu
 */
public class Aplication {
    
    public static void main(String[] args) {
        
        ViewFactory factVista = new ViewFactory();
        ModelFactory factModelo = new ModelFactory();
      
        Controller controlador = new Controller();
        controlador.run(factVista.getView(),factModelo.getModel());
    }
}
