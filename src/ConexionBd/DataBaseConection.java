/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConexionBd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jose
 */
public class DataBaseConection {
      public static Connection getConneccion(){
     try {
          
            Class.forName("oracle.jdbc.driver.OracleDriver");  //DRIVER DE SQL DEVELOPER
            String myDB = "jdbc:oracle:thin:@localhost:1521:XE";//URL DE SQL DEVELOPER
            String usuario="biblioteca";
            String password="123";
            Connection cnx = DriverManager.getConnection(myDB,usuario,password);
            return cnx;
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DataBaseConection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }  
}
