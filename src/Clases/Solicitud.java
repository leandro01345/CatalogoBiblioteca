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
public class Solicitud {
    private int idUsuario;
    private int idSolicitud;
    private String fechaSolicitud;
    private String horaSolicitud;

    public Solicitud() {
    }

    public Solicitud(int idUsuario, int idSolicitud, String fechaSolicitud, String horaSolicitud) {
        this.idUsuario = idUsuario;
        this.idSolicitud = idSolicitud;
        this.fechaSolicitud = fechaSolicitud;
        this.horaSolicitud = horaSolicitud;
    }

    public String getHoraSolicitud() {
        return horaSolicitud;
    }

    public void setHoraSolicitud(String horaSolicitud) {
        this.horaSolicitud = horaSolicitud;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdSolicitud() {
        return idSolicitud;
    }

    public void setIdSolicitud(int idSolicitud) {
        this.idSolicitud = idSolicitud;
    }

    public String getFechaSolicitud() {
        return fechaSolicitud;
    }

    public void setFechaSolicitud(String fechaSolicitud) {
        this.fechaSolicitud = fechaSolicitud;
    }


    
}
