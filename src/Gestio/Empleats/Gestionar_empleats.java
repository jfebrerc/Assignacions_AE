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
        ELIMINARButton = new javax.swing.JButton();
        ENREREButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nomText = new javax.swing.JTextField();
        cognomsText = new javax.swing.JTextField();
        dniText = new javax.swing.JTextField();
        nominaText = new javax.swing.JTextField();
        modificarButton = new javax.swing.JButton();
        BUIDARButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

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

        jLabel2.setText("Nom:");

        jLabel3.setText("Cognom:");

        jLabel4.setText("Nomina:");

        jLabel5.setText("DNI:");

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

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nom", "Cognom", "DNI", "Nomina"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cognomsText)
                            .addComponent(nomText)
                            .addComponent(dniText)
                            .addComponent(nominaText, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(modificarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BUIDARButton, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(440, 440, 440))
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(textBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(llimpiarButton)
                        .addGap(4, 4, 4)
                        .addComponent(CARREGARButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ELIMINARButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ENREREButton)
                        .addContainerGap(383, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(llimpiarButton)
                    .addComponent(ELIMINARButton)
                    .addComponent(ENREREButton)
                    .addComponent(CARREGARButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BUIDARButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(modificarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(nomText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cognomsText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(dniText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nominaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))))
                .addGap(421, 421, 421))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 689, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textBusquedaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textBusquedaActionPerformed

    private void CARREGARButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CARREGARButtonActionPerformed
        //seleccio = Auxiliar.carregar_dades_empleats(llistaEmpleats, this, nomText, cognomsText, dniText, nominaText, seleccio);
        seleccio = Auxiliar.carregar_dades_empleats_taula(CARREGARButton, seleccio, this, jTable1, nomText, cognomsText, dniText, nominaText);
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
                        Arrays.arrayPersones.get(seleccio).setNom(nomText.getText());
                        Arrays.arrayPersones.get(seleccio).setCognom1(cognomsText.getText());
                        Arrays.arrayPersones.get(seleccio).setDNI(dniText.getText());
                        ((Empleat)Arrays.arrayPersones.get(seleccio)).setNomina(nominaText.getText());
                        Auxiliar.llistar_empleats_taula(textBusqueda, jTable1);
                        JOptionPane.showMessageDialog(this, "Empleat " + Arrays.arrayPersones.get(seleccio).getNom()  +  " modificat correctament");
                        Auxiliar.log("Empleat modificat: " + anticNom + " a: " + Arrays.arrayPersones.get(seleccio).getNom());
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
        dniText.setText("");
        nominaText.setText("");
    }//GEN-LAST:event_BUIDARButtonActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       // Auxiliar.llistar_empleats(textBusqueda, llistaEmpleats); //Llistar empleats al entrar al jframe
        Auxiliar.llistar_empleats_taula(textBusqueda, jTable1);
    }//GEN-LAST:event_formWindowOpened

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
    private javax.swing.JTextField cognomsText;
    private javax.swing.JTextField dniText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton llimpiarButton;
    private javax.swing.JButton modificarButton;
    private javax.swing.JTextField nomText;
    private javax.swing.JTextField nominaText;
    private javax.swing.JTextField textBusqueda;
    // End of variables declaration//GEN-END:variables
}
