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
    
    public static String Firstname = "";
    public static String Surname    = "";  
    private static String Password = "";
    private static String Username = "";

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
    private static String cellphone(){
        private static final String PHONE_REGEX = "^\\\\+\\\\d{1,3}\\\\d{1,10}$" ;
        
    }
    public static void setFirstname(){
        Firstname = JOptionPane.showInputDialog("What is your first name");
    } 
        public static String getFirstName(){
            
            return FirstName;
        }
        
        public ststic voi
    }
}

