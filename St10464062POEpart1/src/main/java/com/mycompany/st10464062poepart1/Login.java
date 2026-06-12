/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
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
    
    //Check if username has an underscore and that it is no more than 5 letters//
    public boolean checkUsername(String Username) {
        
        return (Username.contains("_")&& Username.length() <=5);
        
    }
    
    //Check if pasword meets the correct rule and requirements//
    public boolean checkPasswordComplexity(String password){

        boolean isUpper = false ;
        boolean isSpecialCharecter = false ;
        boolean isNumber = false ; 
        char Charecter;
        //the passwords length is more than 8 Characters//
            if (password.length() <8) {
                return false;
            }
                        
                        for (int i = 0;i < password.length(); i++) {
                            Charecter = password.charAt(i);
                            
                            if (Character.isUpperCase(Charecter)) {
                                isUpper = true;}
                            
                                else if (Character.isDigit(Charecter)) {
                                        isNumber = true;}
                                
                                        else if (!Character.isLetterOrDigit(Charecter)) {
                                         isSpecialCharecter = true;}
                                        }      
                            //the password is made correctly if the requirements are met//
                                    return (isUpper && isNumber && isSpecialCharecter);
    }
                                            
    //OpenAI.(2023)ChatGPT (April 10)(https:chat.openai.com/)only cellpnoe numbers with their international codes are validated//                                       
     public boolean checkCellPhoneNumber(String Cellphone){
         String CphoneRegex = "^\\+\\d{1,3}\\d{1,10}$" ;
      
         return Pattern.matches(CphoneRegex, Cellphone);
         
    }
    
             
        //Method enusres the necessary registration message and the username is formatted properly or not//
                        
       public String registerUser (String Firstname, String Surname,String Username, String password , String Cellphone){
          String nameoutput;
          String passwordoutput;
          String phoneoutput;
       
                           //checks if the users information are valid, captures the information if its true or else rejects the information for user to try again//        
                             if (checkUsername(Username)){
                                nameoutput = "Username successfully captured.";
                                  }
                             else{
                                nameoutput = "Username is not correctlty formatted please make sure username incudes an underscore and is no more than 5 charecters in length";
                                      
                                  }
                                  
                             if (checkPasswordComplexity(password)){
                                 passwordoutput = "Password successfully captured.";
                             }
                             else{
                                      passwordoutput = "Password is not correctely  formatted, please ensure that password contains at least 8 characters, a capital letter and a special charecter"; 
                                      
                                  }
                             
                             if (checkCellPhoneNumber(Cellphone)){
                                 phoneoutput = "Cell phone number successfully added.";
                             } 
                                 else{
                                 phoneoutput = "Cell phone number incorrectly formatted or doe not contain international code.";
                                         }
                             //the user information is then kept if all the information is correct//
                             if (checkUsername(Username)&& checkPasswordComplexity(password) && checkCellPhoneNumber(Cellphone)){
                              
                                RegisteredUser.setFirstname(Firstname);
                                RegisteredUser.setSurname(Surname);
                                RegisteredUser.setUsername(Username);
                                RegisteredUser.setPassword(password);
                                RegisteredUser.setCellphoneNumber(Cellphone);
                             }
       
                             
                             return passwordoutput + "\n" + nameoutput + "\n" + phoneoutput;
                                  
                               }
       
        //Method ensure that the users login details match the users detals when they firts registered//
                                    
        public boolean loginUser( String enetredUser, String enetredPasword){
          
                             return   RegisteredUser.getUsername() != null
                               && RegisteredUser.getPassword() != null
                               && RegisteredUser.getUsername().equals(enetredUser)
                               && RegisteredUser.getPassword().equals(enetredPasword);
        }                       
                                       
        //Method returns the necessary messaging for a succesful login or a a failed login//
                                    
        public String returnLoginStatus(String enetredUser, String enetredPasword){
            
                           if (loginUser(enetredUser,enetredPasword)){
                                 return "Welcome" + RegisteredUser.getFirstName() + " "+ RegisteredUser.getSurname() + "it is great to see you again"; 
                           } 
                           else{              
                                   return "Username or password incorrect, please try again.";
                           }
                        } 
                     }
                                                            
                                            
                        
            

