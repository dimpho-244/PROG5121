package com.mycompany.st10464062poepart1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */

public class Message {
    
    private static int totalMesages = 0;

    private ArrayList<String> messageIDs = new ArrayList<>();
    private ArrayList<String> reciepients = new ArrayList<>();
    private ArrayList<String> messageHashes = new ArrayList<>();
    private ArrayList<String> sentMessageList = new ArrayList<>();
    private ArrayList<String> disregardedMessages = new ArrayList<>();
    private ArrayList<String> storedMessages = new ArrayList<>();
     
    //Checking the lenghth of the ID
    public boolean checkMessageID(String id) {
        return id.length() == 10;
    } 

    //Checking the SA number (+27...)
    public boolean checkReciepientCell(String number) {
        return number.matches("^\\+27\\d{9}$");
    }

    //Creating of the mesage hash
    public String createMessageHash(String id, int msgNum, String Message) {
        
        String[] words = Message.trim().split(" ");
        String firstWord = words[0];
        String lastWord = words[words.length - 1];
        
        String hash = id.substring(0, 2) + ":" + msgNum + ":" + firstWord.toUpperCase() + lastWord.toUpperCase();
        
        return hash;
    }

    //Handling of the users choice 
    public String sentMessages(int option) {
        
        if (option == 1) {
            totalMesages++;
            return "Message successfully sent.";
        } else if (option == 2) {
            return "Message disregarded";
        } else if (option == 3) {
            return "Message successfully stored.";
        } else {
            return "Invalid option.";
        }
    }

    public int returnTotalMessages() {
        return totalMesages;
    }

    public void addMessageToArrays(String id, String hash, String reciepient, String message, int option) {
        
        messageIDs.add(id);
        reciepients.add(reciepient);
        messageHashes.add(hash);
        
        if (option == 1) {
            sentMessageList.add(message);
        } else if (option == 2) {
            disregardedMessages.add(message);
        } else if (option == 3) {
            storedMessages.add(message);
        }
    }

    //Display sender and recipient of sent mesages
    public String displaySentMessages() {
        
        String output = "";
        
        for (int i = 0; i < sentMessageList.size(); i++) {
            output += "Sender: Developer\n";
            output += "Recipient: " + reciepients.get(i) + "\n\n";
        }

        return output;
    }

    //Longest message
    public String getLongestMessage() {
        
        String longest = "";
        
        for (String msg : sentMessageList) {
            if (msg.length() > longest.length()) {
                longest = msg;
            }
        }

        return longest;
    }
    
    //Searching by Message ID
    public String searchMessageID(String id) {
        
        for (int i = 0; i < messageIDs.size(); i++) {
            if (messageIDs.get(i).equals(id)) {
                return reciepients.get(i);
            }
        }

        return "Message not found.";
    }
    
    //Search by recipient 
    public String searchRecipient(String reciepient) {
        
        String result = ""; 
        
        for (int i = 0; i < reciepients.size(); i++) {
            if (reciepients.get(i).equals(reciepient)) {
                result += "Message ID: " + messageIDs.get(i) + "\n";
                result += "Message Hash: " + messageHashes.get(i) + "\n\n";
            }
        }

        if (result.equals("")) {
            return "Recipient not found.";
        }

        return result;
    }

    //Delete by Hash
    public String deleteMessage(String hash) {
        
        for (int i = 0; i < messageHashes.size(); i++) {
            if (messageHashes.get(i).equals(hash)) {

                messageHashes.remove(i);
                messageIDs.remove(i);
                reciepients.remove(i);

                if (i < sentMessageList.size()) {
                    String deletedMessage = sentMessageList.get(i);
                    sentMessageList.remove(i);
                    return "Message \"" + deletedMessage + "\" successfully deleted.";
                }

                if (i < storedMessages.size()) {
                    String deletedMessage = storedMessages.get(i);
                    storedMessages.remove(i);
                    return "Message \"" + deletedMessage + "\" successfully deleted.";
                }

                if (i < disregardedMessages.size()) {
                    String deletedMessage = disregardedMessages.get(i);
                    disregardedMessages.remove(i);
                    return "Message \"" + deletedMessage + "\" successfully deleted.";
                }

                return "Message successfully deleted.";
            }
        }

        return "Message not found.";
    }
    
    //Display report
    public String displayReport() {
         
        String report = "MESSAGE REPORT\n";
        report += "============================\n\n";
        
        for (int i = 0; i < messageIDs.size(); i++) {
            
            report += "Message ID: " + messageIDs.get(i) + "\n";
            report += "Message Hash: " + messageHashes.get(i) + "\n";
            report += "Recipient: " + reciepients.get(i) + "\n\n";
        }

        return report;
    }

    //Storing of the message in JSON
    public void storeMessageJSON(String id, String hash, String reciepient, String message) {
        
        try {
            FileWriter file = new FileWriter("messages.json", true);
            
            file.write("{\n");
            file.write("\"MessageID\": \"" + id + "\",\n");
            file.write("\"Hash\": \"" + hash + "\",\n");
            file.write("\"Reciepient\": \"" + reciepient + "\",\n");
            file.write("\"Message\": \"" + message + "\"\n");
            file.write("}\n\n");
            
            file.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error saving message");
        }
    }
}