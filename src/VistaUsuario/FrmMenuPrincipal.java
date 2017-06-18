/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VistaUsuario;

import Clases.*;
import ConexionBd.DetalleSolicitudDB;
import ConexionBd.*;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Jose
 */
public class FrmMenuPrincipal extends javax.swing.JFrame {

    ArrayList<Documento>documentos;
    DocumentoDB db = new DocumentoDB();
    SolicitudDB dbSolicitud = new SolicitudDB();
    DetalleSolicitudDB dbDetalle = new DetalleSolicitudDB();
    private TableRowSorter trsFiltro;
    DefaultTableModel m;
    boolean logeado= false;
    int idLogin;
    
    
   

    /**
     * Creates new form FrmMenuPrincipal
     */
    public FrmMenuPrincipal() {
        initComponents();
        setLocationRelativeTo(null);
        this.limpiarDatos();
        this.listarDatos();
        lblListado.setFocusable(true);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dlgCarrito = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        btnEnviar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbSeleccion = new javax.swing.JTable();
        lblCarrito = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        lblFecha = new javax.swing.JLabel();
        DateSolicitud = new com.toedter.calendar.JDateChooser();
        PnlListado = new javax.swing.JPanel();
        btnLogearse = new javax.swing.JButton();
        txtTitulo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbDocumento = new javax.swing.JTable();
        lblListado = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        btnCarrito = new javax.swing.JButton();
        lblFiltrar = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        lblCategoria = new javax.swing.JLabel();
        lblAutor = new javax.swing.JLabel();
        txtAutor = new javax.swing.JTextField();
        txtCategoria = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        dlgCarrito.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(31, 32, 34));

