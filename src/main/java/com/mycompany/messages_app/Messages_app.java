/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.messages_app;

import java.sql.Connection;

/**
 *
 * @author deivy
 */
public class Messages_app {

    public static void main(String[] args) {
        
        ConnectionBD connections = new ConnectionBD("message_app");
        connections.get_connection();
        System.out.println();
        ConexionBd conexion = new ConexionBd("message_app");
        conexion.get_connection();
    }
}
