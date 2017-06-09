/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConexionBd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import Clases.Sesion;
import java.sql.SQLException;

/**
 *
 * @author Jose
 */
public class SesionDB {
    Connection cnx = null;
    Statement st = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    
      public boolean AutenticarUsuario(String user, String pass){
      Sesion Se=null;
      try{
            Connection cnx = DataBaseConection.getConneccion();
            Statement st = cnx.createStatement();
            ResultSet rs = st.executeQuery("SELECT  USERNAMESESION,PASSWORDSESION "
                    + "FROM SESION  ");
             while(rs.next()){
                if(user.equals(rs.getString(1))&&pass.equals(rs.getString(2)))
                {return true;}
             }
         }catch(SQLException es){
         System.out.println(es.getMessage());
         System.out.println("Error en buscar");
        }
   return false; 
  }
}
