/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Meow
 */
public class Admin {
    private String id;
    private String name;
    private String username;
    private String password;

    public Admin() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Admin\nID: " + id + "\nName: " + name + "\nUsername: " + username + "\nPassword: " + password ;
    }
     
    String SQL;
    public Admin findAdmin(String username, String password){
        SQL = "select * from ADMIN where USERNAME like ? and PASSWORD like ?";
        Admin admin = null;
        Connection conn;
        try {
            conn = ConnectionBuilder.connect();
            PreparedStatement ps=conn.prepareStatement(SQL);
            ps.setString(1, username);
            ps.setString(2, password);           
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                admin = new Admin();
                admin.orm(rs, admin);                
            }           
            conn.close();
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }   
        return admin;
    }
    
    public void orm(ResultSet rs, Admin a) throws SQLException{
       
        a.setId(rs.getString("ADMINID"));
        a.setName(rs.getString("ADMINNAME"));
        a.setPassword(rs.getString("PASSWORD"));
        a.setUsername(rs.getString("USERNAME"));
            
    }
    
}
