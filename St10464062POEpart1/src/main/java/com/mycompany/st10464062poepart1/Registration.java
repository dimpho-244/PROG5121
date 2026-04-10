/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.st10464062poepart1;

import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.regex.Pattern;
/**
 *
 * @author user
 */
public class Registration {
    
    static Login loginObject = new Login();
    
    static Scanner input = new Scanner(System.in);
    
    public String Firstname = "";
    public String Surname   = "";  
    private String Password = "";
    private String Username = "";
    private String Cellphone = "";

    public static void setUsername(){
        Username = JOptionPane.showInputDialog("Please enter a username that contains an underscore (_) and is no more than 5 letters");
    }
    public static String getUsername(){
        
        return Username;
    }
    
    public static void setPasword(){
        Password = JOptionPane.showInputDialog("Please enter a password that has a minimum of 8 charecters, has a special charecter and has an uppercase ");
    
    }
    public static String  getPassword(){
        
        return Password;
    }
    public static boolean isValidPhoneNumber(String phoneNumber){
         String PHONE_REGEX = "^\\\\+\\\\d{1,3}\\\\d{1,10}$" ;
         return Pattern.matches(PHONE_REGEX, phoneNumber);
    }
    
     public static void setCellphoneNumber(){
         Cellphone = JOptionPane.showInputDialog("Enter cellphone number");
    
     if (isValidPhoneNumber(Cellphone)){
         JOptionPane.showMessageDialog(null, "Cellphone numer succefully added");
} else{JOptionPane.showMessageDialog(null, "Cellphone number incorrectely formatted or does not  contain international code");
        }
     }
    public static void setFirstname(){
        Firstname = JOptionPane.showInputDialog("What is your first name");
    } 
        public static String getFirstName(){
            
            return Firstname;
        }
        
     public static void setSurname(){
        Surname = JOptionPane.showInputDialog("What is your Surname");
    } 
        public static String getSurname(){
            
            return Surname;
            
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


