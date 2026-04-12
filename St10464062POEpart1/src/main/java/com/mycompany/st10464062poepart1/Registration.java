package com.mycompany.st10464062poepart1;

/**
 *
 * @author user
 */
public class Registration {
     
    public String Firstname = "";
    public String Surname   = "";  
    private String Password = "";
    private String Username = "";
    private String Cellphone = "";

   
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

        public void setPasword(String Cellphone){
          this.Password = Password;
        }
        public String  getPassword(){

            return Password;
    }
         public void setCellphoneNumber(){
          this.Cellphone = Cellphone;
         }
}

