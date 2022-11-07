/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.messages_app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author deivy
 */
public class ConexionBd {
    //attributes 
    String url = "jdbc:mysql://localhost:3306/";
    String db = "message_app";
    String user = "root";
    String password = "";
 //constructor 
    public ConexionBd(String db){
        this.db = db;
    }
    
    public Connection get_connection(){
        Connection conector = null;
        try{
            conector = DriverManager.getConnection(url+db, user, password);
            if (conector!=null){
                System.out.println("Conexion exitosa con Bd: "+db);
            }
        }catch (SQLException e){
            System.out.println(e);
        }
        return conector;
    }
}