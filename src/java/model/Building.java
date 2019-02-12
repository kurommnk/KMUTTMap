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
public class Building {
    private int buildId;
    private String buildName;
    private int floor;
    private int deparmentId;
    private String type;
    private String describe;

    public Building() {
    }

    public Building(int buildId, String buildName, int floor, int deparmentId, String type, String describe) {
        this.buildId = buildId;
        this.buildName = buildName;
        this.floor = floor;
        this.deparmentId = deparmentId;
        this.type = type;
        this.describe = describe;
    }
        

    public int getBuildId() {
        return buildId;
    }

    public void setBuildId(int buildId) {
        this.buildId = buildId;
    }

    public String getBuildName() {
        return buildName;
    }

    public void setBuildName(String buildName) {
        this.buildName = buildName;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getDeparmentId() {
        return deparmentId;
    }

    public void setDeparmentId(int deparmentId) {
        this.deparmentId = deparmentId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    @Override
    public String toString() {
        return "Building\n" + "Build ID: " + buildId + "\nBuild Name: " + buildName + "\nFloor: " + floor + "\nDeparment ID: " 
                + deparmentId + "\nType: " + type + "\nDescribe: " + describe ;
        
    }
    
    public void orm(ResultSet rs, Building b) throws ClassNotFoundException, SQLException {
        b.setBuildId(rs.getInt("BUILDID"));
        b.setBuildName(rs.getString("BUILDNAME"));
        b.setFloor(rs.getInt("FLOOR"));
        b.setDeparmentId(rs.getInt("DEPARTMENTID"));
        b.setType(rs.getString("TYPE"));
        b.setDescribe(rs.getString("DETAIL"));
        
    }
    
    
    
    
}
