package com.mycompany.st10464062poepart1;

/**
 *
 * @author user
 */
public class Registration {
     
    public String Firstname = "";
    public String Surname   = "";  
    private String password = "";
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

