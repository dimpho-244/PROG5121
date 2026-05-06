/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
  package com.mycompany.st10464062poepart1;
  import javax.swing.JOptionPane;
  import java.util.Scanner;
  import java.util.Random;
/**
 *
 * @author user
 */
public class MainApp {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
       
        Login login = new Login();
        Message msg = new Message();
        
        //Part of Login from Part 1
        String Firstname =JOptionPane.showInputDialog("What is your first name");
        String Surname =JOptionPane.showInputDialog("What is your surname");
        String Username =JOptionPane.showInputDialog("Please enter a username that contains an underscore(_) and is no more that 5 letters");
        String Password =JOptionPane.showInputDialog("Please enter a password charecter and has an that has a minimum of 8 charecters, has a special chraecter and has an uppercase ");
        String Cellphone =JOptionPane.showInputDialog("Enter cellphone number and include code");
        
        String RegOutput = login.registerUser(Firstname, Surname, Username, Password, Cellphone);
        JOptionPane.showMessageDialog(null, RegOutput);
        
        if (!(RegOutput.contains("Username sucessfully captured.")
                && RegOutput.contains("Password sucessfully captured.")
                && RegOutput.contains("Cellphone number sucessfully added."))) {
            return;
        }
        
        String username = JOptionPane.showInputDialog("Enter username: ");
        String enteredPassword = JOptionPane.showInputDialog("Enter  password: ");
        
        if (!login.loginUser(username, enteredPassword)) {
          JOptionPane.showMessageDialog(null, "Username or password incorrect, please try again."); 
          return; 
        }
        JOptionPane.showMessageDialog(null, login.returnLoginStatus(username, enteredPassword));
        JOptionPane.showMessageDialog(null,"Welcome to QuickChat");
        
        int choice = 0;
        
        while (choice !=3) {
          
           choice = Integer.parseInt(JOptionPane.showInputDialog("""
                                                                 1) Send Messages
                                                                 2) Show recentely sent messages
                                                                 3) Quit"""));
              
            
            if (choice ==1) {
                
                int numMessages = Integer.parseInt(
                JOptionPane.showInputDialog("How many mesages do you want to send:"));
                
            for (int i = 0; i < numMessages; i++) {
                
                String messageID = generateMessageID();
                
                String reciepient = JOptionPane.showInputDialog("Enter reciepient (+27...): ");
               
              
            if  (!msg.checkReciepientCell(reciepient)) {
             JOptionPane.showMessageDialog(null, "Cell phone number is incorrectly formatted or does not contain an international code.");
                i--;
                continue;
            }
               String messageText = JOptionPane.showInputDialog("Enter message: ");
               
            if (messageText.length() > 250) {
                int extra = messageText.length() - 250;
                JOptionPane.showMessageDialog(null, "Message exceeds 250 charecters by " + extra +", please reduce size.");
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
            
            if (option == 1 ) {
                displayMesage(messageID, hash , reciepient, messageText);
            }
            if (option ==3) {
                msg.storeMessageJSON(messageID, hash, reciepient, messageText);
            }
          }
           JOptionPane.showMessageDialog(null, "Total messages sent: "+ msg.returnTotalMessages());
            
            } else if (choice == 2) {
                JOptionPane.showMessageDialog(null, "Coming Soon.");
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
                        """
                        --- Message Details ---
                        Message ID: """ + id
                       + "\nMessage Hash: " + hash
                       + "\nReciepient: " + reciepient
                       + "\nMessage: " + msg);
                    
            }
          
          }


