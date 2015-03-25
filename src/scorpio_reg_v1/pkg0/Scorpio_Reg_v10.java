/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scorpio_reg_v1.pkg0;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;



/**
 *
 * @author luis
 */
public class Scorpio_Reg_v10 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
      
     Mainform theApplet = new Mainform();
         
         theApplet.init();   // invoke the applet's init() method
         theApplet.start();  // starts the applet
 
         // Create a window (JFrame) and make applet the content pane.
          javax.swing.JFrame window = new javax.swing.JFrame("Scorpio_App_V1.0");
          window.setContentPane(theApplet);
          window.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
          window.pack();              // Arrange the components.
          window.setVisible(true);    // Make the window visible. 
    
    
    }
    
}