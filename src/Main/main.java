/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;
import Biblioteques.Arrays;
import Biblioteques.IO;
import Classes.Assignacio;
import Classes.Atraccio;
import Classes.Empleat;
import Classes.Persona;
import Gestio.Atraccions.MenuAtraccioForm;
import static Main.config.carregarConf;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
/**
 *
 * @author Usuari
 */
public class main extends javax.swing.JFrame {
    public final int TEST = 100;
    /**
     * Creates new form main
     */
    public main() {
        initComponents();
        setLocationRelativeTo(null);
        //getContentPane().setBackground(Color.RED);
        setTitle("Menu principal");
        try{
            getContentPane().setBackground(Color.decode(Main.config.carregarConf()[0]));
        }catch (Exception e){
            IO.imprimirTI("Error al asignar color: " + e);
        }
        try{
            
            Component[] components1=getContentPane().getComponents();
            Main.config.setUIFont(new Font(carregarConf()[1], Integer.valueOf(carregarConf()[2]), Integer.valueOf(carregarConf()[3])), components1);            
        }catch(Exception e){
            IO.imprimirTI("Error al carregar la font: " + e);
        }
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
        TESTButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MENÚ PRINCIPAL");
        jLabel1.setToolTipText("");

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

        TESTButton.setText("TEST");
        TESTButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TESTButtonActionPerformed(evt);
            }
        });

        jButton1.setText("CONFIGURACIO");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(191, 191, 191)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(144, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                    .addComponent(TESTButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SORTIRButton, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                    .addComponent(GESTIOASIGGNACIONSButton, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                    .addComponent(GESTIOZONESButton, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                    .addComponent(GESTIOEMPLEATSButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(132, 132, 132))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addComponent(GESTIOEMPLEATSButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(GESTIOZONESButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(GESTIOASIGGNACIONSButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TESTButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(SORTIRButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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
        System.exit(0);
    }//GEN-LAST:event_SORTIRButtonActionPerformed

    private void TESTButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TESTButtonActionPerformed
        Random rand = new Random(); 
        for (int i=0; i<TEST;i++){
                   int data1 = rand.nextInt((31 - 1) + 1) + 1;
                   int data2 = rand.nextInt((12 - 1) + 1) + 1;
                   int data3 = rand.nextInt((3000 - 1000) + 1) + 1;
                    Atraccio.arrayAtraccio.add(new Atraccio("NomAtraccio"+(i+1),"TipusAtraccio"+(i+1),String.valueOf(data1) + "/" + String.valueOf(data2) + "/" + String.valueOf(data3),"AlturaMinima"+(i+1),"Accessibilitat"+(i+1),"Express"+(i+1)));       
                }
        for (int i=0; i<TEST;i++){
                    Arrays.arrayPersones.add(new Empleat("nom"+(i+1), "cognom"+(i+1),"dni"+(i+1),"nomina"+(i+1)));
                }
                JOptionPane.showMessageDialog(this, "Elements de prova carregats correctament");
                
        for (int i=0; i<(TEST-50);i++){
            int data1 = rand.nextInt((31 - 1) + 1) + 1;
            int data2 = rand.nextInt((12 - 1) + 1) + 1;
            int data3 = rand.nextInt((3000 - 1000) + 1) + 1;
            Arrays.arrayAssignacio.add(new Assignacio((Empleat) Arrays.arrayPersones.get(i), Atraccio.arrayAtraccio.get(i), String.valueOf(data1) + "/" + String.valueOf(data2) + "/" + String.valueOf(data3)));
            ((Empleat)Arrays.arrayPersones.get(i)).setAssignat();
            Atraccio.arrayAtraccio.get(i).setAssignat();
        }
    }//GEN-LAST:event_TESTButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        config conf = new config();
        conf.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
    private javax.swing.JButton TESTButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
