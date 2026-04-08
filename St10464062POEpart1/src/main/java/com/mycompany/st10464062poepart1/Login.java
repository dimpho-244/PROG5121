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

    
    public boolean checkUsername() {
        
        return (Registration.getUsername().contains("_")&& Registration.getUsername().length() <=5);
        
    }
    
}
