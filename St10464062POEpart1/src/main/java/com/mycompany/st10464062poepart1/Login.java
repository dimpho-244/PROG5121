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

            if (Regitration.getPassword().length() >=8) {
                
                        
                        for (int i = 0;i < Registratio.getPasword().length(); i++) {
                            
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
            }
}
