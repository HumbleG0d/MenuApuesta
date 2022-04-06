
package clases;

public class RegisterUser {
    String user;
    String password;
    String passwordC;
    
    public RegisterUser(){
        user = "";
        password = "";
        passwordC = "";
    }
    
    public String getUser(){
        return user;
    }
    public void setUser(String user){
        this.user = user;
    }
    
    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password = password;
    }
    
    public String getPasswordC(){
        return password;
    }
    public void setPasswordC(String passwordC){
        this.passwordC = passwordC;
    }
}
