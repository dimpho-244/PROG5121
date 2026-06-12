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

//Part 3 Methods 
    public void storeMessageJSON(String id, String hash, String reciepient, String message, int option) {
        
        messageID.add(id);
        reciepients.add(reciepients);
        messageHashes.add(hash);
        
        if (option == 1) {
            sentMessages.add(message);
        } else if (option == 2) {
            disregardedMessages.add(message);
        } else if (option == 3) {
            storedMessages.add(message);
        }
    }
    public ArrayList<String> getSentMessages() {
        return sentMessages;
    }
    public ArrayList<String> getStoredMessages() {
        return storedMessages;
    }
    public ArrayList<String> getDisregardedMessages() {
        return disregardedMessages;
    }
    
    //Display sender and recipient of sent mesages
    public String displaySentMessages() {
        
        String Output = "";
        
        for (int i = 0; i < sentMessages.size(); i++) {
            
            output += "Sender: Developer\n";
            output += "Recipient: + recipients.get(i) + "\\n\\n\";
        }
        return output;
    }
    //Longest message
    public String getLongestMessage() {
        
        String longest = "";
        
        for (String msg : sentMessages) {
            
            if (msg.length() > longest.length()) {
                longest = msg;
            }
        }
        for (String msg : storedMessages) {
            
            if (msg.length() > longest.length()) {
        }
    }
        return longest;
    }
    
    //Searching by Message ID
    public String searchMessageID(String id) {
        
        for (int i = 0; i < messageIDs.size(); i++) {
            if (messagesIDs.get(i).equals(id)) {
                
                if (i < sentMessages.size()) {
                    return sentMessages.get(i);
                }
            }
        }
        return "Message not found.";
    }
    
    //Search by recipient 
    public String deleteMessage(String hash) {
        
        String result = ""; 
        
        for (int i = 0; i  < reciepients.size(); i++) {
            if (reciepients.get(i).equals(reciepients)) {
                
                if(i < storedMessages.size()) {
                    result += storedMessages.get(i) + "\n";
                }
            }hhjgfc
        }
        return result;
    }
    //Delete by Hash
    public String deleteMessage(String hash) {
        
        for (int i = 0; i < messageHashes.size(); i++) {
            if (messageHashes.get(i).equals(hash)) {
                String deletedMessage = "";
                
                if (i < storedMessages.size()) {
                    
                    deletedMessage = storedMessages.get(i);
                    storedMessages.remove(i);
                }
                messageHashes.remove(i);
                return "Message \"" + deletedMessage + "\" sucesfully deleted.";
            }
        }
        return "Message not found.";
    }
    
   //Display report
    public String displayReport() {
         
        String report = "MESSAGE REPORT\n";
        report += "============================\n\n";
        
        for (int i = 0; i < sentMessages.size(); i++) {
            
            report += "Message Hash: "
                    + messageHashes.get(i)
                    + "\n";
            
            report += "Recipient: "
                    + reciepients.get(i)
                    + "\n";
            
            report += "Message: "
                    + sentMessages.get(i)
                    + "\n";
            
             }
        return report;
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


