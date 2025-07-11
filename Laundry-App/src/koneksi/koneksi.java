/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package koneksi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class koneksi {
    public static Connection getConnection(){
        Connection conn = null;
        String url = "jdbc:mysql://localhost:3306/nurhasanah";
        String user = "root";
        String pass = "";
        
        try{
            conn = DriverManager.getConnection(url, user, pass);
        } catch(SQLException e) {
            System.out.println("Failed to connect to database: " + e.getMessage());
        }
        return conn;
    }
}
