/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package IDE;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Karadak
 */
public class LogInTest {
    
    public LogInTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of validarIngreso method, of class LogIn.
     */
    @Test    
    public void testValidarIngreso() {
        System.out.println("validarIngreso");
        String password = "admin";
        String Usuario = "adminX";
        LogIn instance = new LogIn();
        boolean expResult = true;
        boolean result = instance.validarIngreso(password, Usuario);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
