/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.beans.PropertyVetoException;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import listeners.IFrmMedicoListener;
import modelo.Especialidad;

/**
 *
 * @author windos
 */
public class IFrmMedico extends JInternalFrame{
    private JPanel contentPane;
    private JPanel pnlSur;
    private JPanel pnlCenter;
    private JButton btnNuevoRegistroM;
    private JButton btnRegistradoM;
    private JButton btnCancelarM;
    private JLabel lblNombreM;
    private JTextField txtNombreM;
    private JLabel lblApellidosM;
    private JTextField txtApellidosM;
    private JLabel lblTelefonoM;
    private JTextField txtTelefonoM;
    private JLabel lblCedulaM;
    private JTextField txtCedulaM;
    private JLabel lblDireccionM;
    private JTextField txtDireccionM;
    private JLabel lblCarnetM;
    private JTextField txtCarnetM;
    private JLabel lblLicenciaM;
    private JTextField txtLicenciaM;
    private JLabel lblEspecialidad;
    private JComboBox cmbEspecialidad;
    final Especialidad [] especialidadM = Especialidad.values();
    private JLabel lblYear;
    private JTextField txtYear;
    private JLabel lblMeses;
    private JTextField txtMeses;
    private JLabel lblHoraI;
    private JTextField txtHoraI;
    private JLabel lblHoraF;
    private JTextField txtHoraF;
   
       
    public IFrmMedico(){
       super("Registro de medicos");
       initComponents();
       addListeners();
    }
    
    private void addListeners(){
        IFrmMedicoListener listener = new IFrmMedicoListener(this);
        btnNuevoRegistroM.addActionListener(listener);
        btnRegistradoM.addActionListener(listener);
        btnCancelarM.addActionListener(listener);
    }
    
    private void initComponents(){
        setBounds(100,100,500,300);
        contentPane = new JPanel(new BorderLayout());
        setContentPane(contentPane);
        setIconifiable(false);
        try{
            setMaximum(true);
        }catch(PropertyVetoException e){}
        setResizable(false);
        setClosable(true);
        //agregando botones a la ventana interna
        //agregando botones a la ventana interna
        pnlSur = new JPanel();
        btnNuevoRegistroM = new JButton("Registrar");
        btnRegistradoM = new JButton("Paciente ya registrado");
        btnCancelarM = new JButton("Cancelar");
        pnlSur.add(btnNuevoRegistroM);
        pnlSur.add(btnRegistradoM);
        pnlSur.add(btnCancelarM);
        contentPane.add(pnlSur, BorderLayout.SOUTH);
        
        //agregando elementos al panel central de la ventana interna
        pnlCenter = new JPanel(new GridLayout(12,2));
        contentPane.add(pnlCenter, BorderLayout.CENTER);
        lblNombreM = new JLabel("Nombre: ");
        pnlCenter.add(lblNombreM);
        txtNombreM = new JTextField();
        pnlCenter.add(txtNombreM);
        lblApellidosM = new JLabel("Apellidos: ");
        pnlCenter.add(lblApellidosM);
        txtApellidosM = new JTextField();
        pnlCenter.add(txtApellidosM);
        lblTelefonoM = new JLabel("Teléfono: ");
        pnlCenter.add(lblTelefonoM);
        txtTelefonoM = new JTextField();
        pnlCenter.add(txtTelefonoM);
        lblCedulaM = new JLabel("Cedula: ");
        pnlCenter.add(lblCedulaM);
        txtCedulaM = new JTextField();
        pnlCenter.add(txtCedulaM);
        lblDireccionM = new JLabel("Direccion: ");
        pnlCenter.add(lblDireccionM);
        txtDireccionM = new JTextField();
        pnlCenter.add(txtDireccionM);
        lblCarnetM = new JLabel("Carnet: ");
        pnlCenter.add(lblCarnetM);
        txtCarnetM = new JTextField();
        pnlCenter.add(txtCarnetM);     
        lblEspecialidad = new JLabel("Especialidad en la que trabaja:");
        pnlCenter.add(lblEspecialidad);
        cmbEspecialidad = new JComboBox(especialidadM);
        pnlCenter.add(cmbEspecialidad);
        lblLicenciaM = new JLabel("Numero de licencia: ");
        pnlCenter.add(lblLicenciaM);
        txtLicenciaM = new JTextField();
        pnlCenter.add(txtLicenciaM);
        lblYear = new JLabel("Años que lleva trabajando");
        pnlCenter.add(lblYear);
        txtYear = new JTextField();
        pnlCenter.add(txtYear);
        lblMeses = new JLabel("Meses que lleva trabajando");
        pnlCenter.add(lblMeses);
        txtMeses = new JTextField();
        pnlCenter.add(txtMeses);  
        lblHoraI = new JLabel("Hora de llegada");
        pnlCenter.add(lblHoraI);
        txtHoraI = new JTextField();
        pnlCenter.add(txtHoraI);
        lblHoraF = new JLabel("Hora de salida");
        pnlCenter.add(lblHoraF);
        txtHoraF = new JTextField();
        pnlCenter.add(txtHoraF);
    }

    public JButton getBtnNuevoRegistroM() {
        return btnNuevoRegistroM;
    }

    public void setBtnNuevoRegistroM(JButton btnNuevoRegistroM) {
        this.btnNuevoRegistroM = btnNuevoRegistroM;
    }

    public JButton getBtnRegistradoM() {
        return btnRegistradoM;
    }

    public void setBtnRegistradoM(JButton btnRegistradoM) {
        this.btnRegistradoM = btnRegistradoM;
    }

    public JButton getBtnCancelarM() {
        return btnCancelarM;
    }

    public void setBtnCancelarM(JButton btnCancelarM) {
        this.btnCancelarM = btnCancelarM;
    }

    public JTextField getTxtNombreM() {
        return txtNombreM;
    }

    public void setTxtNombreM(JTextField txtNombreM) {
        this.txtNombreM = txtNombreM;
    }

    public JTextField getTxtApellidosM() {
        return txtApellidosM;
    }

    public void setTxtApellidosM(JTextField txtApellidosM) {
        this.txtApellidosM = txtApellidosM;
    }

    public JTextField getTxtTelefonoM() {
        return txtTelefonoM;
    }

    public void setTxtTelefonoM(JTextField txtTelefonoM) {
        this.txtTelefonoM = txtTelefonoM;
    }

    public JTextField getTxtCedulaM() {
        return txtCedulaM;
    }

    public void setTxtCedulaM(JTextField txtCedulaM) {
        this.txtCedulaM = txtCedulaM;
    }

    public JTextField getTxtDireccionM() {
        return txtDireccionM;
    }

    public void setTxtDireccionM(JTextField txtDireccionM) {
        this.txtDireccionM = txtDireccionM;
    }

    public JTextField getTxtCarnetM() {
        return txtCarnetM;
    }

    public void setTxtCarnetM(JTextField txtCarnetM) {
        this.txtCarnetM = txtCarnetM;
    }

    public JTextField getTxtLicenciaM() {
        return txtLicenciaM;
    }

    public void setTxtLicenciaM(JTextField txtLicenciaM) {
        this.txtLicenciaM = txtLicenciaM;
    }    
    
}
