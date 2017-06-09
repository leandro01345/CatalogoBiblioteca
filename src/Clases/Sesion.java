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
public class Sesion {
    
   private int id_sesion;
   private String userName;
   private String Password;
   private String tipoSesion;

    public Sesion() {
    }
    

    public Sesion(int id_sesion, String userName, String Password, String tipoSesion) {
        this.id_sesion = id_sesion;
        this.userName = userName;
        this.Password = Password;
        this.tipoSesion = tipoSesion;
    }

    public int getId_sesion() {
        return id_sesion;
    }

    public void setId_sesion(int id_sesion) {
        this.id_sesion = id_sesion;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getTipoSesion() {
        return tipoSesion;
    }

    public void setTipoSesion(String tipoSesion) {
        this.tipoSesion = tipoSesion;
    }
    
    
}
