/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.st10464062poepart1;

import javax.swing.JOptionPane;
import java.util.regex.Pattern;
/**
 *
 * @author user
 */
public class Login {
    private Registration RegisteredUser = new Registration();
    
    //Check if username includes the right charecters and that it is no more than 5 letters
    public boolean checkUsername(String Username) {
        
        return (Username.contains("_")&& Username.length() <=5);
        
    }
    
    //Check if pasword meets the correct rule and requirements
    public boolean checkPasswordComplexity(String password){

        boolean isUpper = false ;
        boolean isSpecialCharecter = false ;
        boolean isNumber = false ; 
        char Charecter;

            if (password.length() <8) {
                return false;
            }
                        
                        for (int i = 0;i < password.length(); i++) {
                            Charecter = password.charAt(i);
                            
                            if (Character.isUpperCase(Charecter)) {
                                isUpper = true;}
                            
                                else if (!Character.isDigit(Charecter)) {
                                        isNumber = true;}
                                
                                        else if (!Character.isLetterOrDigit(Charecter)) {
                                         isSpecialCharecter = true;}
                                        }      
                            
                                    return (isUpper && isNumber && isSpecialCharecter);
    }
                                            
                            }               
     public boolean checkCellPhoneNumber(String Cellphone){
         String CphoneRegex = "^\\+\\d{1,3}\\d{1,10}$" ;
         
      
         return Pattern.matches(CphoneRegex, Cellphone);
         
    }
    
             
        //Method enusres the necessary registration mesage and the username is formatted properly or not
                        
       public String registerUser (String Firstname, String Surname, String password, String Username,String Cellphone){
          String nameoutput;
          String passwordoutput;
          String phoneoutput;
       
                                  
                             if (checkUsername(Username)){
                                nameoutput = "Username successfully captured;";
                                  }
                             else{
                                nameoutput = "Username is not correctlty formatted please make sure username incudes an underscore and is no more than 5 charecters in length";
                                      
                                  }
                                  
                             if (checkPasswordComplexity(password)){
                                 passwordoutput = "Password successfullu captured";
                             }
                             else{
                                      passwordoutput = "Password is not correctely  formatted, please ensure that password contains at least 8 characters, a capital letter and a special charecter"; 
                                      
                                  }
                             
                             if (checkCellPhoneNumber(Cellphone)){
                                 phoneoutput = "Cell phone number successfully added";
                             } 
                                 else{
                                 phoneoutput = "Cell phone number incorrectly formatted or doe not contain international code.";
                                         }
                             
                             if (checkUsername(Username)&& checkPasswordComplexity(password) && checkCellPhoneNumber(Cellphone)){
                              
                                RegisteredUser.setFirstname(Firstname);
                                RegisteredUser.setSurname(Surname);
                                RegisteredUser.setUsername(Username);
                                RegisteredUser.setPasword(password);
                                RegisteredUser.setCellphoneNumber(Cellphone);
                             }
       
                             
                             return passwordoutput + "\n" + nameoutput + "\n" + phoneoutput;
                                  
                               }
       
        //Method ensure that the users login details match the users detals when they firts registered
                                    
                    public boolean loginUser( String enetredUser, String enetredPasword){
          
                             return RegisteredUser.getUsername() != null;
                                RegisteredUser.getPassword() != null;
                                RegisteredUser.getUsername().equals(enetredUser);
                                RegisteredUser.getPassword().equals(enetredPasword);}                       
                                       
        //Method returns the necessary messaging for a succesful login or a afailed login
                                    
        public String returnLoginStatus(){
                                            
                                            
                           if (loginUser(){
                                 return "Welcome" + RegisteredUser.getFirstName + " "+RegisteredUser.getSurname "it is great to see you again" ; 
                           } 
                           else{              
                                   return "Username or password incorrect, please try again.";
                           }
                    }                    
          public static void main (String[] args){
                    Login login = new Login();  
                 String Firstname = JOptionPane.showInputDialog("What is your first name");
                 String Surname = JOptionPane.showInputDialog("What is your Surname");
                 String Username = JOptionPane.showInputDialog("Please enter a username that contains an underscore (_) and is no more than 5 letters");
                 String password = JOptionPane.showInputDialog("Please enter a password that has a minimum of 8 charecters, has a special charecter and has an uppercase ");
                 String Cellphone = JOptionPane.showInputDialog("Enter cellphone number and include code");
            String RegOutput = Login.registerUser(Firstname, Surname, Username, password, Cellphone);
              JOptionPane.showMessageDialog(null, RegOutput);
          }
                                  
                                                            
                                            
                        
            

