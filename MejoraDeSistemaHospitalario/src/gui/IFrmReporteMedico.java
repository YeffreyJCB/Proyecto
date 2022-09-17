/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

import java.awt.BorderLayout;
import java.beans.PropertyVetoException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.Direccion;
import modelo.Paciente;

/**
 *
 * @author Jair Javier Fernandez Almeida 
 *         Yeffrey Jair Carbajal Barcia
 */
public class IFrmReporteMedico extends JInternalFrame{
    String [] columna = {"nombre", "apellidos", "telefono","cedula", "carnet", "direccion","licencia", "especialidad", "year", "meses", "horaInicio", "horaFin"};
    //Paciente paciente = new Paciente(title, title, title, title, title, direccion, title, title);
    
    DefaultTableModel modelo = new DefaultTableModel(columna, ABORT);
    JScrollPane scroll = new JScrollPane();
    private JPanel contentPane;
    private JPanel pnlCenter;
    private JLabel lblReporte;
    private JPanel pnlNorte;
    private JTable tablaRegistros;
    private Direccion direccion;
    
    
    
    public IFrmReporteMedico() {
        initComponents();
        this.setTitle("Registro de medico");
        addListeners();
    }
    
    private void addListeners(){
        
    }
    
    private void initComponents(){
        setBounds(100,100,500,300);
	contentPane = new JPanel(new BorderLayout());
	setContentPane(contentPane);       
        setIconifiable(false);
            try {
                setMaximum(true);
            } catch (PropertyVetoException ex) {}
        setResizable(false);
        setClosable(true);
//        pnlCenter = new JPanel();
//        contentPane.add(pnlCenter, BorderLayout.CENTER);
        pnlNorte = new JPanel();
        contentPane.add(pnlNorte, BorderLayout.NORTH);
        lblReporte = new JLabel("REPORTE DE LOS MEDICOS");
        pnlNorte.add(lblReporte);
        pnlCenter = new JPanel();
        contentPane.add(pnlCenter, BorderLayout.CENTER);
        tablaRegistros = new JTable();
        pnlCenter.add(tablaRegistros);
        //cargarModelo();
    }
    
    private void cargarModelo(){
        try{
            modelo.addColumn("Nombre");
            modelo.addColumn("Apellido");
            modelo.addColumn("Teléfono");
            modelo.addColumn("Cedula");
            modelo.addColumn("Direccion");
            modelo.addColumn("Carnet");
            tablaRegistros.setModel(modelo);
            cargarArchivo();
        }catch(IOException e){
            System.out.println(e);
        }
    }
    private void cargarArchivo() throws IOException{
        
        String fila[];
        
        try{
            
            FileReader archivo = new FileReader ("./src/Reporte de medicos.txt");
            BufferedReader lectura = new BufferedReader(archivo);
            
            String linea = lectura.readLine(); 
            
            while(linea != null){
                fila = linea.split("&");
                modelo.addRow(fila);
                linea = lectura.readLine();
            }
            
        }catch(FileNotFoundException e){
        System.out.println(e);
        }   
    }    
}
