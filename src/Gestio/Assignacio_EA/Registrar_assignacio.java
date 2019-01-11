/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestio.Assignacio_EA;
import Biblioteques.Arrays;
import Biblioteques.Auxiliar;
import Biblioteques.IO;
import Classes.Assignacio;
import Classes.Atraccio;
import Classes.Empleat;
import static Main.config.carregarConf;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
/**
 *
 * @author Usuari
 */
public class Registrar_assignacio extends javax.swing.JFrame {
    int seleccio_empleat = -1;
    int seleccio_atraccio = -1;
    /**
     * Creates new form Registrar_assignacio
     */
    public Registrar_assignacio() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Registrar assignacio");
        try{
            jPanel1.setBackground(Color.decode(Main.config.carregarConf()[0]));
        }catch (Exception e){
            IO.imprimirTI("Error al asignar color: " + e);
        }
        try{
            Component[] components1=getContentPane().getComponents();
            Main.config.setUIFont(new Font(carregarConf()[1], Integer.valueOf(carregarConf()[2]), Integer.valueOf(carregarConf()[3])), components1);            
        }catch(Exception e){
            IO.imprimirTI("Error al carregar la font: " + e);
        }
        buscarEmpleats.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                Auxiliar.llistar_empleats_taula(buscarEmpleats, jTable1);
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                Auxiliar.llistar_empleats_taula(buscarEmpleats, jTable1);
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
              Auxiliar.llistar_empleats_taula(buscarEmpleats, jTable1);
            }
        });
        buscarAtraccions.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                Auxiliar.llistar_atraccions_taula(buscarAtraccions, jTable2);
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                Auxiliar.llistar_atraccions_taula(buscarAtraccions, jTable2);
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                Auxiliar.llistar_atraccions_taula(buscarAtraccions, jTable2);
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
        jLabel2 = new javax.swing.JLabel();
        buscarEmpleats = new javax.swing.JTextField();
        seleccionarEmpleat = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        buscarAtraccions = new javax.swing.JTextField();
        seleccionarAtraccio = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        dataText = new javax.swing.JTextField();
        assignarButton = new javax.swing.JButton();
        cancelarButton = new javax.swing.JButton();
        empleatSeleccionat = new javax.swing.JLabel();
        atraccioSeleccionada = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        data2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("REGISTRAR ASSIGINACIÓ");

        jLabel2.setText("Empleats");

        buscarEmpleats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarEmpleatsActionPerformed(evt);
            }
        });

        seleccionarEmpleat.setText("Seleccionar");
        seleccionarEmpleat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleccionarEmpleatActionPerformed(evt);
            }
        });

        jLabel3.setText("Atraccions");

        seleccionarAtraccio.setText("Seleccionar");
        seleccionarAtraccio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleccionarAtraccioActionPerformed(evt);
            }
        });

        jLabel4.setText("Data inici:");

        assignarButton.setText("Assignar");
        assignarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignarButtonActionPerformed(evt);
            }
        });

        cancelarButton.setText("Cancelar");
        cancelarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarButtonActionPerformed(evt);
            }
        });

        empleatSeleccionat.setText("  ");

        atraccioSeleccionada.setText("  ");

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
        }
    );
    jScrollPane3.setViewportView(jTable1);

    jTable2.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {

        },
        new String [] {
            "ID", "Nom", "Tipus", "Data Innauguracio", "Altura Min", "Accessibilitat", "Express"
        }
    ) {
        boolean[] canEdit = new boolean [] {
            false, false, false, false, false, false, false
        };

        public boolean isCellEditable(int rowIndex, int columnIndex) {
            return canEdit [columnIndex];
        }
    }
    );
    jScrollPane1.setViewportView(jTable2);

    jLabel5.setText("Data fi: ");

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel4)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(dataText, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(45, 45, 45)
            .addComponent(jLabel5)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(data2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(assignarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(26, 26, 26)
            .addComponent(cancelarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(19, 19, 19))
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane3)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(buscarAtraccions, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(seleccionarAtraccio, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(atraccioSeleccionada, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(buscarEmpleats, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(seleccionarEmpleat, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(empleatSeleccionat, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addContainerGap())
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(604, 604, 604)
            .addComponent(jLabel1)
            .addContainerGap(673, Short.MAX_VALUE))
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jScrollPane1)
            .addContainerGap())
    );
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(14, 14, 14)
            .addComponent(jLabel1)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jLabel2)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(buscarEmpleats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(seleccionarEmpleat, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(empleatSeleccionat))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jLabel3)
            .addGap(1, 1, 1)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(buscarAtraccions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(seleccionarAtraccio, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(atraccioSeleccionada))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(assignarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(cancelarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(dataText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(data2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addContainerGap())
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addContainerGap())
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        //Auxiliar.llistar_Atraccions(buscarAtraccions, llistaAtraccions);
        //Auxiliar.llistar_empleats(buscarEmpleats, llistaEmpleats);
        Auxiliar.llistar_empleats_taula(buscarEmpleats, jTable1);
        Auxiliar.llistar_atraccions_taula(buscarEmpleats, jTable2);
    }//GEN-LAST:event_formWindowOpened

    private void cancelarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarButtonActionPerformed
        this.setVisible(false);
        Menu_assignacio menuAS = new Menu_assignacio();
        menuAS.setVisible(true);
    }//GEN-LAST:event_cancelarButtonActionPerformed

    private void assignarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignarButtonActionPerformed
        if (seleccio_empleat==-1 || seleccio_atraccio==-1 || dataText.toString().isEmpty()){
            JOptionPane.showMessageDialog(this, "Error: Hi ha algun camp per a omplir");
            IO.imprimirTI("Se ha intentat registrar una assignacio en algun camp buit: " + seleccio_empleat + " | " +seleccio_atraccio);
        }else {
            try {
                Arrays.arrayAssignacio.add(new Assignacio((Empleat) Arrays.arrayPersones.get(seleccio_empleat), Atraccio.arrayAtraccio.get(seleccio_atraccio), dataText.getText(), data2.getText()));
                ((Empleat)Arrays.arrayPersones.get(seleccio_empleat)).setAssignat();
                Atraccio.arrayAtraccio.get(seleccio_atraccio).setAssignat();
                IO.imprimirTI("empleat: " + ((Empleat)Arrays.arrayPersones.get(seleccio_empleat)).toString());
                IO.imprimirTI("Size: " + Arrays.arrayAssignacio.size());
                IO.imprimirTI(Arrays.arrayAssignacio.get(Arrays.arrayAssignacio.size()-1).toString());
                IO.imprimirTI("Se ha registrat una assignacio");
                Auxiliar.log("Assignació registrada: " + Arrays.arrayAssignacio.get(Arrays.arrayAssignacio.size()-1).getEmpleat().getNom() + " " + Arrays.arrayAssignacio.get(Arrays.arrayAssignacio.size()-1).getEmpleat().getCognom1() + " " + Arrays.arrayAssignacio.get(Arrays.arrayAssignacio.size()-1).getEmpleat().getDNI() + " " + Arrays.arrayAssignacio.get(Arrays.arrayAssignacio.size()-1).getAtraccio().getNom() + " " + Arrays.arrayAssignacio.get(Arrays.arrayAssignacio.size()-1).getDataInici() + " | " + Arrays.arrayAssignacio.get(Arrays.arrayAssignacio.size()-1).getDataFi() + " | " + Arrays.arrayAssignacio.get(Arrays.arrayAssignacio.size()-1).getDataCreacioRegistre());
                JOptionPane.showMessageDialog(this, "Assignacio creada correctament");
                seleccio_empleat = -1;
                seleccio_atraccio = -1;
                dataText.setText("");
                empleatSeleccionat.setText("");
                atraccioSeleccionada.setText("");
            }catch (Exception error){
                IO.imprimirTI("Error al assignar: " + error);
                Auxiliar.logError("Error al registrar una assignacio: " + error);
            }
        }
    }//GEN-LAST:event_assignarButtonActionPerformed

    private void seleccionarAtraccioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seleccionarAtraccioActionPerformed
        Object elementmodificat = null;
        try{
            elementmodificat = jTable2.getValueAt(jTable2.getSelectedRow(), 0);
        }catch (Exception e){
            IO.imprimirTI("Error seleccio null");
            Auxiliar.logError("Error al seleccionar una atraccio en assignacio: " + e);
        }
        if (elementmodificat == null){
            JOptionPane.showMessageDialog(this, "Selecciona una atraccio");
        }else{
            String element = (String)elementmodificat;
            IO.imprimirTI("Seleccio: " + element);
            seleccio_atraccio = -1;
            boolean trobat = false;
            for (int i = 0; i<Atraccio.arrayAtraccio.size() && trobat == false; i++){
                try{
                    if(element.equals(Atraccio.arrayAtraccio.get(i).getIdA())){
                    seleccio_atraccio = i;
                    trobat = true;
                }
                }catch(Exception e){
                    IO.imprimirTI("Error: " + e);
                    Auxiliar.logError("Error al buscar la atraccio a seleccionar en registre_assignacio: " + e);
                }

            }
            if (seleccio_atraccio ==-1) JOptionPane.showMessageDialog(null, "No s'ha pogut seleccionar");
            else {
                try{
                    atraccioSeleccionada.setText("Atracció seleccionada: " + Atraccio.arrayAtraccio.get(seleccio_atraccio).getNom());
                }catch (Exception error){
                    IO.imprimirTI("Error al seleccionar empleat assignacio: " + error);
                    Auxiliar.logError("Error al mostrar la atraccio seleccionada en registrar_assignacio: " + error);
                }
                
            }
            }
    }//GEN-LAST:event_seleccionarAtraccioActionPerformed

    private void seleccionarEmpleatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seleccionarEmpleatActionPerformed
        Object elementmodificat = null;
        try{
            elementmodificat = jTable1.getValueAt(jTable1.getSelectedRow(), 0);
        }catch (Exception e){
            IO.imprimirTI("Error seleccio null");
            Auxiliar.logError("Error al seleccionar un empleat en assignacio: " + e);
        }
        if (elementmodificat == null){
            JOptionPane.showMessageDialog(this, "Selecciona un empleat");
        }else{
            int element = (int)elementmodificat;
            IO.imprimirTI("Seleccio: " + element);
            seleccio_empleat = -1;
            boolean trobat = false;
            for (int i = 0; i<Arrays.arrayPersones.size() && trobat == false; i++){
                try{
                    if(element == Arrays.arrayPersones.get(i).getId()){
                    seleccio_empleat = i;
                    trobat = true;
                }
                }catch(Exception e){
                    IO.imprimirTI("Error: " + e);
                    Auxiliar.logError("Error al buscar el empleat a seleccionar en registre_assignacio: " + e);
                }

            }
            if (seleccio_empleat ==-1) JOptionPane.showMessageDialog(null, "No s'ha pogut seleccionar");
            else {
                try{
                    empleatSeleccionat.setText("Empleat seleccionat: " + Arrays.arrayPersones.get(seleccio_empleat).getNom());
                }catch (Exception error){
                    Auxiliar.logError("Error al mostrar el empleat seleccionat en registrar_assignacio: " + error);
                }
                
            }
            }
    }//GEN-LAST:event_seleccionarEmpleatActionPerformed

    private void buscarEmpleatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarEmpleatsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscarEmpleatsActionPerformed

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
            java.util.logging.Logger.getLogger(Registrar_assignacio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registrar_assignacio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registrar_assignacio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registrar_assignacio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registrar_assignacio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignarButton;
    private javax.swing.JLabel atraccioSeleccionada;
    private javax.swing.JTextField buscarAtraccions;
    private javax.swing.JTextField buscarEmpleats;
    private javax.swing.JButton cancelarButton;
    private javax.swing.JTextField data2;
    private javax.swing.JTextField dataText;
    private javax.swing.JLabel empleatSeleccionat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JButton seleccionarAtraccio;
    private javax.swing.JButton seleccionarEmpleat;
    // End of variables declaration//GEN-END:variables
}
