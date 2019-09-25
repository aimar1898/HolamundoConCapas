/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundoconcapas.view;

import javafx.stage.Stage;
import org.junit.Test;
import static org.testfx.api.FxAssert.verifyThat;
import org.testfx.framework.junit.ApplicationTest;
import static org.testfx.matcher.control.LabeledMatchers.hasText;

/**
 *
 * @author aimar
 */
public class FXMLDocumentControllerIT extends ApplicationTest {
    private final String GREETING="Hello World With Tiers";
    
    public FXMLDocumentControllerIT() {
    }
    
    @Override
    public void start(Stage stage) throws Exception {
        JavaFxViewImplementation myapp = new JavaFxViewImplementation();
        myapp.setGreeting(GREETING);
        myapp.start(stage);
    }

    @Test
    public void testLabelHasGreeting() {
        verifyThat("#greetingLbl" , hasText(GREETING));
    }
    
    @Test
    public void testButtonClick() {
        clickOn("#closeBtn");
        verifyThat("#greetingLbl", hasText(GREETING+GREETING));
    }
    
}
