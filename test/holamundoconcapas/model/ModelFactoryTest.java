/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundoconcapas.model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
/**
 * Hacemos un import estático de Assert para poder importar todos los métodos
 * de la clase Assert.
 */
import static org.junit.Assert.*;

/**
 *
 * @author fanfu
 */
public class ModelFactoryTest {
    
    public ModelFactoryTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getModel method, of class ModelFactory.
     */
    @Test
    public void testGetModel() {
        ModelFactory factModelo = new ModelFactory();
        assertNotNull(factModelo.getModel());
    }
    
}
