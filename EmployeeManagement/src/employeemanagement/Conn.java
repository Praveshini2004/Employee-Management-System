/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeemanagement;
import java.sql.*;

/**
 *
 * @author DELL
 */
public class Conn {

    Connection c;
    Statement s;

    public Conn() {
        try {
            // Explicit driver loading is optional
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            
            c = DriverManager.getConnection("jdbc:mysql:///employeemanagementsystem", "root", "Praveshini");
            s = c.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
