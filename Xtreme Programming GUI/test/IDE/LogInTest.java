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
        System.out.println("Metodo que valida el ingreso de un Usuario");
        
        String password = "admin";          // password por default | si se cambia uno de estos valores la prueba falla
        String Usuario = "admin";           // usuario por default  | si se cambia uno de estos valores la prueba falla
        LogIn instancia = new LogIn();      // instancia de la clase que verifica el logeo
        boolean expResult = true;           // valor que se espera del resultado, si es verdadero habilita la ventana principal
        
        
        boolean resultado = false;
        System.out.println("Se enviaron los parametros: "+password + " | "+Usuario);
        
        resultado = instancia.validarIngreso(password, Usuario); // enviamos los datos a la clase que verifica
        System.out.println("resultado de la comprobacion: "+resultado);
        
        assertEquals(expResult, resultado);    // compramos el resultado
   
    }
}
