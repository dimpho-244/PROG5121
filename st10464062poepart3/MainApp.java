/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.st10464062poepart1;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class MainApp {
   
    public static void startQuickChat() {
        
        Message msg = new Message();

        JOptionPane.showMessageDialog(null, "Welcome to QuickChat");

        int choice = 0;
        
        while (choice != 3) {
          
            choice = Integer.parseInt(JOptionPane.showInputDialog("""
                                                                  1) Send Messages
                                                                  2) Show recentely sent messages
                                                                  3) Quit"""));
              
            if (choice == 1) {
                
                int numMessages = Integer.parseInt(
                        JOptionPane.showInputDialog("How many mesages do you want to send:"));
                
                for (int i = 0; i < numMessages; i++) {
                
                    String messageID = generateMessageID();
                
                    String reciepient = JOptionPane.showInputDialog("Enter reciepient (+27...): ");
               
                    if (!msg.checkReciepientCell(reciepient)) {
                        JOptionPane.showMessageDialog(null, "Cell phone number is incorrectly formatted or does not contain an international code.");
                        i--;
                        continue;
                    }

                    String messageText = JOptionPane.showInputDialog("Enter message: ");
               
                    if (messageText.length() > 250) {
                        int extra = messageText.length() - 250;
                        JOptionPane.showMessageDialog(null, "Message exceeds 250 charecters by " + extra + ", please reduce size.");
                        i--;
                        continue;
                    }
            
                    JOptionPane.showMessageDialog(null, "Message ready to send.");
            
                    String hash = msg.createMessageHash(messageID, i, messageText);
            
                    int option = Integer.parseInt(JOptionPane.showInputDialog("""
                                                                              1) Send
                                                                              2) Discard
                                                                              3) Store"""));
            
                    String result = msg.sentMessages(option);
                    JOptionPane.showMessageDialog(null, result);
            
                    msg.addMessageToArrays(messageID, hash, reciepient, messageText, option);

                    if (option == 1) {
                        displayMesage(messageID, hash, reciepient, messageText);
                    }

                    if (option == 3) {
                        msg.storeMessageJSON(messageID, hash, reciepient, messageText);
                    }
                }

                JOptionPane.showMessageDialog(null, "Total messages sent: " + msg.returnTotalMessages());
            
            } else if (choice == 2) {

                String reportChoice = JOptionPane.showInputDialog("""
                                                                  a. Display sender and recipient of sent messages
                                                                  b. Display longest message
                                                                  c. Search by Message ID
                                                                  d. Search by Recipient
                                                                  e. Delete by Hash
                                                                  f. Display Report""");

                switch(reportChoice.toLowerCase()) {

                    case "a" -> JOptionPane.showMessageDialog(null,
                                msg.displaySentMessages());

                    case "b" -> JOptionPane.showMessageDialog(null,
                                msg.getLongestMessage());

                    case "c" -> {
                        String id =
                                JOptionPane.showInputDialog("Enter Message ID");
                        JOptionPane.showMessageDialog(null,
                                msg.searchMessageID(id));
                    }

                    case "d" -> {
                        String recipient =
                                JOptionPane.showInputDialog("Enter Recipient");
                        JOptionPane.showMessageDialog(null,
                                msg.searchRecipient(recipient));
                    }

                    case "e" -> {
                        String hash =
                                JOptionPane.showInputDialog("Enter Message Hash");
                        JOptionPane.showMessageDialog(null,
                                msg.deleteMessage(hash));
                    }

                    case "f" -> JOptionPane.showMessageDialog(null,
                                msg.displayReport());

                    default -> JOptionPane.showMessageDialog(null,
                                "Invalid option");
                }
            }
        }

        JOptionPane.showMessageDialog(null, "Goodbye");
    }
            
    //Generating of the 10 digit ID 
    public static String generateMessageID() {
        Random rand = new Random();
        long num = (long)(rand.nextDouble() * 10000000000L);
        return String.format("%010d", num);
    }

    //Displaying of all the messages 
    public static void displayMesage(String id, String hash, String reciepient, String msg) {
        JOptionPane.showMessageDialog(null, 
                  "Message ID: " + id
                + "Message Hash: " + hash
                + "Reciepient: " + reciepient
                + "Message: " + msg);
    }
}

