/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scorpio_reg_v1.pkg0;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
/**
 *
 * @author luis
 */
public class ConexionDB {
    
    Connection ConexionDB=null;
    public Connection conexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            ConexionDB=(Connection) DriverManager.getConnection("jdbc:mysql://192.168.2.44/scorpio","luis davila","luisdavila");
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
        return ConexionDB;
    }
    
}
