/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.st10464062poepart1;

import javax.swing.JOptionPane;
/**
 *
 * @author user
 */
public class Login {
    String enetredUser;
    String enetredPasword;

    
    //Check if username includes the right charecters and that it is no more than 5 letters
    public boolean checkUsername() {
        
        return (Registration.getUsername().contains("_")&& Registration.getUsername().length() <=5);
        
    }
    
    //Check if pasword meets the correct rule and requirements
            public boolean checkPasswordComplexity(){


        boolean iUpper = false ;
        boolean isSpecialCharecter = false ;
        boolean isNumber = false ; 
        char currentCharecter ;

            if (Registration.getPassword().length() >=8) {
                
                        
                        for (int i = 0;i < Registration.getPasword().length(); i++) {
                            
                            currentCharecter = Registration.getPassword().charAt(i);
                            if (Character.isUpperCase(currentCharecter)) {
                                isUpper = true;
                                else if (Character.isDigit(currentCharecter)) {
                                        isNumber = true;
                                        else if (!(Character.isLetterOrDigit(currentCharecter)) {
                                         isSpecialCharecter = true;
                              
                                        }
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
                                        
                             enteredUserName =JOptionPane.showInputDialog("Enter the username you used to create this account");
                                       
                             enteredPassword =JOptionPane.showInputDialog("Enter the password you used to create this account");
                                       
                                       
                             return Registration.getUsername().equals(enteredUerName) &&Registration.getPassword().equals(enteredPassword);
                                       
                                       
        //Method returns the necessary messaging for a succesful login or a afailed login
                                    
                    public String returnLoginStatus(){
                                            
                                            
                           if (loginUser(){
                                 return "Welcome + Reistration.FirstName +  " " + Registration.Surname + " it is great to see you again" ; 
                                                
                                                
                                   return "Username or password incorrect, please try again.";
                                                
                                            }
                                  
                                                            
                                            
                        
            

