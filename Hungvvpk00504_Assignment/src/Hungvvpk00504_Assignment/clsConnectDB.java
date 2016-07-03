/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hungvvpk00504_Assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


/**
 *
 * @author Windows 10 Version 2
 */
public class clsConnectDB {
    String connectionString = "jdbc:sqlserver://670515ff-5167-42a8-a1e5-a638005ad31b.sqlserver.sequelizer.com:1433;" 
            + "databaseName=db670515ff516742a8a1e5a638005ad31b;user=ahyjijtoqgsplftr;password=Ld2NriGZzYdERdcgutka76GziFaPfiadaJx7bzWYTh6BsoYHnKqibTRPCzESiZTq;";
    Connection conn;
    public clsConnectDB(){
       
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection(connectionString);
            
            if(conn != null){
                System.out.println("Kết nối CSDL SQL Server thành công!");
            }
            
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.toString());
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
    
    //Thực thi câu lệnh SELECT
    public ResultSet ExcuteQueryGetTable(String cauTruyVanSQL){
        try {
            Statement stmt = conn.createStatement();           
            ResultSet rs = stmt.executeQuery(cauTruyVanSQL);
            return rs;
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
            
        return null;
    }
    //Thực thi INSERT, DELETE, UPDATE
    public void ExcuteQueryUpdateDB(String cauTruyVanSQL){
       
        try {
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(cauTruyVanSQL);
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
    
}
