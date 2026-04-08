/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.st10464062poepart1;

import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author user
 */
public class Registration {
    
    static Login loginObject = new Login();
    
    static Scanner input = new Scanner(System.in);
    
    public static String Firstname = "";
    public static String Surname    = "";  
    private static String Paswrord = "";
    private static String Username = "";

    public static void setUsername(){
        Username = JOptionPane.showInputDialog("Please enter a username that contains an underscore (_) and is no more than 5 letters");
    }
    public static String getUsername(){
        
        return Username;
    }
}

