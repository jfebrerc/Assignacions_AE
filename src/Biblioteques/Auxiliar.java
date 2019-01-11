/**
 * <h1>Auxiliar</h1>
 * Clase on es guarden les diferents funcions auxiliars que se utilitzen en diferents parts del programa
 * <p>
 *
 *
 * @author  Jose Febrer
 * @version 1.0
 * @since   2018-11-27
 */

package Biblioteques;

import Classes.Assignacio;
import Classes.Atraccio;
import Classes.Empleat;
import Classes.Persona;

import javax.swing.*;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.TimeZone;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;


public class Auxiliar {
    public static String path = "E:\\Carpetes\\Desktop\\";
    /** FUNCIO PER A LLISTAR ELS EMPLEATS */
    public static void llistar_empleats(JTextField textBusqueda, JList llistaEmpleats){
        String cerca = textBusqueda.getText();
        DefaultListModel d1m = new DefaultListModel();
        String titol_columna = String.format("%s %18s %71s %69s %71s", "ID", "NOM", "COGNOM", "DNI", "NOMINA");
        String divisor = "------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------";
        d1m.addElement(titol_columna);
        d1m.addElement(divisor);
        Iterator<Persona> iteradorPersones = Arrays.arrayPersones.iterator();
        while (iteradorPersones.hasNext()){
            Persona p = iteradorPersones.next();
            if (p instanceof Empleat && p.toString().toLowerCase().contains(cerca.toLowerCase())){
                d1m.addElement(p);
            }
        }
        llistaEmpleats.setModel(d1m);
    }
    public static void llistar_empleats_taula(JTextField textBusqueda, JTable jTable1){
        try{
            String cercaUsuari = textBusqueda.getText().toLowerCase();
            boolean trobat = false;
            DefaultTableModel tabla = (DefaultTableModel) jTable1.getModel();
            tabla.setRowCount (0);
            Iterator<Persona> iteradorPersones = Arrays.arrayPersones.iterator();
            while(iteradorPersones.hasNext()){
                Persona p = iteradorPersones.next();
                String persona_cerca = p.toString().toLowerCase();
                if (p instanceof Empleat && persona_cerca.indexOf(cercaUsuari) != -1){
                    tabla.addRow(new Object[] {p.getId(),p.getNom(),p.getCognom1(),p.getDNI(),((Empleat)p).getNomina()});
                    trobat = true;
                }
            }
        }catch (Exception e){
            logError("Error al llistar llistar empleats en jTable: " + e);
        }
        
    }
    
    public static void llistar_atraccions_taula(JTextField textBusqueda, JTable jTable2){
        try{
            String cercaUsuari = textBusqueda.getText().toLowerCase();
            boolean trobat = false;
            DefaultTableModel tabla = (DefaultTableModel) jTable2.getModel();
            tabla.setRowCount (0);
            Iterator<Atraccio> iteradorModificar = Atraccio.arrayAtraccio.iterator();
            while(iteradorModificar.hasNext()){
                Atraccio atraccio_aux = iteradorModificar.next();
                String atraccio_final = atraccio_aux.toString().toLowerCase();
                if (atraccio_final.indexOf(cercaUsuari) != -1){
                    tabla.addRow(new Object[] {atraccio_aux.getIdA(),atraccio_aux.getNom(),atraccio_aux.getTipusAtraccio(),atraccio_aux.getDataInauguracio(),atraccio_aux.getAlturaMin(),atraccio_aux.getAccessibilitat(),atraccio_aux.getAccesExpress()});
                    trobat = true;
                }
            }
        }catch (Exception e){
            logError("Error al llistar llistar atraccions en jTable: " + e);
        }
        
    }

