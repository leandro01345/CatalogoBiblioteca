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
import Clases.DetalleSolicitud;

/**
 *
 * @author Jose
 */
public class DetalleSolicitudDB {
    Connection cnx = null;
    Statement st = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    public void InsertInto(DetalleSolicitud d) {
        try {
            cnx = DataBaseConection.getConneccion();
            pst = cnx.prepareStatement("INSERT INTO DETALLESOLICITUD(EJEMPLAR_IDEJEMPLAR,SOLICITUD_IDSOLICITUD) "
                    + "VALUES(?,?)");
            pst.setInt(1, d.getIdEjemplar());
            pst.setInt(2, d.getSolicitudId());
            pst.executeQuery();
        } catch (SQLException e) {
            System.out.println(e.getMessage() + "Error guardar");
        }
    }
    
}
