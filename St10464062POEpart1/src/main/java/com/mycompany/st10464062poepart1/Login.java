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
    public Registration RegisteredUser = new Registration();
    
    //Check if username includes the right charecters and that it is no more than 5 letters
    public boolean checkUsername(String Username) {
        
        return (Username.contains("_")&& Username.length() <=5);
        
    }
    
    //Check if pasword meets the correct rule and requirements
    public boolean checkPasswordComplexity(String password){

        boolean isUpper = false ;
        boolean isSpecialCharecter = false ;
        boolean isNumber = false ; 

            if (Password.length() <8) {
                return false;
            }
                        
                        for (int i = 0;i < Password.length(); i++) {
                            Charecter = Password.charAt(i);
                            
                            if (Character.isUpperCase(Charecter)) {
                                isUpper = true;}
                            
                                else if (!Character.isDigit(Charecter)) {
                                        isNumber = true;}
                                
                                        else if (!Character.isLetterOrDigit(Charecter)) {
                                         isSpecialCharecter = true;}
                                        }      
                            }
                            
                                    return (isUpper && isNumber && isSpecialCharecter)
                                            
                            }               
                        
        //Method enusres the necessary registration mesage and the username is formatted properly or not
                        
                    public String registerUser(){
                                   
                                   
                         String nameoutput;
                         String passwordpoutput;
                                  
                             if (checkUserName()){
                                nameoutput = "Username successfully captured;";
                                  }
                             else{
                                nameoutput = "Username is not correctlty formatted please make sure username incudes an underscore and is no more than 5 charecters in length";
                                      
                                  }
                                  
                             if (checkPasswordComplexity()){
                                      passwordpoutput = "Password is not correctely  formatted, please ensure that password contains at least 8 characters, a capital letter and a special charecter"; 
                                      
                                  }
                             return passwordpoutput + "\n" + nameoutput;
                                  
                               }}
        //Method ensure that the users login details match the users detals when they firts registered
                                    
                    public boolean loginUser(){
                                        
                             enetredUser =JOptionPane.showInputDialog("Enter the username you used to create this account");
                                       
                             enetredPasword =JOptionPane.showInputDialog("Enter the password you used to create this account");
                                       
                                       
                             return Registration.getUsername().equals(enteredUerName) &&Registration.getPassword().equals(enteredPassword);
                                       
                                       
        //Method returns the necessary messaging for a succesful login or a afailed login
                                    
        public String returnLoginStatus(){
                                            
                                            
                           if (loginUser(){
                                 return "Welcome + Reistration.FirstName +  " " + Registration.Surname + " it is great to see you again" ; 
                                                
                                                
                                   return "Username or password incorrect, please try again.";
                           }
                    }                    
          public static void main (String[] args){
                    Login login = new Login();  
                 String Firstname = JOptionPane.showInputDialog("What is your first name");
                 String Surname = JOptionPane.showInputDialog("What is your Surname");
                 String Username = JOptionPane.showInputDialog("Please enter a username that contains an underscore (_) and is no more than 5 letters");
                 String Password = JOptionPane.showInputDialog("Please enter a password that has a minimum of 8 charecters, has a special charecter and has an uppercase ");
                 String Cellphone = JOptionPane.showInputDialog("Enter cellphone number and include code");
                 
          }
                                  
                                                            
                                            
                        
            

