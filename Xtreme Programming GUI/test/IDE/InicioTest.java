/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package IDE;

import java.util.ArrayList;
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
public class InicioTest {
    
    ArrayList<String> nombres = new ArrayList(); 
    Inicio principal = new Inicio();
    
    public InicioTest() {
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
     * Test of llenar_Array method, of class Inicio.
     */
    
    
    
    @Test
    public void testLlenar_Array() {
        System.out.println("llenar_Array");
        
        assertEquals("Nelson", principal.llenar_Array("Nelson"));
        
        
//        System.out.println(principal.tamaño_array());
//        
//         assertEquals(3, principal.tamaño_array());
    }
    
    @Test
    public void testTamaño_array()
    {
        System.out.println("Tamaño "+principal.tamaño_array());
        //assertEquals(3, principal.tamaño_array());
    }

    /**
     * Test of main method, of class Inicio.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Inicio.main(args);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
