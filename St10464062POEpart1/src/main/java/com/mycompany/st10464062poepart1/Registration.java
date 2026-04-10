package com.mycompany.st10464062poepart1;


import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class Registration {
    

    
    static Scanner input = new Scanner(System.in);
    
    public String Firstname = "";
    public String Surname   = "";  
    private String Password = "";
    private String Username = "";
    private String Cellphone = "";

   
       public void setFirstname(String Firstname){
        Firstname = JOptionPane.showInputDialog("What is your first name");
    } 
        public String getFirstName(){
            
            return Firstname;
        }
        
     public void setSurname(String Surname){
        Surname = ;
    } 
        public String getSurname(){
            
            return Surname;}

        public void setUsername(String Username){
            Username = ;
        }
        public String getUsername(){

            return Username;
        }

        public void setPasword(String Cellphone){
            Password = 
        }
        public String  getPassword(){

            return Password;
    }
         public void setCellphoneNumber(){
         Cellphone = 
         }
         
    public static boolean isValidPhoneNumber(String phoneNumber){
         String PHONE_REGEX = "^\\\\+\\\\d{1,3}\\\\d{1,10}$" ;
         return Pattern.matches(PHONE_REGEX, phoneNumber);
    }
    
    
    
     if (isValidPhoneNumber(Cellphone)){
         JOptionPane.showMessageDialog(null, "Cellphone numer succefully added");
} else{JOptionPane.showMessageDialog(null, "Cellphone number incorrectely formatted or does not  contain international code");
        }
     }
 
        }
        public static void main(String[] args) {
            setFirstname();
            setSurname();
            setUsername();
            setPasword();
            
            
                loginObject.registerUser();
                
                JOptionPane.showMessageDialog(null,loginObject.returnLoginStatus());
                
                
        }
                
    }


