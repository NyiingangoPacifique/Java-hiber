package Reportview;
// Generated May 12, 2020 3:27:44 PM by Hibernate Tools 4.3.1



/**
 * Logins generated by hbm2java
 */
public class Logins  implements java.io.Serializable {


     private String password;
     private String username;

    public Logins() {
    }

	
    public Logins(String password) {
        this.password = password;
    }
    public Logins(String password, String username) {
       this.password = password;
       this.username = username;
    }
   
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }




}

