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
public class Documento {
   private int id_documento;
   private String tipoDocumento;
   private String tituloDocumento;
   private String autorDocumento;
   private String editorialDocumento;
   private String anioDocumento;
   private String edicionDocumento;
   private String categoriaDocumento;

    public Documento() {
    }
    
    public Documento(int id_documento,String tipoDocumento, String tituloDocumento, String autorDocumento, String editorialDocumento, String anioDocumento, String edicionDocumento, String categoriaDocumento) {
        this.id_documento = id_documento;
        this.tipoDocumento = tipoDocumento;
        this.tituloDocumento = tituloDocumento;
        this.autorDocumento = autorDocumento;
        this.editorialDocumento = editorialDocumento;
        this.anioDocumento = anioDocumento;
        this.edicionDocumento = edicionDocumento;
        this.categoriaDocumento = categoriaDocumento;
    }

    public int getId_documento() {
        return id_documento;
    }

    public void setId_documento(int id_documento) {
        this.id_documento = id_documento;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getTituloDocumento() {
        return tituloDocumento;
    }

    public void setTituloDocumento(String tituloDocumento) {
        this.tituloDocumento = tituloDocumento;
    }

    public String getAutorDocumento() {
        return autorDocumento;
    }

    public void setAutorDocumento(String autorDocumento) {
        this.autorDocumento = autorDocumento;
    }

    public String getEditorialDocumento() {
        return editorialDocumento;
    }

    public void setEditorialDocumento(String editorialDocumento) {
        this.editorialDocumento = editorialDocumento;
    }

    public String getAnioDocumento() {
        return anioDocumento;
    }

    public void setAnioDocumento(String anioDocumento) {
        this.anioDocumento = anioDocumento;
    }

    public String getEdicionDocumento() {
        return edicionDocumento;
    }

    public void setEdicionDocumento(String edicionDocumento) {
        this.edicionDocumento = edicionDocumento;
    }

    public String getCategoriaDocumento() {
        return categoriaDocumento;
    }

    public void setCategoriaDocumento(String categoriaDocumento) {
        this.categoriaDocumento = categoriaDocumento;
    }
   

    
   
   
}
