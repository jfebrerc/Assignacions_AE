/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestio.Assignacio_EA;
import Biblioteques.Arrays;
import Biblioteques.Auxiliar;
import Biblioteques.IO;
import Classes.Empleat;
import Classes.Persona;
import Classes.Atraccio;
import java.awt.Color;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.MouseEvent;
/**
 *
 * @author Usuari
 */
public class Gestio_assignacio extends javax.swing.JFrame {
    int seleccio = -1;
    /**
     * Creates new form Gestio_assignacio
     */
    public Gestio_assignacio() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Gestionar assignacions");
        try{
            jPanel1.setBackground(Color.decode(Main.config.carregarConf()));
        }catch (Exception e){
            IO.imprimirTI("Error al asignar color: " + e);
        }
        buscarAssign.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                Auxiliar.llistar_assignacio_taula(buscarAssign, jTable1);
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                Auxiliar.llistar_assignacio_taula(buscarAssign, jTable1);
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                Auxiliar.llistar_assignacio_taula(buscarAssign, jTable1);
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
        buscarAssign = new javax.swing.JTextField();
        BUIDARButton = new javax.swing.JButton();
        CARREGARButton = new javax.swing.JButton();
        ELIMINARButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        dataText = new javax.swing.JTextField();
        MODIFICARButton = new javax.swing.JButton();
        BUIDARButton1 = new javax.swing.JButton();
        ENREREButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("GESTIÓ ASSIGNACIONS");

        BUIDARButton.setText("BUIDAR");
        BUIDARButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUIDARButtonActionPerformed(evt);
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

        jLabel2.setText("Data:");

