/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.*;
import java.lang.*;
/**
 *
 * @author Meow
 */
public class ConnectionBuilder {
    public static Connection connect() throws ClassNotFoundException, SQLException {
        Connection con = null;
        String user = "pedproject";
        String pass = "nabLnlekPpnqwHBY";
        //String url = "jdbc:mysql://139.59.247.29:3306/boo
        String url = "jdbc:mysql://ks.in.th/INT303_PedProject";        
        //String classname = ;
        
        //jdbc:mysql://<mydomain ip>:3306/<DBName>
//        System.out.println("000");
        
       try{
           
//           System.out.println("kkkk");
           Class.forName("com.mysql.jdbc.Driver");
           
//           System.out.println("1");
           con = DriverManager.getConnection(url,user,pass);
//           System.out.println("2");
       }catch(ClassNotFoundException e){
           System.out.println("CANT CONNECT!");
           System.out.println(e);
           
       }catch(SQLException e){
           System.out.println(e);
       }
       
       return con;
       
       
    }

    
    
}
