package com.mycompany.st10464062poepart1;

/**
 *
 * @author user
 */
public class Registration {
     //users informations declarations(variables)//
    private String Firstname = "";
    private String Surname   = "";  
    private String password = "";
    private String Username = "";
    private String Cellphone = "";

   //set the users informations, the information is assigned to the declared variables and then they are returned//
       public void setFirstname(String Firstname){
        this.Firstname = Firstname ;
    } 
        public String getFirstName(){
            
            return Firstname;
        }
        
     public void setSurname(String Surname){
        this.Surname = Surname;
    } 
        public String getSurname(){
            
            return Surname;}

        public void setUsername(String Username){
            this.Username = Username;
        }
        public String getUsername(){

            return Username;
        }

        public void setPassword(String password){
          this.password = password;
        }
        public String  getPassword(){

            return password;
    }
         public void setCellphoneNumber(String Cellphone){
          this.Cellphone = Cellphone;
         }
        public String  getCellphoneNumber(){

            return Cellphone;
        }
}

