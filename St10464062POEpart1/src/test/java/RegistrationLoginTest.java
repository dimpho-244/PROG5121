/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author user
 */
public class RegistrationLoginTest {
   @Test 
    public void testCheckUsername_Correct() {
        Login Login = new Login(); 
        assertEquals(true,Login.checkUsername("kyl_1"));
    }
    @Test 
    public void testCheckUsername_Incorrect() {
        Login Login = new Login(); 
        assertEquals(false,Login.checkUsername("“kyle!!!!!!!"));
    }
    
    @Test 
    public void testPasswordCorrect() {
        Login Login = new Login(); 
        assertEquals(true,Login.checkUsername("Ch&&sec@ke99!"));
    }
    
    @Test 
    public void testPassword_Incorrect() {
        Login Login = new Login(); 
        assertEquals(false,Login.checkUsername("password"));
    }
    
    @Test 
    public void testCellphoneCorrect() {
        Login Login = new Login(); 
        assertEquals(true,Login.checkCellphoneNumber("+27838968976"));
    }
    @Test 
    public void testCellphone_Incorrect() {
        Login Login = new Login(); 
        assertEquals(false,Login.checkCellphoneNumber("08966553"));
                
    }


    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
