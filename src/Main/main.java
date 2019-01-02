/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;
import Biblioteques.Arrays;
import Classes.Assignacio;
import Classes.Atraccio;
import Gestio.Atraccions.MenuAtraccioForm;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author Usuari
 */
public class main extends javax.swing.JFrame {

    /**
     * Creates new form main
     */
    public main() {
        initComponents();
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
        GESTIOEMPLEATSButton = new javax.swing.JButton();
        GESTIOZONESButton = new javax.swing.JButton();
        GESTIOASIGGNACIONSButton = new javax.swing.JButton();
        SORTIRButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("MENÚ PRINCIPAL");

        GESTIOEMPLEATSButton.setText("GESTIÓ EMPLEATS");
        GESTIOEMPLEATSButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GESTIOEMPLEATSButtonActionPerformed(evt);
            }
        });

        GESTIOZONESButton.setText("GESTIÓ ATRACCIONS");
        GESTIOZONESButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GESTIOZONESButtonActionPerformed(evt);
            }
        });

        GESTIOASIGGNACIONSButton.setText("GESTIÓ ASSIGNACIONS");
        GESTIOASIGGNACIONSButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GESTIOASIGGNACIONSButtonActionPerformed(evt);
            }
        });

        SORTIRButton.setText("SORTIR");
        SORTIRButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SORTIRButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(SORTIRButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(GESTIOASIGGNACIONSButton)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(GESTIOEMPLEATSButton)
                                .addComponent(GESTIOZONESButton)))))
                .addContainerGap(121, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(GESTIOEMPLEATSButton)
                .addGap(18, 18, 18)
                .addComponent(GESTIOZONESButton)
                .addGap(18, 18, 18)
                .addComponent(GESTIOASIGGNACIONSButton)
                .addGap(18, 18, 18)
                .addComponent(SORTIRButton)
                .addContainerGap(111, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GESTIOEMPLEATSButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GESTIOEMPLEATSButtonActionPerformed
        this.setVisible(false);
        Gestio.Empleats.Menu_empleats e = new Gestio.Empleats.Menu_empleats();
        e.setVisible(true);
    }//GEN-LAST:event_GESTIOEMPLEATSButtonActionPerformed

    private void GESTIOZONESButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GESTIOZONESButtonActionPerformed
        this.setVisible(false);
        Gestio.Atraccions.MenuAtraccioForm a = new Gestio.Atraccions.MenuAtraccioForm();
        a.setVisible(true);
    }//GEN-LAST:event_GESTIOZONESButtonActionPerformed

    private void GESTIOASIGGNACIONSButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GESTIOASIGGNACIONSButtonActionPerformed
        if (Arrays.arrayPersones.isEmpty() || Atraccio.arrayAtraccio.isEmpty()){
                    JOptionPane.showMessageDialog(this, "No es poden registrar assignacions sense empleats o atraccions");
                }else {
                    this.setVisible(false);
                    Gestio.Assignacio_EA.Menu_assignacio assign = new Gestio.Assignacio_EA.Menu_assignacio();
                    assign.setVisible(true);
        }
    }//GEN-LAST:event_GESTIOASIGGNACIONSButtonActionPerformed

    private void SORTIRButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SORTIRButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_SORTIRButtonActionPerformed

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
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton GESTIOASIGGNACIONSButton;
    private javax.swing.JButton GESTIOEMPLEATSButton;
    private javax.swing.JButton GESTIOZONESButton;
    private javax.swing.JButton SORTIRButton;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
