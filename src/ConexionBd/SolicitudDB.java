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
            pst = cnx.prepareStatement("INSERT INTO SOLICITUD(USUARIO_IDUSUARIO, IDSOLICITUD , FECHASOLICITUD"
                    + ", ESTADOSOLICITUD)"
                    + " VALUES(?,?,?,?)");
            pst.setInt(1, s.getIdUsuario());
            pst.setString(2, s.getIdSolicitud());
            pst.setString(3, s.getFechaSolicitud());
            pst.setString(4, s.getEstado());
            pst.executeQuery();
        } catch (SQLException e) {
            System.out.println(e.getMessage() + "Error guardar");
        }
    }
}
