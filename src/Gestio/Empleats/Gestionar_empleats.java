/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestio.Empleats;
import Biblioteques.Arrays;
import Biblioteques.Auxiliar;
import Biblioteques.IO;
import Classes.Atraccio;
import Classes.Empleat;
import Classes.Persona;
import static Main.config.carregarConf;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.event.*;
import java.util.Iterator;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Usuari
 */
public class Gestionar_empleats extends javax.swing.JFrame {

    /**
     * Creates new form Gestionar_empleats
     */
    int seleccio = -1;
    int posicio = -1;
    public Gestionar_empleats() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Gestionar empleats");
        try{
            jPanel1.setBackground(Color.decode(Main.config.carregarConf()[0]));
        }catch (Exception e){
            IO.imprimirTI("Error al asignar color: " + e);
        }
        try{
            Component[] components1=this.getContentPane().getComponents();
            Main.config.setUIFont(new Font(carregarConf()[1], Integer.valueOf(carregarConf()[2]), Integer.valueOf(carregarConf()[3])), components1); 
        }catch(Exception e){
            IO.imprimirTI("Error al carregar la font: " + e);
        }
        
        textBusqueda.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                Auxiliar.llistar_empleats_taula(textBusqueda, jTable1);
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                Auxiliar.llistar_empleats_taula(textBusqueda, jTable1);
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                Auxiliar.llistar_empleats_taula(textBusqueda, jTable1);
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        textBusqueda = new javax.swing.JTextField();
        llimpiarButton = new javax.swing.JButton();
        CARREGARButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nomText = new javax.swing.JTextField();
        cognomsText = new javax.swing.JTextField();
        dniText = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        segonCognom = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        sexe = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        tipusDocument = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        dataNaixement = new javax.swing.JFormattedTextField();
        jLabel10 = new javax.swing.JLabel();
        provincia = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        codiPostal1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        ciutat = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        adreca = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        Telefon = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        nominaText = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        contrasenya = new javax.swing.JTextField();
        modificarButton = new javax.swing.JButton();
        BUIDARButton = new javax.swing.JButton();
        ELIMINARButton = new javax.swing.JButton();
        ENREREButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("GESTIONAR EMPLEATS");

        textBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textBusquedaActionPerformed(evt);
            }
        });

        llimpiarButton.setText("BUIDAR");
        llimpiarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                llimpiarButtonActionPerformed(evt);
            }
        });

        CARREGARButton.setText("CARREGAR");
        CARREGARButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CARREGARButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("Nom:");

        jLabel3.setText("Primer Cognom:");

        jLabel5.setText("Num Document");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nom", "Primer Cognom","Segon Cognom", "Sexe","Tipus Document","Num Document","Data Naixement","Codi Postal","Provincia","Ciutat","Adreça","Email","Telefon","Nomina"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false,false,false,false,false,false,false,false,false,false,false,
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jLabel6.setText("Segon Cognom");

        segonCognom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                segonCognomActionPerformed(evt);
            }
        });

        jLabel7.setText("Sexe");

        sexe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Home", "Dona" }));

        jLabel8.setText("Tipus Document");

        tipusDocument.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DNI", "NIE" }));

        jLabel9.setText("Data Naixement");

        jLabel10.setText("Codi Postal");

        provincia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                provinciaActionPerformed(evt);
            }
        });

        jLabel11.setText("Provincia");

        codiPostal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codiPostal1ActionPerformed(evt);
            }
        });

        jLabel12.setText("Ciutat");

        jLabel13.setText("Adreça");

        jLabel14.setText("Email");

        jLabel15.setText("Telefon");

        jLabel4.setText("Nomina:");

        jLabel16.setText("Contrasenya");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(textBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(llimpiarButton)
                                .addGap(4, 4, 4)
                                .addComponent(CARREGARButton)
                                .addGap(90, 90, 90)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel12))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(nomText)
                                    .addComponent(dniText)
                                    .addComponent(ciutat, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                                .addComponent(nominaText, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel9)
                            .addComponent(jLabel3)
                            .addComponent(jLabel16))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(adreca)
                            .addComponent(cognomsText)
                            .addComponent(dataNaixement)
                            .addComponent(contrasenya, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel10)
                            .addComponent(jLabel14))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(segonCognom)
                            .addComponent(codiPostal1)
                            .addComponent(email, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(sexe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(tipusDocument, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel11))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(provincia)
                                    .addComponent(Telefon, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE))))
                        .addGap(0, 174, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(llimpiarButton)
                    .addComponent(CARREGARButton))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cognomsText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(nomText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6)
                    .addComponent(segonCognom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(sexe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(tipusDocument, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(dniText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(dataNaixement, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(codiPostal1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(provincia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(ciutat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(adreca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(Telefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(nominaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(contrasenya, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        modificarButton.setText("MODIFICAR");
        modificarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarButtonActionPerformed(evt);
            }
        });

        BUIDARButton.setText("BUIDAR");
        BUIDARButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUIDARButtonActionPerformed(evt);
            }
        });

        ELIMINARButton.setText("ELIMINAR");
        ELIMINARButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ELIMINARButtonActionPerformed(evt);
            }
        });

        ENREREButton.setText("ENRERE");
        ENREREButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ENREREButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(modificarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BUIDARButton, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ELIMINARButton, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ENREREButton, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(modificarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BUIDARButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ELIMINARButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ENREREButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textBusquedaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textBusquedaActionPerformed

    private void CARREGARButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CARREGARButtonActionPerformed
       
        seleccio = Auxiliar.carregar_dades_empleats_taula(CARREGARButton, seleccio, this, jTable1, nomText, cognomsText,segonCognom,sexe,tipusDocument,dniText,dataNaixement,codiPostal1,provincia,ciutat,adreca,email,Telefon,nominaText);
    }//GEN-LAST:event_CARREGARButtonActionPerformed

    private void ELIMINARButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ELIMINARButtonActionPerformed
                int elements [] = null;
                int dialogResult = -1;
                try{
                    elements = jTable1.getSelectedRows();
                    int dialogButton = JOptionPane.YES_NO_OPTION;
                    dialogResult = JOptionPane.showConfirmDialog(null, "Estas segur de que vols eliminar el empleat " + ((Empleat) Arrays.arrayPersones.get(elements[0])).getNom() + "?", "CONFIRMACIO", dialogButton);
                    IO.imprimirTI("Element eliminar: " + ((Empleat) Arrays.arrayPersones.get(elements[0])).getNom());
                }catch (Exception error){
                    JOptionPane.showMessageDialog(this, "Selecciona un empleat");
                }
                    if(dialogResult == 0) {
                        if(((Empleat) Arrays.arrayPersones.get(elements[0])).getAssignat()){
                            JOptionPane.showMessageDialog(this, "Error: no es pot eliminar un empleat assignat a una atraccio");
                        }else{
                          try{
                            Auxiliar.log("Empleat eliminat: " + ((Empleat) Arrays.arrayPersones.get(elements[0])).getNom() + " " + ((Empleat) Arrays.arrayPersones.get(elements[0])).getDNI());
                            Arrays.arrayPersones.remove(elements[0]);
                            seleccio = -1;
                            nomText.setText("");
                            cognomsText.setText("");
                            dniText.setText("");
                            nominaText.setText("");
                            Auxiliar.llistar_empleats_taula(textBusqueda, jTable1);
                        }catch (Exception e){
                            IO.imprimirTI("Error al eliminar: " + e);
                            Auxiliar.logError("Error al eliminar empleat: " + e);
                        }  
                        } 
                    }
                 Auxiliar.llistar_empleats_taula(textBusqueda, jTable1);
    }//GEN-LAST:event_ELIMINARButtonActionPerformed

    private void llimpiarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_llimpiarButtonActionPerformed
        textBusqueda.setText("");
    }//GEN-LAST:event_llimpiarButtonActionPerformed

    private void ENREREButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ENREREButtonActionPerformed
        this.setVisible(false);
        Menu_empleats menuE = new Menu_empleats();
        menuE.setVisible(true);
    }//GEN-LAST:event_ENREREButtonActionPerformed

    private void modificarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarButtonActionPerformed
        if (seleccio==-1){
                    JOptionPane.showMessageDialog(this, "Carrega un empleat per a modificar");
                }else {
                    try {
                        String anticNom=Arrays.arrayPersones.get(seleccio).getNom();
                        String anticCognom=Arrays.arrayPersones.get(seleccio).getCognom1();
                        String anticSegonCognom=Arrays.arrayPersones.get(seleccio).getCognom2();
                        String anticSexe=Arrays.arrayPersones.get(seleccio).getSexe();
                        String anticTipdoc=Arrays.arrayPersones.get(seleccio).getTipusDocument();
                        String anticNumDoc=Arrays.arrayPersones.get(seleccio).getDNI();
                        String anticDataNaixement=Arrays.arrayPersones.get(seleccio).getDataNaixement();
                        String anticCodiPostal=Arrays.arrayPersones.get(seleccio).getCodiPostal();
                        String anticProvincia=Arrays.arrayPersones.get(seleccio).getProvincia();
                        String anticCP=Arrays.arrayPersones.get(seleccio).getCodiPostal();
                        String anticAdreca=Arrays.arrayPersones.get(seleccio).getAdreca();
                        String anticEmail=Arrays.arrayPersones.get(seleccio).getEmail();
                        String anticTelefon=Arrays.arrayPersones.get(seleccio).getTelefon();
                        String antigaNomina=((Empleat)Arrays.arrayPersones.get(seleccio)).getNomina();
                        Arrays.arrayPersones.get(seleccio).setNom(nomText.getText());
                        Arrays.arrayPersones.get(seleccio).setCognom1(cognomsText.getText());
                        Arrays.arrayPersones.get(seleccio).setDNI(dniText.getText());
                        ((Empleat)Arrays.arrayPersones.get(seleccio)).setNomina(nominaText.getText());
                        Auxiliar.llistar_empleats_taula(textBusqueda, jTable1);
                        JOptionPane.showMessageDialog(this, "Empleat " + Arrays.arrayPersones.get(seleccio).getNom()  +  " modificat correctament");
                        Auxiliar.log("Empleat modificat: " + anticNom + " | " + anticCognom + " | " + anticNumDoc + " | " + antigaNomina + " | " + "\nA: " + Arrays.arrayPersones.get(seleccio).getNom() + " | " + Arrays.arrayPersones.get(seleccio).getCognom1() + " | "+ Arrays.arrayPersones.get(seleccio).getDNI() + " | "+ ((Empleat)Arrays.arrayPersones.get(seleccio)).getNomina());
                    } catch (Exception error) {
                        IO.imprimirTI("Error al modificar: " + error);
                        Auxiliar.log("Error al modificar empleat: " + error);
                    }
                }
    }//GEN-LAST:event_modificarButtonActionPerformed

    private void BUIDARButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUIDARButtonActionPerformed
        seleccio = -1;
        nomText.setText("");
        cognomsText.setText("");
        segonCognom.setText("");
        dniText.setText("");
        dataNaixement.setText("");
        codiPostal1.setText("");
        provincia.setText("");
        ciutat.setText("");
        adreca.setText("");
        email.setText("");
        Telefon.setText("");
        nominaText.setText("");
    }//GEN-LAST:event_BUIDARButtonActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       // Auxiliar.llistar_empleats(textBusqueda, llistaEmpleats); //Llistar empleats al entrar al jframe
        Auxiliar.llistar_empleats_taula(textBusqueda, jTable1);
    }//GEN-LAST:event_formWindowOpened

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        if(evt.getClickCount()==2 && evt.getButton() == MouseEvent.BUTTON1){
            seleccio = Auxiliar.carregar_dades_empleats_taula(CARREGARButton, seleccio, this, jTable1, nomText, cognomsText,segonCognom,sexe,tipusDocument,dniText,dataNaixement,codiPostal1,provincia,ciutat,adreca,email,Telefon,nominaText);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void segonCognomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_segonCognomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_segonCognomActionPerformed

    private void codiPostal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codiPostal1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codiPostal1ActionPerformed

    private void provinciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_provinciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_provinciaActionPerformed

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
            java.util.logging.Logger.getLogger(Gestionar_empleats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gestionar_empleats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gestionar_empleats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gestionar_empleats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gestionar_empleats().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BUIDARButton;
    private javax.swing.JButton CARREGARButton;
    private javax.swing.JButton ELIMINARButton;
    private javax.swing.JButton ENREREButton;
    private javax.swing.JTextField Telefon;
    private javax.swing.JTextField adreca;
    private javax.swing.JTextField ciutat;
    private javax.swing.JTextField codiPostal1;
    private javax.swing.JTextField cognomsText;
    private javax.swing.JTextField contrasenya;
    private javax.swing.JFormattedTextField dataNaixement;
    private javax.swing.JTextField dniText;
    private javax.swing.JTextField email;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton llimpiarButton;
    private javax.swing.JButton modificarButton;
    private javax.swing.JTextField nomText;
    private javax.swing.JTextField nominaText;
    private javax.swing.JTextField provincia;
    private javax.swing.JTextField segonCognom;
    private javax.swing.JComboBox<String> sexe;
    private javax.swing.JTextField textBusqueda;
    private javax.swing.JComboBox<String> tipusDocument;
    // End of variables declaration//GEN-END:variables
}
