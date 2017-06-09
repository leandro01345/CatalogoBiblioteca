/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Jose
 */
public class DetalleSolicitud {
    private int idEjemplar;
    private int solicitudId;

    public DetalleSolicitud() {
    }

    public DetalleSolicitud(int idEjemplar, int solicitudId) {
        this.idEjemplar = idEjemplar;
        this.solicitudId = solicitudId;
    }

    public int getIdEjemplar() {
        return idEjemplar;
    }

    public void setIdEjemplar(int idEjemplar) {
        this.idEjemplar = idEjemplar;
    }

    public int getSolicitudId() {
        return solicitudId;
    }

    public void setSolicitudId(int solicitudId) {
        this.solicitudId = solicitudId;
    }
    
    
}
