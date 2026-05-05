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
public class MesageTest {
    
    Message msg = new Message();
    
    //Message ID
    public void testMessageIDValid() {
        assertTrue(msg.checkMessageID("1234567890"));
    }
    
    @Test
    public void testMessageIDInvalid()  {
        assertTrue(msg.checkMessageID("12345"));
    }
    
    //Reciepient
    @Test
    public void testReciepientValid() {
        assertTrue(msg.checkReciepientCell("+27718693002"));
    }
    
    @Test
    public void testReciepientInValid() {
        assertTrue(msg.checkReciepientCell("0812345678"));
    }
    
    //Message Hash
    @Test
    public void testMessageHash() { 
        String expected = "00:0:HITONOGHT";
        String actual= msg.createMessageHash("0012345678", 0, "Hi tonight");
        
        assertEquals(expected, actual);
    }
    //Checking of Message lenth
    @Test 
    public void testSendOption() {
        assertEquals("Message sucessfully sent.", msg.sentMessages(1));
    }
    @Test 
    public void testDiscardOption() {
        assertEquals("Press 0 to delete message.", msg.sentMessages(2));
    }
    @Test 
    public void testStoreOption() {
        assertEquals("Message sucessfully stored.", msg.sentMessages(3));
    }
    //The total count 
    @Test 
    public void testTotalMessages() {
        msg.sentMessages(1);
        msg.sentMessages(1);
        
        assertEquals(2, msg.returnTotalMessages());
    }
   
}
