package Reportview;
// Generated May 12, 2020 3:27:44 PM by Hibernate Tools 4.3.1



/**
 * Singups generated by hbm2java
 */
public class Singups  implements java.io.Serializable {


     private String username;
     private String password;
     private String email;
     private String fullname;

    public Singups() {
    }

	
    public Singups(String username) {
        this.username = username;
    }
    public Singups(String username, String password, String email, String fullname) {
       this.username = username;
       this.password = password;
       this.email = email;
       this.fullname = fullname;
    }
   
    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getFullname() {
        return this.fullname;
    }
    
    public void setFullname(String fullname) {
        this.fullname = fullname;
    }




}

