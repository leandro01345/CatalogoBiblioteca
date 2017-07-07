/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConexionBd;

import Clases.Documento;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import Clases.Sesion;
import java.sql.SQLException;
import java.util.ArrayList;

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
      pass = Sesion.md5(pass);
      try{
            Connection cnx = DataBaseConection.getConneccion();
            Statement st = cnx.createStatement();
            ResultSet rs = st.executeQuery("SELECT USERNAMESESION,PASSWORDSESION "
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
        public ArrayList<Sesion> getListadoSesion() {
        ArrayList<Sesion> se = new ArrayList<>();
        try {
            cnx = DataBaseConection.getConneccion();
            st = cnx.createStatement();
            rs = st.executeQuery("SELECT * FROM SESION");
            while (rs.next()) {
                Sesion s = new Sesion();
                s.setId_sesion(rs.getInt(1));
                s.setUserName(rs.getString(2));
                s.setPassword(rs.getString(3));
                s.setTipoSesion(rs.getString(4));
             
               
                
                se.add(s);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return se;
    }
      public int BuscarId(String user, String pass){
      int id=0;
      try{
            Connection cnx = DataBaseConection.getConneccion();
            Statement st = cnx.createStatement();
            ResultSet rs = st.executeQuery("SELECT USERNAMESESION , PASSWORDSESION, USUARIO_IDUSUARIO"
                    + " FROM SESION ");
             while(rs.next()){
                if(user.equals(rs.getString(1))&&pass.equals(rs.getString(2)))
                { id = rs.getInt(3);
                    return id;}
             }
         }catch(SQLException es){
         System.out.println(es.getMessage());
         System.out.println("Error en buscar");
        }
   return id; 
  }
}
