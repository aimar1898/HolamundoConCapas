/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundoconcapas.model;

/**
 *
 * @author fanfu
 */
public class ModelFactory {
    
    public ModelInterface getModel() {
        return new ModelImplementation();
    }
}