    /**FUNCIO PER A CARREGAR DADES ALS DIFERENTS CAMPS DE TEXT PER A MODIFICAR-LES*/
    public static int carregar_dades_empleats(JList llistaEmpleats, JFrame frame_llistaEmpleats, JTextField nomText, JTextField cognomsText, JTextField dniText, JTextField nominaText, int seleccio){
        Object indices2=llistaEmpleats.getSelectedValue();  //Es guarda la seleccio en un objecte
        IO.imprimirTI("Contingut: "+ (indices2));
        if (indices2 == null){  //Es comprova si hi ha algo seleccionat
            JOptionPane.showMessageDialog(frame_llistaEmpleats, "Selecciona un empleat");
        }else {
            try { //Si hi ha algo seleccionat, se intenten carregar les dades als diferents camps de text
                nomText.setText(Arrays.arrayPersones.get(Arrays.arrayPersones.indexOf(indices2)).getNom());
                cognomsText.setText(Arrays.arrayPersones.get(Arrays.arrayPersones.indexOf(indices2)).getCognom1());
                dniText.setText(Arrays.arrayPersones.get(Arrays.arrayPersones.indexOf(indices2)).getDNI());
                nominaText.setText(((Empleat)Arrays.arrayPersones.get(Arrays.arrayPersones.indexOf(indices2))).getNomina());
                seleccio = Arrays.arrayPersones.indexOf(indices2);
                IO.imprimirTI("Element seleccionat: " + seleccio);
            } catch (Exception error) { //Si retorna algun tipus de error, elimina qualsevol tipus de seleccio activa i buida 
                IO.imprimirTI("Error al carregar empleat: " + error);
                JOptionPane.showMessageDialog(frame_llistaEmpleats, "Selecciona un empleat");
                seleccio = -1;
                nomText.setText("");
                cognomsText.setText("");
                dniText.setText("");
                nominaText.setText("");
                Auxiliar.log("Error al carregar empleat: " + error);
            }
        }
        return seleccio;
    }
    public static int carregar_dades_empleats_taula(JButton carregar, int seleccio, JFrame frame, JTable jTable1, JTextField nomText, JTextField cognomsText, JTextField dniText, JTextField nominaText){
        Object elementmodificat = null;
        try{
            elementmodificat = jTable1.getValueAt(jTable1.getSelectedRow(), 0);
        }catch (Exception e){
            IO.imprimirTI("Error seleccio null");
        }
        if (elementmodificat == null){
            JOptionPane.showMessageDialog(frame, "Selecciona un empleat");
        }else{
            int element = (int)elementmodificat;
            IO.imprimirTI("Seleccio: " + element);
            seleccio = -1;
            boolean trobat = false;
            for (int i = 0; i<Arrays.arrayPersones.size() && trobat == false; i++){
                try{
                    if(element == Arrays.arrayPersones.get(i).getId()){
                    seleccio = i;
                    trobat = true;
                    IO.imprimirT("Seleccio: " + seleccio);
                }
                }catch(Exception e){
                    IO.imprimirTI("Error: " + e);
                    logError("Error al seleccionar un empleat a carregar: " + e);
                }

            }
            if (seleccio ==-1) JOptionPane.showMessageDialog(null, "No s'ha pogut seleccionar");
            else {
                try{
                    nomText.setText(Arrays.arrayPersones.get(seleccio).getNom());
                    cognomsText.setText(Arrays.arrayPersones.get(seleccio).getCognom1());
                    dniText.setText(Arrays.arrayPersones.get(seleccio).getDNI());
                    nominaText.setText(((Empleat)Arrays.arrayPersones.get(seleccio)).getNomina());
                }catch (Exception e){
                    logError("Error al carrgar les dades de un empleat: " + e);
                }
            
            }
          }

        return seleccio;
    }
    public static void llistar_Atraccions(JTextField textBusqueda, JList llistaAtraccions){
        String cerca = textBusqueda.getText();
        DefaultListModel d1m = new DefaultListModel();
        String titol_columna = String.format("%s %30s %35s %30s %30s %30s %30s", "ID", "NOM", "TIPUS", "DATA INAUGURACIO", "ALTURA MIN", "ACCESSIBILITAT", "ACCES EXPRESS");
        String divisor = "------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------";
        d1m.addElement(titol_columna);
        d1m.addElement(divisor);
        Iterator<Atraccio> iteradorAtraccions = Atraccio.arrayAtraccio.iterator();
        while (iteradorAtraccions.hasNext()){
            Atraccio a = iteradorAtraccions.next();
            if (a.toString().toLowerCase().contains(cerca.toLowerCase())){
                d1m.addElement(a);
            }
        }
        llistaAtraccions.setModel(d1m);
    }

