/**
 * Test and validate the functionality of the Validator Class
 *
 * @author ...
 */
package passwordvalidator;

import org.junit.After;
import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author haki
 */
public class PasswordValidatorTest {

    public PasswordValidatorTest() {
    }

    @Before
    public void setUp() {
        // Add any logic you want to have prior to running each test case
        System.out.println("This will run before every test case!!");
    }

    @After
    public void tearDown() {
        // Add any logic you want to have after the execution of each test case
        System.out.println("This will run after every test case!!");
    }

    /**
     * Test of checkLength method, validate the happy path of class PasswordValidator.
     */
    @Test
    public void testCheckLengthGood() { 
        System.out.println("checkLengthGood");
        String pass = "qwertyupiosd";
        boolean expResult = true;
        
        boolean actualResult = PasswordValidator.checkLength(pass);

        assertEquals(expResult, actualResult);
        
        assertTrue(actualResult);
    }
    
    /**
     * Test of checkLength method, validate the Bad path of class PasswordValidator.
     */
    @Test
    public void testCheckLengthBad() { 
        System.out.println("checkLengthBad");
        String pass = "qwerty";
        boolean expResult = false;
        
        boolean actualResult = passwordvalidator.PasswordValidator.checkLength(pass);

        assertEquals(expResult, actualResult);
        
        assertFalse(actualResult);
    }
    
    /**
     * Test of checkLength method, validate the Boundary path of class PasswordValidator.
     */
    @Test
    public void testCheckLengthBoundary() { 
        System.out.println("checkLengthBad");
        String pass = "qwertyui";
        boolean expResult = true;
        
        boolean actualResult = passwordvalidator.PasswordValidator.checkLength(pass);

        assertEquals(expResult, actualResult);
        
        assertTrue(actualResult);
    }

}
