
package agileassignment;

import java.io.Serializable;

public class Login implements Serializable {
    private String userid;
    private String password;


    public Login() {
    }
    
    public Login(String userid) {
        this.userid = userid;
    }

    public Login(String userid, String password) {
        this.userid = userid;
        this.password = password;

    }
    
    public String getUserid() {
        return userid;
    }
    
    public void setUserid(String userid) {
        this.userid = userid;
    }
    
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    

    
    @Override
    public String toString() {
        return String.format("%-5s %-10s", userid, password );
    }
    
}

