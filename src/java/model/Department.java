/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Meow
 */
public class Department {
    private int deparmentId;
    private String deparmentName;

    public Department() {
    }

    public Department(int deparmentId, String deparmentName) {
        this.deparmentId = deparmentId;
        this.deparmentName = deparmentName;
    }

    public int getDeparmentId() {
        return deparmentId;
    }

    public void setDeparmentId(int deparmentId) {
        this.deparmentId = deparmentId;
    }

    public String getDeparmentName() {
        return deparmentName;
    }

    public void setDeparmentName(String deparmentName) {
        this.deparmentName = deparmentName;
    }

    @Override
    public String toString() {
        return "Deparment: " + "\nDeparment ID: " + deparmentId + "\nDeparment Name: " + deparmentName ;
    }
    
    public static void orm(ResultSet rs, Department d) throws ClassNotFoundException, SQLException {
        d.setDeparmentId(rs.getInt("DEPARMENTID"));
        d.setDeparmentName(rs.getString("DEPARMENTNAME"));
        
    }
    
    
    
    
    
}