    public static void llistar_Assignacio(JTextField textBusqueda, JList llistaAtraccions){
        String cerca = textBusqueda.getText();
        DefaultListModel d1m = new DefaultListModel();
        String titol_columna = String.format("%s %18s %71s %69s", "ID", "EMPLEAT", "ATRACCIO", "DATA");
        String divisor = "------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------";
        d1m.addElement(titol_columna);
        d1m.addElement(divisor);
        Iterator<Assignacio> iteradorAssignacions = Arrays.arrayAssignacio.iterator();
        while (iteradorAssignacions.hasNext()){
            Assignacio assign = iteradorAssignacions.next();
            if (assign.toString().toLowerCase().contains(cerca.toLowerCase())){
                d1m.addElement(assign);
            }
        }
        llistaAtraccions.setModel(d1m);
    }
    public static void llistar_assignacio_taula(JTextField textBusqueda, JTable jTable1){
        
        try{
            String cercaUsuari = textBusqueda.getText().toLowerCase();
            boolean trobat = false;
            DefaultTableModel tabla = (DefaultTableModel) jTable1.getModel();
            tabla.setRowCount (0);
            Iterator<Assignacio> iteratorAssign = Arrays.arrayAssignacio.iterator();
            while(iteratorAssign.hasNext()){
                Assignacio assign_aux = iteratorAssign.next();
                String assignacio_busqueda = assign_aux.toString().toLowerCase();
                if (assignacio_busqueda.indexOf(cercaUsuari) != -1){
                    tabla.addRow(new Object[] {assign_aux.getId(),assign_aux.getEmpleat().getNom(),assign_aux.getEmpleat().getCognom1(),assign_aux.getEmpleat().getDNI(),assign_aux.getAtraccio().getNom(),assign_aux.getData()});
                    trobat = true;
                }
            }
        }catch (Exception e){
            logError("Error al llistar llistar assignacions en jTable: " + e);
        }        
    }
    
    public static int carregar_dades_assign_taula(JButton carregar, int seleccio, JFrame frame, JTable jTable1, JTextField dataText){
        //int elements [];
        //frame.getContentPane().add(carregar);
        //elements = jTable1.getSelectedRows();
        Object elementmodificat = null;
        try{
            elementmodificat = jTable1.getValueAt(jTable1.getSelectedRow(), 0);
        }catch (Exception e){
            IO.imprimirTI("Error seleccio null");
        }
        if (elementmodificat == null){
            JOptionPane.showMessageDialog(frame, "Selecciona una assignació");
        }else{
            int element = (int)elementmodificat;
            seleccio = -1;
            boolean trobat = false;
            for (int i = 0; i<Arrays.arrayAssignacio.size() && trobat == false; i++){
                try{
                    if(element == Arrays.arrayAssignacio.get(i).getId()){
                    seleccio = i;
                    IO.imprimirTI("Seleccio: " + seleccio);
                    trobat = true;
                }
                }catch(Exception e){
                    IO.imprimirTI("Error: " + e);
                    logError("Error al seleccionar una assignacio a carregar: " + e);
                }

            }
            if (seleccio ==-1) JOptionPane.showMessageDialog(null, "No s'ha pogut seleccionar");
            else {
                try{
                   dataText.setText(Arrays.arrayAssignacio.get(seleccio).getData()); 
                }catch (Exception e){
                    logError("Error al carrgar les dades de una assignacio: " + e);
                }
            }
          }

        return seleccio;
    }


    public static void log(String s) {
        String currentTime = dataActual();
        try{
            FileWriter aWriter = new FileWriter(path + "log.txt", true);
            aWriter.write(currentTime + " - " + s + "\n");
            aWriter.flush();
            aWriter.close();
        }catch(Exception e){
            IO.imprimirT("Error la registrar logs: " + e);
            logError("Error al registrar logs: " + e);
        }
    }
    public static void logError(String s) {
        String currentTime = dataActual();
        try{
            FileWriter aWriter = new FileWriter(path + "logError.txt", true);
            aWriter.write(currentTime + " - " + s + "\n");
            aWriter.flush();
            aWriter.close();
        }catch(Exception e){
            IO.imprimirT("Error la registrar logs: " + e);
        }
    }
    
    public static String dataActual(){
        TimeZone tz = TimeZone.getTimeZone("CET"); // or PST, MID, etc ...
        Date now = new Date();
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy kk:mm:ss");
        df.setTimeZone(tz);
        String currentTime = df.format(now);
        return currentTime;
    }
}
