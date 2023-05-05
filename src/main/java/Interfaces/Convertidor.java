/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;

import Handlers.BMPtoJPEGImage;
import Handlers.JPEGtoBMPImage;
import Handlers.ImageHandler;
import Handlers.JPEGHandler;
import Handlers.JPEGImageCopy;
import Handlers.JPEGImageHandlerBN;
import Handlers.JPEGImageHandlerColors;
import Handlers.JPEGImageHandlerRotator;
import Handlers.RunImageHandler;
import Handlers.RunInformacion;
import clases.Categorias;
import clases.Imagenes;
import clases.ListaCircular;
import clases.ListaUsuarios;
import clases.Nodo;
import clases.Usuario;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ItemEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author joz
 */
public class Convertidor extends javax.swing.JFrame {

    
    private File fichero;
    Categorias categoria;
    ListaUsuarios ListUs = new ListaUsuarios();
    ListaCircular ListIm = new ListaCircular();
    ListaCircular ListaGeneral = new ListaCircular();
    DefaultListModel <String> general = new DefaultListModel<>();
    public Convertidor() {
        initComponents();
        setLocationRelativeTo(null);
        recuperarlista();
        llenarUsuario();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        Convertir = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jPanel6 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        CambiarByN = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        ListUsuario = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        ListCat = new javax.swing.JComboBox<>();
        Agregar = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        aBMP = new javax.swing.JCheckBox();
        asdasd = new javax.swing.JPanel();
        aCopia = new javax.swing.JCheckBox();
        asdfasdfadsf = new javax.swing.JPanel();
        aColores = new javax.swing.JCheckBox();
        jPanel5 = new javax.swing.JPanel();
        aRotarH = new javax.swing.JCheckBox();
        aRotarV = new javax.swing.JCheckBox();
        jPanel7 = new javax.swing.JPanel();
        aGrises = new javax.swing.JCheckBox();
        jSeparator4 = new javax.swing.JSeparator();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel11 = new javax.swing.JLabel();
        Ejecutar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListGeneral = new javax.swing.JList<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        Ejecucion = new javax.swing.JTextArea();

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4.setText("Convertir Imagen");

        Convertir.setText("Convertir");
        Convertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConvertirActionPerformed(evt);
            }
        });

        jCheckBox1.setText("BMP a JPEG ");

        jCheckBox2.setText("JPEG a BMP");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox2)
                            .addComponent(jCheckBox1))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Convertir)
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBox1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Convertir)
                        .addGap(36, 36, 36))))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel9.setText("Escala de Grises");

        CambiarByN.setText("Cambiar");
        CambiarByN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CambiarByNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CambiarByN)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CambiarByN)
                .addGap(14, 14, 14))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 28)); // NOI18N
        jLabel1.setText("Convertidor");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Usuario");

        ListUsuario.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ListUsuarioItemStateChanged(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Categoria");

        Agregar.setText("Agregar");
        Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        aBMP.setText("Convertir a BMP");
        aBMP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aBMPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(aBMP)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(aBMP)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        asdasd.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        aCopia.setText("Hacer Una Copia");

        javax.swing.GroupLayout asdasdLayout = new javax.swing.GroupLayout(asdasd);
        asdasd.setLayout(asdasdLayout);
        asdasdLayout.setHorizontalGroup(
            asdasdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(asdasdLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(aCopia)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        asdasdLayout.setVerticalGroup(
            asdasdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(asdasdLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(aCopia)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        asdfasdfadsf.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        aColores.setText("Cambiar a Escala de Colores");

        javax.swing.GroupLayout asdfasdfadsfLayout = new javax.swing.GroupLayout(asdfasdfadsf);
        asdfasdfadsf.setLayout(asdfasdfadsfLayout);
        asdfasdfadsfLayout.setHorizontalGroup(
            asdfasdfadsfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(asdfasdfadsfLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(aColores)
                .addContainerGap(75, Short.MAX_VALUE))
        );
        asdfasdfadsfLayout.setVerticalGroup(
            asdfasdfadsfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(asdfasdfadsfLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(aColores)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        aRotarH.setText("Rotar Horizontal");

        aRotarV.setText("Rotar Vertical");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(aRotarH)
                    .addComponent(aRotarV))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(aRotarH)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(aRotarV)
                .addContainerGap())
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        aGrises.setText("Cambiar a Escala de Grises");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(aGrises)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(aGrises)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel11.setText("Consola de Ejecucion");

        Ejecutar.setText("Ejecutar en Paralelo");
        Ejecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EjecutarActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(ListGeneral);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Seleccione Modificaciones");

        jLabel6.setText("Archivos Seleccionados");

        Ejecucion.setColumns(20);
        Ejecucion.setRows(5);
        jScrollPane3.setViewportView(Ejecucion);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(38, 38, 38)
                                        .addComponent(Agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel2)
                                                .addComponent(jLabel3)
                                                .addComponent(ListCat, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(ListUsuario, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(asdasd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(asdfasdfadsf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(61, 61, 61)
                                        .addComponent(Ejecutar)))
                                .addGap(43, 43, 43)
                                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(51, 51, 51)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel6)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(66, 66, 66)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel11)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(67, 67, 67)))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 585, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(18, 18, 18)
                            .addComponent(ListUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel3)
                            .addGap(18, 18, 18)
                            .addComponent(ListCat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(33, 33, 33)
                            .addComponent(Agregar)
                            .addGap(31, 31, 31)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel5)
                            .addGap(15, 15, 15)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(asdasd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(asdfasdfadsf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(Ejecutar)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void recuperarlista(){
    try {

            ObjectInputStream recuperando_fichero = new ObjectInputStream(
                    new FileInputStream("C:\\Users\\joz\\OneDrive\\Documentos\\NetBeansProjects\\Proyecto2usuarios.dat")
            );

            ListaUsuarios lista_recuperada = (ListaUsuarios) recuperando_fichero.readObject();
            recuperando_fichero.close();

            ListUs= lista_recuperada;
 

        } catch (Exception e) {
            System.err.println("ERROR: " + e.getMessage());
            System.err.println(e);
        }
    
    }
    
    
    private void llenarUsuario(){
       
        for (int i = 0; i < ListUs.getSize(); i++) {
            Usuario usuario = (Usuario) ListUs.get(i);
        ListUsuario.addItem(usuario.getNombre());
            
        }
     }
    
     private String rutaUsuario(String UsuarioActual){
    String nombreruta="C:\\Users\\joz\\OneDrive\\Documentos\\NetBeansProjects\\"+UsuarioActual+"categoria.dat";
    return nombreruta;
    }
    
    
//     private String rutacategorias(String categoria){
//    
//        String nombreruta="C:\\Users\\joz\\OneDrive\\Documentos\\NetBeansProjects\\"+UsuarioActual+categoria+"imagenes.dat";
//    return nombreruta;
//    
//    
//    }
    
    private void recuperarcat(String usuario){
    try {

            ObjectInputStream recuperando_fichero = new ObjectInputStream(
                    new FileInputStream(rutaUsuario(usuario))
            );

            Categorias lista_recuperada = (Categorias) recuperando_fichero.readObject();
            recuperando_fichero.close();

            categoria= lista_recuperada;
 

        } catch (Exception e) {
            System.err.println("ERROR: " + e.getMessage());
            System.err.println(e);
        }
    }
    
    
    
    private void llenarCategoria (){
    
    }
    
    private void ConvertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConvertirActionPerformed
        ImageHandler imagen = new JPEGtoBMPImage(fichero.getName(), fichero.getPath());

        try {
            JPEGHandler.runHandler(imagen);
        } catch (Exception e) {
            System.err.println("Error HandlerBMPCopy: " + e.getMessage());
        }
    }//GEN-LAST:event_ConvertirActionPerformed

    private void CambiarByNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CambiarByNActionPerformed
        ImageHandler imagen = new Handlers.JPEGImageHandlerBN(fichero.getName(), fichero.getPath());
        try {
            JPEGHandler.runHandler(imagen);
        } catch (Exception e) {
            System.out.println("Error HandlerColor:" + e.getMessage());
        }
    }//GEN-LAST:event_CambiarByNActionPerformed

    private void ListUsuarioItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ListUsuarioItemStateChanged
       if (evt.getStateChange() == ItemEvent.SELECTED){
           String usuario = this.ListUsuario.getSelectedItem().toString();
           recuperarcat(usuario);

           if (categoria != null){
           for (int i = 0; i < categoria.getCat().size(); i++) {
               String agregar = categoria.indice(i).toString();
               ListCat.addItem(agregar);
               
           }
           }else{
              ListCat.removeAllItems();
           }
           
           categoria = null;
 
      }
    }//GEN-LAST:event_ListUsuarioItemStateChanged

    private void AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarActionPerformed
       cargarimagenes();
        if (ListIm != null){
        
            for (int i = 0; i < ListIm.getSize(); i++) {
             Object im =  ListIm.get(i);
             Imagenes im1=(Imagenes) im;
             ListaGeneral.add(im); 
              general.addElement(im1.getNombre());
            }
    

        ListGeneral.setModel(general);
        }  
        
        
        ListaGeneral.mostrarLista();       
    }//GEN-LAST:event_AgregarActionPerformed

    private void aBMPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aBMPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aBMPActionPerformed

    
    
    
    
    
    
    private void EjecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EjecutarActionPerformed
      
        for (int i = 0; i < ListaGeneral.getSize(); i++) {
            Object obj = ListaGeneral.get(i);
            Imagenes im = (Imagenes) obj;
            fichero = im.getImagen();
            
           if(this.aBMP.isSelected()){
        ImageHandler imagen = new JPEGtoBMPImage(fichero.getName(), fichero.getPath());
        
            Thread hilo1 = new Thread(new RunImageHandler(imagen));
            hilo1.start();
       
        }
        Thread hilo11 = new Thread(new RunInformacion(Ejecucion, im.getNombre(),"Convertida a BmP"));
           hilo11.start();
          
        //Ejecucion.append(im.getNombre()+"Convertida a BmP"+"\n");
        
           
        if(this.aCopia.isSelected()){
        ImageHandler imagen = new JPEGImageCopy(fichero.getName(), fichero.getPath());
        
            Thread hilo2 = new Thread(new RunImageHandler(imagen));
            hilo2.start();
            
        }
        
        Thread hilo12 = new Thread(new RunInformacion(Ejecucion, im.getNombre(),"Copiada"));
           hilo12.start();
        
        
       // Ejecucion.append(im.getNombre()+"Copiada"+"\n");
        
        if(this.aColores.isSelected()){
             ImageHandler imagen = new JPEGImageHandlerColors(fichero.getName(), fichero.getPath());
        
            Thread hilo3 = new Thread(new RunImageHandler(imagen));
            hilo3.start();
        
        }
        
        Thread hilo13 = new Thread(new RunInformacion(Ejecucion, im.getNombre(),"Transformada a Colores"));
           hilo13.start();
        
        //Ejecucion.append(im.getNombre()+"Transformada a Colores"+"\n");
        
        
        if(this.aRotarH.isSelected()){
        ImageHandler imagen = new JPEGImageHandlerRotator(fichero.getName(), fichero.getPath());
        
            Thread hilo4 = new Thread(new RunImageHandler(imagen));
            hilo4.start();
        }
       
        Thread hilo14 = new Thread(new RunInformacion(Ejecucion, im.getNombre(),"Rotada en Horizontal y Vertical"));
           hilo14.start();
    //Ejecucion.append(im.getNombre()+"Rotada en Horizontal y Vertical"+"\n");
        
        if(this.aRotarV.isSelected()){
        
        }
        
        if(this.aGrises.isSelected()){
        ImageHandler imagen = new JPEGImageHandlerBN(fichero.getName(), fichero.getPath());
        
            Thread hilo5 = new Thread(new RunImageHandler(imagen));
            hilo5.start();
        } 
       Thread hilo15 = new Thread(new RunInformacion(Ejecucion, im.getNombre(),"Transformada a Escala de grises"));
           hilo15.start(); 

//Ejecucion.append(im.getNombre()+"Transformada a Escala de grises"+"\n");    
        }
          
    }//GEN-LAST:event_EjecutarActionPerformed

    public void mostrarimagen(ImageIcon image){
    
//    mostrarImagen.setText("sss");
//    mostrarImagen.setPreferredSize(new Dimension(43, 16));
//    mostrarImagen.setVisible(true);
//    
//    
//    ImPanel.setLayout(null);
//    
//        Icon icono = new ImageIcon(image.getImage().
//                           getScaledInstance(imagen1.getWidth(), imagen1.getHeight(), Image.SCALE_DEFAULT));
//            
//            imagen1.setIcon(icono);
//    JLabel mostrarImagen = new JLabel();
//    mostrarImagen.setPreferredSize(new Dimension(100, 50));
//mostrarImagen.setFont(new Font("Arial", Font.BOLD, 16));
//mostrarImagen.setBackground(Color.WHITE);
//
//    
//    mostrarImagen.setBounds(10, 10, 20, 20);
//    mostrarImagen.setIcon(icono);
//    ImPanel.add(mostrarImagen);
    }
    
    
    
    private void cargarimagenes(){
            String Us = ListUsuario.getSelectedItem().toString();
            String nom = ListCat.getSelectedItem().toString();
            String ruta = "C:\\Users\\joz\\OneDrive\\Documentos\\NetBeansProjects\\" + Us + nom + "imagenes.dat";
       // usuarioactual + nombrecategoria + imagenes + .dat
    
     try {

            ObjectInputStream recuperando_fichero = new ObjectInputStream(
                    new FileInputStream(ruta));

            ListaCircular lista_recuperada = (ListaCircular) recuperando_fichero.readObject();
            recuperando_fichero.close();

            ListIm= lista_recuperada;
 
        } catch (Exception e) {
            System.err.println("ERROR: " + e.getMessage());
            System.err.println(e);
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
            java.util.logging.Logger.getLogger(Convertidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Convertidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Convertidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Convertidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Convertidor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Agregar;
    private javax.swing.JButton CambiarByN;
    private javax.swing.JButton Convertir;
    private javax.swing.JTextArea Ejecucion;
    private javax.swing.JButton Ejecutar;
    private javax.swing.JComboBox<String> ListCat;
    private javax.swing.JList<String> ListGeneral;
    private javax.swing.JComboBox<String> ListUsuario;
    private javax.swing.JCheckBox aBMP;
    private javax.swing.JCheckBox aColores;
    private javax.swing.JCheckBox aCopia;
    private javax.swing.JCheckBox aGrises;
    private javax.swing.JCheckBox aRotarH;
    private javax.swing.JCheckBox aRotarV;
    private javax.swing.JPanel asdasd;
    private javax.swing.JPanel asdfasdfadsf;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    // End of variables declaration//GEN-END:variables
}