        MODIFICARButton.setText("MODIFICAR");
        MODIFICARButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MODIFICARButtonActionPerformed(evt);
            }
        });

        BUIDARButton1.setText("BUIDAR");
        BUIDARButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUIDARButton1ActionPerformed(evt);
            }
        });

        ENREREButton.setText("ENRERE");
        ENREREButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ENREREButtonActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nom empleat", "Cognom empleat", "DNI", "Atracció", "Data inauguració"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        }
    );
    jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            jTable1MouseClicked(evt);
        }
    });
    jScrollPane2.setViewportView(jTable1);

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(25, 25, 25)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane2)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addGap(459, 459, 459)
                    .addComponent(jLabel2)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(dataText, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                    .addComponent(MODIFICARButton, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(BUIDARButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(ENREREButton, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(22, 22, 22))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(buscarAssign, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(BUIDARButton)
                    .addGap(29, 29, 29)
                    .addComponent(CARREGARButton)
                    .addGap(28, 28, 28)
                    .addComponent(ELIMINARButton)
                    .addContainerGap())))
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel1)
            .addGap(493, 493, 493))
    );
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(12, 12, 12)
            .addComponent(jLabel1)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(buscarAssign, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(BUIDARButton)
                .addComponent(CARREGARButton)
                .addComponent(ELIMINARButton))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE)
            .addGap(18, 18, 18)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(BUIDARButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(MODIFICARButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(ENREREButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel2)
                .addComponent(dataText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap())
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        //Auxiliar.llistar_Assignacio(buscarAssign, JlistAssign);
        Auxiliar.llistar_assignacio_taula(buscarAssign, jTable1);
    }//GEN-LAST:event_formWindowOpened

    private void ENREREButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ENREREButtonActionPerformed
        this.setVisible(false);
        Menu_assignacio ma = new Menu_assignacio();
        ma.setVisible(true);
    }//GEN-LAST:event_ENREREButtonActionPerformed

    private void BUIDARButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUIDARButtonActionPerformed
        buscarAssign.setText("");
    }//GEN-LAST:event_BUIDARButtonActionPerformed

    private void CARREGARButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CARREGARButtonActionPerformed
        seleccio = Auxiliar.carregar_dades_assign_taula(CARREGARButton, seleccio, this, jTable1, dataText);
    }//GEN-LAST:event_CARREGARButtonActionPerformed

    private void BUIDARButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUIDARButton1ActionPerformed
        seleccio = -1;
        dataText.setText("");
    }//GEN-LAST:event_BUIDARButton1ActionPerformed

    private void MODIFICARButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MODIFICARButtonActionPerformed
        if (seleccio==-1){
                    JOptionPane.showMessageDialog(this, "Carrega una assignació per a modificar");
                }else {
                    try {
                        //String anticNom=Arrays.arrayPersones.get(seleccio).getNom();
                        Persona anticEmpleat = Arrays.arrayAssignacio.get(seleccio).getEmpleat();
                        Atraccio antigaAtraccio = Arrays.arrayAssignacio.get(seleccio).getAtraccio();
                        String AntigaData = Arrays.arrayAssignacio.get(seleccio).getData();
                        Arrays.arrayAssignacio.get(seleccio).setData(dataText.getText());
                        Auxiliar.llistar_assignacio_taula(buscarAssign, jTable1);
                        JOptionPane.showMessageDialog(this, "Assignació " + Arrays.arrayAssignacio.get(seleccio).getEmpleat().getDNI()  + " --> " + Arrays.arrayAssignacio.get(seleccio).getAtraccio().getNom() +" modificada correctament");
                        Auxiliar.log("Assignacio modificada: " + anticEmpleat.getNom() + " | " + anticEmpleat.getCognom1() + " | " + anticEmpleat.getDNI() + " | " + antigaAtraccio.getNom() + " | " + AntigaData + "\nA: " + Arrays.arrayAssignacio.get(seleccio).getEmpleat().getNom() + " | " + Arrays.arrayAssignacio.get(seleccio).getEmpleat().getCognom1() + " | " + Arrays.arrayAssignacio.get(seleccio).getEmpleat().getDNI() + " | " + Arrays.arrayAssignacio.get(seleccio).getAtraccio().getNom() + " | " + Arrays.arrayAssignacio.get(seleccio).getData());
                    } catch (Exception error) {
                        IO.imprimirTI("Error al modificar: " + error);
                        Auxiliar.logError("Error al modificar una assignacio: " + error);
                    }
                }
        /*if (seleccio==-1){
                    JOptionPane.showMessageDialog(this, "Carrega una assignacio per a modificar");
                }else {
                    try {
                        Arrays.arrayAssignacio.get(seleccio).setData(dataText.getText());
                        JOptionPane.showMessageDialog(this, "Assignacio modificada correctament");
                        Auxiliar.llistar_empleats(buscarAssign, JlistAssign);
                    } catch (Exception error) {
                        IO.imprimirTI("Error al modificar una assignacio: " + error);
                    }
                }*/
    }//GEN-LAST:event_MODIFICARButtonActionPerformed

    private void ELIMINARButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ELIMINARButtonActionPerformed
        int elements [] = null;
                int dialogResult = -1;
                try{
                    elements = jTable1.getSelectedRows();
                    int dialogButton = JOptionPane.YES_NO_OPTION;
                    dialogResult = JOptionPane.showConfirmDialog(null, "Estas segur de que vols eliminar la assignació " + Arrays.arrayAssignacio.get(elements[0]).getEmpleat().getDNI()  + " --> " + Arrays.arrayAssignacio.get(elements[0]).getAtraccio().getNom() + "?", "CONFIRMACIO", dialogButton);
                    //IO.imprimirTI("Element eliminar: " + ((Empleat) Arrays.arrayPersones.get(elements[0])).getNom());
                }catch (Exception error){
                    JOptionPane.showMessageDialog(this, "Selecciona una assignació");
                }
                    if(dialogResult == 0) {
                        try{
                            //Auxiliar.log("Empleat eliminat: " + ((Empleat) Arrays.arrayPersones.get(elements[0])).getNom() + " " + ((Empleat) Arrays.arrayPersones.get(elements[0])).getDNI());
                            Auxiliar.log("Assignacio eliminada: " + Arrays.arrayAssignacio.get(elements[0]).getEmpleat().getNom() + " | " + Arrays.arrayAssignacio.get(elements[0]).getEmpleat().getCognom1()  + " | " + Arrays.arrayAssignacio.get(elements[0]).getEmpleat().getDNI() + " | " + Arrays.arrayAssignacio.get(elements[0]).getData() + " --> " + Arrays.arrayAssignacio.get(elements[0]).getAtraccio().getNom());
                            Arrays.arrayAssignacio.get(elements[0]).getEmpleat().eliminarAssign();
                            Arrays.arrayAssignacio.get(elements[0]).getAtraccio().eliminarAssign();
                            Arrays.arrayAssignacio.remove(elements[0]);
                            seleccio = -1;
                            dataText.setText("");
                            Auxiliar.llistar_assignacio_taula(buscarAssign, jTable1);
                        }catch (Exception e){
                            IO.imprimirTI("Error al eliminar: " + e);
                            Auxiliar.logError("Error al eliminar una assignacio: " + e);
                        }
                        
                    }
                 Auxiliar.llistar_assignacio_taula(buscarAssign, jTable1);
        /*Object seleccio_eliminar=JlistAssign.getSelectedValue();
                if (seleccio_eliminar==null){
                    JOptionPane.showMessageDialog(this, "No hi ha cap assignacio seleccionada");
                }else {
                    try {
                        Arrays.arrayAssignacio.remove(seleccio_eliminar);
                        JOptionPane.showMessageDialog(this, "Assignacio eliminada correctament");
                        Auxiliar.llistar_empleats(buscarAssign, JlistAssign);
                        seleccio = -1;
                        dataText.setText("");
                    } catch (Exception error) {
                        IO.imprimirTI("Error al eliminar una assignacio: " + error);
                    }
                }*/
    }//GEN-LAST:event_ELIMINARButtonActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        if(evt.getClickCount()==2 && evt.getButton() == MouseEvent.BUTTON1){
            seleccio = Auxiliar.carregar_dades_assign_taula(CARREGARButton, seleccio, this, jTable1, dataText);
        }
    }//GEN-LAST:event_jTable1MouseClicked

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
            java.util.logging.Logger.getLogger(Gestio_assignacio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gestio_assignacio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gestio_assignacio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gestio_assignacio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gestio_assignacio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BUIDARButton;
    private javax.swing.JButton BUIDARButton1;
    private javax.swing.JButton CARREGARButton;
    private javax.swing.JButton ELIMINARButton;
    private javax.swing.JButton ENREREButton;
    private javax.swing.JButton MODIFICARButton;
    private javax.swing.JTextField buscarAssign;
    private javax.swing.JTextField dataText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
