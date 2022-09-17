/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import listeners.FrmPrincipalListener;

/**
 *
 * @author Jair Javier Fernandez Almeida 
 *         Yeffrey Jair Carbajal Barcia 
 */
public class FrmPrincipal extends JFrame{
    //agregando elementos a la pantalla principal
    private JPanel contentPane;
    private JLabel nombreHospital;
    private JLabel logo;
    private JLabel bienvenida;
    private JMenuBar barra;
    private JMenuItem registro;
    private JMenuItem medico;
    private JMenuItem pantallaPrincipal;
    private JMenuItem reportesM;
    private JMenuItem reportesP;
    private JDesktopPane escritorio;
    
    public FrmPrincipal(){
        super("Programa El paciente feliz");
        initComponents();
        addListeners();
    }
    
    private void addListeners(){
        registro.addActionListener(new FrmPrincipalListener(this));
        pantallaPrincipal.addActionListener(new FrmPrincipalListener(this));
        medico.addActionListener(new FrmPrincipalListener(this));
    }
        
    private void initComponents(){
        setSize(780,750);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        contentPane = new JPanel(new BorderLayout());
        setContentPane(contentPane);
        //agregando la barra de menu
        barra = new JMenuBar();
        setJMenuBar(barra);
        //intento de cambiarle el color a la barra de menu
        //barra.setForeground(Color.black);
        //agregando menu de pantalla principal
        pantallaPrincipal = new JMenuItem("Pantalla principal");
        pantallaPrincipal.setFont(new Font("Agency FB",0,18));
        pantallaPrincipal.setForeground(Color.black);
        barra.add(pantallaPrincipal);
        //agregando menu de registro
        registro = new JMenuItem("Registro de pacientes");
        registro.setFont(new Font("Agency FB",0,18));
        registro.setForeground(Color.black);
        barra.add(registro);
        //agregando menu de los medicos
        medico = new JMenuItem("Registro de médicos");
        medico.setFont(new Font("Agency FB",0,18));
        medico.setForeground(Color.black);
        barra.add(medico);
        //agregando menu de reportes de medicos existentes
        reportesM = new JMenuItem("Reportes de medicos");
        reportesM.setForeground(Color.black);
        reportesM.setFont(new Font("Agency FB",0,18));
        barra.add(reportesM);
        //agregando menu de reportes de pacientes existentes
        reportesP = new JMenuItem("Reportes de pacientes");
        reportesP.setForeground(Color.black);
        reportesP.setFont(new Font("Agency FB",0,18));
        barra.add(reportesP);
        
        //agregando escritorio virtual
        escritorio = new JDesktopPane();
        contentPane.add(escritorio, BorderLayout.CENTER);      
        escritorio.setLayout(null);
        escritorio.setBackground(Color.white);
        //agregando la etiqueta del nombre del hospital
        nombreHospital = new JLabel();
        nombreHospital.setText("<html>Hospital <p> El paciente feliz<html>");
        nombreHospital.setBounds(160,75,500,100);
        nombreHospital.setForeground(Color.green);     
        nombreHospital.setOpaque(false);        
        nombreHospital.setFont(new Font("Agency FB",0,35));
        escritorio.add(nombreHospital);   
        //agregando etiqueta con imagen del hospital
        logo = new JLabel(new ImageIcon("Logo.png"));
        logo.setBounds(10, 100, 500, 500);
        escritorio.add(logo);
        //agregando etiqueta con saludo al usuario :p
        bienvenida = new JLabel("Bienvenido querido usuario!");
        bienvenida.setBounds(550, 10, 400, 60);
        //bienvenida
        bienvenida.setForeground(Color.black);
        bienvenida.setFont(new Font("Agency FB",0,20));   
        escritorio.add(bienvenida);
    }  
    
    //agregando los getters y setters de los menus y del escritorio

    public JMenuItem getRegistro() {
        return registro;
    }

    public void setRegistro(JMenuItem registro) {
        this.registro = registro;
    }

    public JMenuItem getMedico() {
        return medico;
    }

    public void setMedico(JMenuItem medico) {
        this.medico = medico;
    }

    public JMenuItem getPantallaPrincipal() {
        return pantallaPrincipal;
    }

    public void setPantallaPrincipal(JMenuItem pantallaPrincipal) {
        this.pantallaPrincipal = pantallaPrincipal;
    }

    public JMenuItem getReportesM() {
        return reportesM;
    }

    public void setReportesM(JMenuItem reportesM) {
        this.reportesM = reportesM;
    }

    public JMenuItem getReportesP() {
        return reportesP;
    }

    public void setReportesP(JMenuItem reportesP) {
        this.reportesP = reportesP;
    }

    public JDesktopPane getEscritorio() {
        return escritorio;
    }

    public void setEscritorio(JDesktopPane escritorio) {
        this.escritorio = escritorio;
    }    
}