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
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


/**
 *
 * @author Jose
 */
public class DocumentoDB {
    Connection cnx = null;
    Statement st = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    //LISTADO DEL CLIENTE    
    public ArrayList<Documento> getListadoDocumento() {
        ArrayList<Documento> doc = new ArrayList<>();
        try {
            cnx = DataBaseConection.getConneccion();
            st = cnx.createStatement();
            rs = st.executeQuery("SELECT IDDOCUMENTO, TIPODOCUMENTO, TITULODOCUMENTO, AUTORDOCUMENTO, "
                    + "EDITORIALDOCUMENTO, EDICIONDOCUMENTO, ANIODOCUMENTO, CATEGORIADOCUMENTO, "
                    + "CANTIDAD, DISPONIBLES FROM V_CATALOGO WHERE DISPONIBLES > 0");
            while (rs.next()) {
                Documento d = new Documento();
                d.setId_documento(rs.getInt(1));
                d.setTipoDocumento(rs.getString(2));
                d.setTituloDocumento(rs.getString(3));
                d.setAutorDocumento(rs.getString(4));
                d.setEditorialDocumento(rs.getString(5));
                d.setAnioDocumento(rs.getString(6));
                d.setEdicionDocumento(rs.getString(7));
                d.setCategoriaDocumento(rs.getString(8));
               
                
                doc.add(d);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return doc;
    }
    //codigo para buscar
     public Documento getBuscarDocumentos(String titulo,String autor){
     Documento n=null;
         try {
            Connection cnx = DataBaseConection.getConneccion();
            Statement st = cnx.createStatement();
            ResultSet rs = st.executeQuery("SELECT *  FROM DOCUMENTO WHERE TITULODOCUMENTO = '"+titulo
                    +"'  and AUTORDOCUMENTO='"+autor+"'");
            while (rs.next()) {
            Documento d = new Documento();
                d.setId_documento(rs.getInt(1));
                d.setTituloDocumento(rs.getString(2));
                d.setTipoDocumento(rs.getString(3));
                d.setEditorialDocumento(rs.getString(4));
                d.setEdicionDocumento(rs.getString(5));
                d.setCategoriaDocumento(rs.getString(6));
                d.setAnioDocumento(rs.getString(7));
                d.setAutorDocumento(rs.getString(8));
           
            }
         } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println("Error en buscar");
         }
     return n;
     
     }
    public int getIdEjemplar(String idDocumento){
    int idEjemplar=0;
     try {
            Connection cnx = DataBaseConection.getConneccion();
            st = cnx.createStatement();
            rs=st.executeQuery("select primer_ejemplar_disponible from v_doc_ejemplar_disponible where "+ idDocumento +" =iddocumento");
            while(rs.next()){
            idEjemplar = rs.getInt(1);
            return idEjemplar;
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage()+" Error buscar");
        }
    return idEjemplar;
    } 
}
