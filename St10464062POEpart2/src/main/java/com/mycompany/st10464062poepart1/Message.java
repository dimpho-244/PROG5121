/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
 package com.mycompany.st10464062poepart1;
 
 import java.io.FileWriter;
 import java.io.IOException;
import
 import javax.swing.JOptionPane;
/**
 *
 * @author user
 */

public class Message {
    
    private static int totalMesages = 0;
     
    //Checking the lenghth of the ID
    public boolean checkMessageID(String id) {
        return id.length() == 10;
    } 
    //Checking the SA number (+27...)
    public boolean checkReciepientCell(String number) {
        return number.matches("^\\\\+27\\\\d{9}$");
    }
    //Creating of the mesage hash
    public String createMessageHash(String id, int msgNum, String Message) {
        
        String[] words = Message.trim().split(" ");
        String firstWord = words[0];
        String lastWord = words[words.length -1];
        
        String hash = id.substring(0, 2) + ":" + msgNum + ":" + firstWord.toUpperCase() + lastWord.toUpperCase();
        
        return hash;
    }
    //Handling of the users choice 
    public String sentMessages(int option) {
        
     if (option == 1) {
         totalMesages++;
         return "Message sucessfully sent.";
     } else if (option ==2) {
         return "Message disregarded";
     } else if (option ==3) {
         return "Message ucessfully stored.";
         
     } else  {
         return "Invalid option.";
     }
    }
    public int returnTotalMessages() {
        return totalMesages;
    }
    //Storing of the message in JSON
    public void storeMessageJSON(String id, String hash, String reciepient, String message) {
        
        try {
            FileWriter file = new FileWriter("messages.json", true);
            
            file.write("\n");
            file.write("\"MessageID\": \"" + id + "\",\n");
            file.write("\"Hash\": \"" + hash + "\",\n");
            file.write("\"Reciepient\": \"" + reciepient + "\",\n");
            file.write("\"Message\": \"" + message + "\",\n");
            file.write("}\n\n");
            
            file.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error saving message");
        }
    }
}


