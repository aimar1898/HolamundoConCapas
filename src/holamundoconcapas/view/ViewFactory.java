/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundoconcapas.view;

/**
 *
 * @author fanfu
 */
public class ViewFactory {
    
    public ViewInterface getView() {
        return new ViewImplementation();
    }
    
}
