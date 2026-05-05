/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
  import java.util.Scanner
/**
 *
 * @author user
 */
public class MainApp {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(system.in);
       
        Login login = new 
        Message msg = new Message();
        
        //Part of Login from Part 1
        System.out.print("Enter username: ");
        String username = input.nextLine();
        
        System.out.print("Enter username: ");
        String password = input.nextLine();
        
        if (!login.loginUser(username, password))  {
          System.out.println("Username or password incorrect, please try again."); 
          return; 
        }
        
        System.out.println("Welcome to QuickChat");
        
        int choice = 0;
        
        while (choice !=3) {
          
            System.out.println("\n1) Send Messages");
            System.out.println("2) Show recentely sent messages");
            System.out.println("3) Quit");
            
            choice = input.nextInt();
            input.nextLine();
            
            if (choice ==1) {
                
                System.out.println("How many mesages do you want to send:");
                int numMessages = input.nextInt();
                input.nextLine();
                
            for (int i = 0; i < numMessages; i++) {
                
                String messgaeID = generateMessageID();
                
                System.out.println("Enter reciepient (+27...): ");
                String reciepient = input.nextLine();
                
            if  (!msg.checkReciepientCell(reciepient)) {
                System.out.println("Cell phone number is incorrectly formatted or does not contain an international code.");
                i--;
                continue;
            }
               System.out.println("Enter message: ");
               String MessageText = input.nextLine();
               
            if (messageText.length() > 250) {
                int extra = MessageText.length( - 250);
                System.out.println("Message exceeds 250 charecters by " + extra +", please reduce size.");
                i--;
                continue;
            }
            
            System.out.println("Message ready to send.");
            
            String hash = msg.createMessageHash(MessageID, i, MessageText);
            System.out.println("Message Hash: " + hash);
            
            System.out.println("1) Send");
            System.out.println("2) Discard");
            System.out.println("3) Store");
            
            }
            }
        }
    }
}
