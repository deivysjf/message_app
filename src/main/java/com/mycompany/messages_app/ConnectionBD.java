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
public class ConnectionBD {
    String url = "jdbc:mysql://localhost:3306/";
    String bd = "message_app";
    String user = "root";
    String password = "";
    
    public ConnectionBD(String bd){
        this.bd = bd;
    }
    
    public Connection get_connection(){
        Connection connection = null;
        try{
            connection = DriverManager.getConnection(url+bd, user, password);
            if(connection !=null){
                System.out.println("Conexion exitosa con la BD:"+ bd);
            }
        }catch(SQLException e){
            System.out.println(e);
                    }
        return connection;
    }
}
