/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agileassignment;

import agileassignment.Login;
import java.sql.*;
import javax.swing.*;

/**
 *
 * @author khong
 */
public class LoginDA {
    private String host = "jdbc:derby://localhost:1527/customer ";
    private String user = "nbuser";
    private String password = "nbuser";
    private String tableName = "CUSTOMER";
    private Connection conn;
    private PreparedStatement stmt;
    
    public LoginDA() {
        createConnection();
}
    
public Login getRecord(String username) {
        String queryStr = "SELECT * FROM " + tableName + " WHERE userid = ?";
        Login login = null;
        try {
            stmt = conn.prepareStatement(queryStr);
            stmt.setString(1, username);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                login = new Login(username, rs.getString("password"));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return login;
    }

public void addRecord(Login login) {
         String insertStr = "INSERT INTO " + tableName + " VALUES(?, ?)";
        try { 
              stmt=conn.prepareStatement(insertStr);
              stmt.setString(1,login.getUserid());
              stmt.setString(2,login.getPassword());


              stmt.executeUpdate();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

public void updateRecord(Login login){
         String updateStr = "UPDATE " + tableName + " SET password = ?, WHERE userid = ?";
         try {
              stmt = conn.prepareStatement(updateStr);
              stmt.setString(1,login.getPassword());
              stmt.setString(4,login.getUserid());
    
              stmt.executeUpdate();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
          }
     }

public void deleteRecord(Login login){
         try {
             stmt = conn.prepareStatement("DELETE FROM " + tableName + " WHERE userid = ?");
             stmt.setString(1,login.getUserid());
             stmt.executeUpdate();
             
         }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
          }
     }

private void createConnection() {
        try {
            conn = DriverManager.getConnection(host, user, password);
            System.out.println("***TRACE: Connection established.");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void shutDown() {
        if (conn != null)
            try {
            conn.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public static void main(String[] args) {
        LoginDA da = new LoginDA();
    }


}


