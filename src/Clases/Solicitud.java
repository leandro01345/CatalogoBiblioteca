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
    private String fechaReserva;
    private String idSolicitud;
    private String fechaSolicitud;
    private String estado;

   

    public Solicitud() {
    }

    public Solicitud(int idUsuario, String fechaReserva, String idSolicitud, String fechaSolicitud, String estado) {
        this.idUsuario = idUsuario;
        this.fechaSolicitud = fechaSolicitud;
        this.idSolicitud = idSolicitud;
        this.fechaReserva = fechaReserva;
        this.estado = estado;
     
    }

    public String getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(String fechaReserva) {
        this.fechaReserva = fechaReserva;
    }
    
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
 
    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getIdSolicitud() {
        return idSolicitud;
    }

    public void setIdSolicitud(String idSolicitud) {
        this.idSolicitud = idSolicitud;
    }

    public String getFechaSolicitud() {
        return fechaSolicitud;
    }

    public void setFechaSolicitud(String fechaSolicitud) {
        this.fechaSolicitud = fechaSolicitud;
    }


    
}
