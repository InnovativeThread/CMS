/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.InnovativeThread.cms.Connection;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

/**
 *
 * @author MOHIT
 */
public class DBConnection {
    private Connection con;
    private String db_url;
    private String user;
    private String password;
    static{
        try{
        Class.forName("oracle.jdbc.driver.OracleDriver");
        }
        catch(Exception e){
            System.out.println("Error while loading drivers.....\n"+e.getMessage());
        }
    }

    public DBConnection() {
        Properties prop = new Properties();
        try{
            prop.load(new FileInputStream("dbconfig.properties"));
            db_url=prop.getProperty("db_url");
            user=prop.getProperty("user");
            password=prop.getProperty("password");
            con=DriverManager.getConnection(db_url,user,password);
        }
        catch(Exception e){
            System.out.println("Error while connectin to database.....\n"+e.getMessage());
        }
    }
    public Connection getConnection(){
        System.out.println(""+db_url+","+user+","+password);
        return con;
    }
//    public static void main(String[] args) {
//        DBConnection dbc =new DBConnection();
//        dbc.getConnection();
//    }
}

