/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConexionBd;


import Clases.Solicitud;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Jose
 */
public class SolicitudDB {
    Connection cnx = null;
    Statement st = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    public void InsertInto(Solicitud s) {
        try {
            cnx = DataBaseConection.getConneccion();
            pst = cnx.prepareStatement("INSERT INTO SOLICITUD(IDSOLICITUD,USUARIO_IDUSUARIO,FECHASOLICITUD,"
                    + " HORASOLICITUD)"
                    + " VALUES(?,?,?,?)");
            pst.setInt(1, s.getIdSolicitud());
            pst.setInt(2, s.getIdUsuario());
            pst.setString(3, s.getFechaSolicitud());
            pst.setString(4, s.getHoraSolicitud());
            pst.executeQuery();
        } catch (SQLException e) {
            System.out.println(e.getMessage() + "Error guardar");
        }
    }
}