        btnEnviar.setBackground(new java.awt.Color(0, 153, 204));
        btnEnviar.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        btnEnviar.setForeground(new java.awt.Color(255, 255, 255));
        btnEnviar.setText("Enviar solicitud");
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });

        tbSeleccion.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        tbSeleccion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Tipo", "Titulo", "Autor", "Editorial", "Año", "Edificion", "Categoria"
            }
        ));
        tbSeleccion.setDragEnabled(true);
        tbSeleccion.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane2.setViewportView(tbSeleccion);

        lblCarrito.setBackground(new java.awt.Color(0, 153, 204));
        lblCarrito.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        lblCarrito.setForeground(new java.awt.Color(0, 153, 204));
        lblCarrito.setText("Carrito de documentos");

        btnEliminar.setBackground(new java.awt.Color(0, 153, 204));
        btnEliminar.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("Quitar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        lblFecha.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        lblFecha.setForeground(new java.awt.Color(255, 255, 255));
        lblFecha.setText("Fecha:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(60, 500, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(lblCarrito, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(lblFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DateSolicitud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane2)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCarrito, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DateSolicitud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout dlgCarritoLayout = new javax.swing.GroupLayout(dlgCarrito.getContentPane());
        dlgCarrito.getContentPane().setLayout(dlgCarritoLayout);
        dlgCarritoLayout.setHorizontalGroup(
            dlgCarritoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        dlgCarritoLayout.setVerticalGroup(
            dlgCarritoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Appp Documentos");

        PnlListado.setBackground(new java.awt.Color(31, 32, 34));

        btnLogearse.setBackground(new java.awt.Color(0, 153, 204));
        btnLogearse.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        btnLogearse.setForeground(new java.awt.Color(255, 255, 255));
        btnLogearse.setText("Logearse");
        btnLogearse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogearseActionPerformed(evt);
            }
        });

        txtTitulo.setBackground(new java.awt.Color(31, 32, 34));
        txtTitulo.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        txtTitulo.setForeground(new java.awt.Color(255, 255, 255));
        txtTitulo.setText("Ingrese Titulo");
        txtTitulo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtTituloFocusGained(evt);
            }
        });
        txtTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTituloActionPerformed(evt);
            }
        });
        txtTitulo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTituloKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTituloKeyTyped(evt);
            }
        });

        tbDocumento.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        tbDocumento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id Documento", "Tipo", "Titulo", "Autor", "Editorial", "Año", "Edición", "Categoria"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbDocumento.setToolTipText("");
        tbDocumento.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tbDocumento.setDragEnabled(true);
        tbDocumento.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(tbDocumento);
        tbDocumento.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        lblListado.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        lblListado.setForeground(new java.awt.Color(0, 153, 204));
        lblListado.setText("Listado de documentos");

        btnAgregar.setBackground(new java.awt.Color(0, 153, 204));
        btnAgregar.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnCarrito.setBackground(new java.awt.Color(0, 153, 204));
        btnCarrito.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        btnCarrito.setForeground(new java.awt.Color(255, 255, 255));
        btnCarrito.setText("Carrito");
        btnCarrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarritoActionPerformed(evt);
            }
        });

        lblFiltrar.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        lblFiltrar.setForeground(new java.awt.Color(0, 153, 204));
        lblFiltrar.setText("Filtrar por: ");

        lblTitulo.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(102, 102, 102));
        lblTitulo.setText("Titulo:");

        lblCategoria.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        lblCategoria.setForeground(new java.awt.Color(102, 102, 102));
        lblCategoria.setText("Categoria:");

        lblAutor.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        lblAutor.setForeground(new java.awt.Color(102, 102, 102));
        lblAutor.setText("Autor:");

        txtAutor.setBackground(new java.awt.Color(31, 32, 34));
        txtAutor.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        txtAutor.setForeground(new java.awt.Color(255, 255, 255));
        txtAutor.setText("Ingrese autor");
        txtAutor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtAutorFocusGained(evt);
            }
        });
        txtAutor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAutorKeyTyped(evt);
            }
        });

        txtCategoria.setBackground(new java.awt.Color(31, 32, 34));
        txtCategoria.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        txtCategoria.setForeground(new java.awt.Color(255, 255, 255));
        txtCategoria.setText("Ingrese Categoria");
        txtCategoria.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCategoriaFocusGained(evt);
            }
        });
        txtCategoria.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCategoriaKeyTyped(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout PnlListadoLayout = new javax.swing.GroupLayout(PnlListado);
        PnlListado.setLayout(PnlListadoLayout);
        PnlListadoLayout.setHorizontalGroup(
            PnlListadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlListadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlListadoLayout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addGroup(PnlListadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCategoria)
                    .addComponent(lblAutor)
                    .addComponent(lblTitulo))
                .addGap(24, 24, 24)
                .addGroup(PnlListadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnlListadoLayout.createSequentialGroup()
                        .addComponent(txtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(263, 263, 263)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PnlListadoLayout.createSequentialGroup()
                        .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(275, 275, 275)
                        .addComponent(btnCarrito, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlListadoLayout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLogearse, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
            .addGroup(PnlListadoLayout.createSequentialGroup()
                .addGroup(PnlListadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnlListadoLayout.createSequentialGroup()
                        .addGap(224, 224, 224)
                        .addComponent(lblListado))
                    .addGroup(PnlListadoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblFiltrar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PnlListadoLayout.setVerticalGroup(
            PnlListadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlListadoLayout.createSequentialGroup()
                .addGroup(PnlListadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnlListadoLayout.createSequentialGroup()
                        .addComponent(lblListado, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlListadoLayout.createSequentialGroup()
                        .addGap(0, 36, Short.MAX_VALUE)
                        .addComponent(lblFiltrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PnlListadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAutor)
                            .addComponent(jLabel1))))
                .addGap(15, 15, 15)
                .addGroup(PnlListadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCategoria))
                .addGroup(PnlListadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnlListadoLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(btnCarrito, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PnlListadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(PnlListadoLayout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addComponent(lblTitulo))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlListadoLayout.createSequentialGroup()
                            .addGap(22, 22, 22)
                            .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(PnlListadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogearse, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PnlListado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PnlListado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogearseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogearseActionPerformed
        LoginUser login = new LoginUser();
        if (this.logeado ==false) {
              login.setVisible(true);
              dispose();
     
            
        } else {
           int dialogButton = JOptionPane.showConfirmDialog(this, "ya hay un usuario logeado,¿Desea Cerrar Sesion?");
            if (dialogButton==JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(this, "Sesion Cerrada :D!");
                login.setVisible(true);
                dispose();
                
            }
        }
     
    }//GEN-LAST:event_btnLogearseActionPerformed
public void filtroTitulo() {
  
    int columnaABuscar = 2;
       trsFiltro.setRowFilter(RowFilter.regexFilter(txtTitulo.getText(), columnaABuscar));
      
    }
public void filtroAutor()
{
   int columnaABuscar = 3;
   trsFiltro.setRowFilter(RowFilter.regexFilter(txtAutor.getText(), columnaABuscar));
}

public void filtroCategoria()
{
   int columnaABuscar = 7;
   trsFiltro.setRowFilter(RowFilter.regexFilter(txtCategoria.getText(), columnaABuscar));
}
    private void txtTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTituloActionPerformed

    private void txtTituloKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTituloKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTituloKeyPressed

    private void txtTituloKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTituloKeyTyped
         txtTitulo.addKeyListener(new KeyAdapter() {
           
            public void keyReleased(final KeyEvent e) {
                String cadena = (txtTitulo.getText());
                txtTitulo.setText(cadena);
                repaint();
                filtroTitulo();
            }
        });
        trsFiltro = new TableRowSorter(tbDocumento.getModel());
        tbDocumento.setRowSorter(trsFiltro);
    }//GEN-LAST:event_txtTituloKeyTyped

    private void btnCarritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarritoActionPerformed
      // TODO add your handling code here:
      dlgCarrito.setSize(600, 433);//Asignas tamaño (x,y)
      dlgCarrito.setLocationRelativeTo(null);//posicion
      dlgCarrito.setModal(true);//que se ubique al centro
      dlgCarrito.setVisible(true);//que se haga visible﻿
    }//GEN-LAST:event_btnCarritoActionPerformed

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        // TODO add your handling code here:
        try {
        int idSoli=0;
        String fecha="00/00/00";
        String hora=" hh24:mi:ss";
        
        Solicitud sol = new Solicitud(this.idLogin, idSoli, fecha, hora);
        
        dbSolicitud.InsertInto(sol);
       
        for (int i = 0; i < tbSeleccion.getRowCount(); i++) {
            String idDocumento= tbSeleccion.getValueAt(i, 0).toString(); 
            int idEjemplar = db.getIdEjemplar(idDocumento);
             DetalleSolicitud detalle = new DetalleSolicitud(idEjemplar, idSoli);
             dbDetalle.InsertInto(detalle);
            }        
        JOptionPane.showMessageDialog(this, "Solicitud exitosa!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al ingresar solicitud!");
        }

        
    }//GEN-LAST:event_btnEnviarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
         // TODO add your handling code here:
        LoginUser login = new LoginUser();
        int fselc = tbDocumento.getSelectedRow();
        try {
            String idDocumento, tipoDocumento, tituloDocumento, autorDocumento, editorialDocumento,
            anioDocumento, edicionDocumento, categoriaDocumento;
         
            if (fselc== -1){
                 JOptionPane.showMessageDialog(this, "Se debe seleccionar un documento.","Advertencia", JOptionPane.WARNING_MESSAGE);
              
            }
           if (this.logeado ==false) {
                 JOptionPane.showMessageDialog(this, "Debe haberse logeado anterior mente");
                 login.setVisible(true);
                 dispose();
            }
            else{
               
                m = (DefaultTableModel) tbDocumento.getModel();
                idDocumento = tbDocumento.getValueAt(fselc, 0).toString();
                tipoDocumento = tbDocumento.getValueAt(fselc, 1).toString();
                tituloDocumento = tbDocumento.getValueAt(fselc, 2).toString();
                autorDocumento = tbDocumento.getValueAt(fselc, 3).toString();
                editorialDocumento = tbDocumento.getValueAt(fselc, 4).toString();
                anioDocumento = tbDocumento.getValueAt(fselc, 5).toString();
                edicionDocumento = tbDocumento.getValueAt(fselc, 6).toString();
                categoriaDocumento = tbDocumento.getValueAt(fselc, 7).toString();
                
                m = (DefaultTableModel) tbSeleccion.getModel();
                String filaElementos[] ={idDocumento, tipoDocumento, tituloDocumento, autorDocumento,
                editorialDocumento, anioDocumento, edicionDocumento, categoriaDocumento};
                m.addRow(filaElementos);
                JOptionPane.showMessageDialog(this, "Agregado exitosamente");
                login.setVisible(false);
            }
        } catch (Exception e) {
            
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void txtAutorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAutorKeyTyped
        // TODO add your handling code here:
           txtAutor.addKeyListener(new KeyAdapter() {
           
            public void keyReleased(final KeyEvent e) {
                String cadena = (txtAutor.getText());
                txtAutor.setText(cadena);
                repaint();
                filtroAutor();
            }
        });
        trsFiltro = new TableRowSorter(tbDocumento.getModel());
        tbDocumento.setRowSorter(trsFiltro);
    }//GEN-LAST:event_txtAutorKeyTyped

    private void txtCategoriaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCategoriaKeyTyped
        // TODO add your handling code here:
            txtCategoria.addKeyListener(new KeyAdapter() {
           
            public void keyReleased(final KeyEvent e) {
                String cadena = (txtCategoria.getText());
                txtCategoria.getText();
                repaint();
                filtroCategoria();
            }
        });
        trsFiltro = new TableRowSorter(tbDocumento.getModel());
        tbDocumento.setRowSorter(trsFiltro);
    }//GEN-LAST:event_txtCategoriaKeyTyped

    private void txtAutorFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAutorFocusGained
        // TODO add your handling code here:
       
        lblTitulo.setForeground(new Color(102,102,102));
        lblCategoria.setForeground(new Color(102,102,102));
        lblAutor.setForeground(new Color(0,153,204));
        txtAutor.setText("");
    }//GEN-LAST:event_txtAutorFocusGained

    private void txtCategoriaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCategoriaFocusGained
        // TODO add your handling code here:
       
        lblTitulo.setForeground(new Color(102,102,102));
        lblCategoria.setForeground(new Color(0,153,204));
        lblAutor.setForeground(new Color(102,102,102));
        txtCategoria.setText("");
    }//GEN-LAST:event_txtCategoriaFocusGained

    private void txtTituloFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTituloFocusGained
        // TODO add your handling code here:
      
        lblTitulo.setForeground(new Color(0,153,204));
        lblCategoria.setForeground(new Color(102,102,102));
        lblAutor.setForeground(new Color(102,102,102));
        txtTitulo.setText("");
    }//GEN-LAST:event_txtTituloFocusGained

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
    
    }//GEN-LAST:event_btnEliminarActionPerformed
    public void listarDatos()
    {
      documentos= db.getListadoDocumento();
       DefaultTableModel tb =(DefaultTableModel)tbDocumento.getModel();
        for (Documento doc: documentos) {
        tb.addRow(new Object[]{doc.getId_documento(),doc.getTipoDocumento(),doc.getTituloDocumento()
        ,doc.getAutorDocumento(),doc.getEditorialDocumento(),doc.getAnioDocumento(),doc.getEdicionDocumento(),
        doc.getCategoriaDocumento()});
        } 
    }
    
    public void limpiarDatos(){
    DefaultTableModel tb=(DefaultTableModel)tbDocumento.getModel();
        for (int i =tb.getRowCount()-1;i>=0;  i--) {
            tb.removeRow(i);
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser DateSolicitud;
    private javax.swing.JPanel PnlListado;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCarrito;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnEnviar;
    private javax.swing.JButton btnLogearse;
    private javax.swing.JDialog dlgCarrito;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAutor;
    private javax.swing.JLabel lblCarrito;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblFiltrar;
    private javax.swing.JLabel lblListado;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTable tbDocumento;
    private javax.swing.JTable tbSeleccion;
    private javax.swing.JTextField txtAutor;
    private javax.swing.JTextField txtCategoria;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}
