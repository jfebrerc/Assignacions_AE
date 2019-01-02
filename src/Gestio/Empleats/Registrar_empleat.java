/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestio.Empleats;
import Biblioteques.Arrays;
import Biblioteques.IO;
import Classes.Empleat;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Biblioteques.Auxiliar;
/**
 *
 * @author Usuari
 */
public class Registrar_empleat extends javax.swing.JFrame {

    /**
     * Creates new form Registrar_empleat
     */
    public Registrar_empleat() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Registrar empleats");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nomText = new javax.swing.JTextField();
        cognomnsText = new javax.swing.JTextField();
        dniText = new javax.swing.JTextField();
        nominaText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        REGISTRARButton = new javax.swing.JButton();
        buidarButton = new javax.swing.JButton();
        ENREREButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("ALTA EMPLEATS");

        jLabel2.setText("Nom");

        jLabel4.setText("DNI");

        jLabel5.setText("Nomina");

        nomText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomTextActionPerformed(evt);
            }
        });

        jLabel3.setText("Cognoms");

        REGISTRARButton.setText("REGISTRAR");
        REGISTRARButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REGISTRARButtonActionPerformed(evt);
            }
        });

        buidarButton.setText("BUIDAR");
        buidarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buidarButtonActionPerformed(evt);
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
                .addGap(0, 55, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(240, 240, 240))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(63, 63, 63)
                                        .addComponent(nominaText))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(54, 54, 54)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(cognomnsText, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(nomText, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(dniText, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(10, 10, 10))
                            .addComponent(REGISTRARButton, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buidarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ENREREButton, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel2))
                    .addComponent(nomText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cognomnsText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(dniText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(nominaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ENREREButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buidarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(REGISTRARButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nomTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomTextActionPerformed

    private void REGISTRARButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REGISTRARButtonActionPerformed
        if (nomText.getText().isEmpty() || cognomnsText.getText().isEmpty() || dniText.getText().isEmpty() || nominaText.getText().isEmpty()){
                    JOptionPane.showMessageDialog(this, "Error: Hi ha algun camp per a omplir");
                    IO.imprimirTI("Se ha intentat registrar un empleat en algun camp buit");
                }else {
                    try {
                        Arrays.arrayPersones.add(new Empleat(nomText.getText(), cognomnsText.getText(),dniText.getText(),nominaText.getText()));
                        IO.imprimirTI(((Empleat) Arrays.arrayPersones.get(Arrays.arrayPersones.size()-1)).toString());
                        IO.imprimirTI("Se ha registrat un empleat");
                        JOptionPane.showMessageDialog(this, "Se ha donat de alta correctament a " + ((Empleat) Arrays.arrayPersones.get(Arrays.arrayPersones.size()-1)).getNom());
                        Auxiliar.log("Empleat registrat: " + ((Empleat) Arrays.arrayPersones.get(Arrays.arrayPersones.size()-1)).getNom() + " " + ((Empleat) Arrays.arrayPersones.get(Arrays.arrayPersones.size()-1)).getDNI());
                        this.setVisible(false);
                        Menu_empleats menuE = new Menu_empleats();
                        menuE.setVisible(true);
                        IO.imprimirTI("-------------------------------------------------------------------------");
                    } catch (Exception error) {
                        IO.imprimirTI("Error: "+error);
                    }
                }
    }//GEN-LAST:event_REGISTRARButtonActionPerformed

    private void ENREREButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ENREREButtonActionPerformed
        this.setVisible(false);
        Menu_empleats menuE = new Menu_empleats();
        menuE.setVisible(true);
    }//GEN-LAST:event_ENREREButtonActionPerformed

    private void buidarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buidarButtonActionPerformed
        nomText.setText("");
        cognomnsText.setText("");
        dniText.setText("");
        nominaText.setText("");
    }//GEN-LAST:event_buidarButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Registrar_empleat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registrar_empleat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registrar_empleat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registrar_empleat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registrar_empleat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ENREREButton;
    private javax.swing.JButton REGISTRARButton;
    private javax.swing.JButton buidarButton;
    private javax.swing.JTextField cognomnsText;
    private javax.swing.JTextField dniText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField nomText;
    private javax.swing.JTextField nominaText;
    // End of variables declaration//GEN-END:variables
}
