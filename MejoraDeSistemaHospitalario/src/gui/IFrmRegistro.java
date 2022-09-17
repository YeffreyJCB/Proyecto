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
import listeners.IFrmRegistroListener;

/**
 *
 * @author Jair Javier Fernandez Almeida 
 *         Yeffrey Jair Carbajal Barcia 
 */
public class IFrmRegistro extends JInternalFrame{
    private JPanel contentPane;
    private JPanel pnlSur;
    private JPanel pnlCenter;
    private JButton btnNuevoRegistro;
    private JButton btnRegistrado;
    private JButton btnCancelar;
    private JLabel lblNombre;
    private JTextField txtNombre;
    private JLabel lblApellidos;
    private JTextField txtApellidos;
    private JLabel lblTelefono;
    private JTextField txtTelefono;
    private JLabel lblCedula;
    private JTextField txtCedula;
    private JLabel lblCiudad;
    private JTextField txtCiudad;
    private JLabel lblCalle;
    private JTextField txtCalle;
    private JLabel lblNumero;
    private JTextField txtNumero;
    
    private JLabel lblCarnet;
    private JTextField txtCarnet;
    private JLabel lblAlergico;
    private JComboBox cmbAlergico;
    final String [] vAlergico = {"--Seleccione--", "Sí", "No"};
    private JLabel lblVacunas;
    private JComboBox cmbVacunas;
    final String [] vVacunas = {"--Seleccione--","0", "1", "2","3","4"};
    
    
    public IFrmRegistro(){
      super("Mantenimiento operacion"); 
      initComponents();
      addListeners();
    }
    
    private void addListeners(){
        IFrmRegistroListener listener = new IFrmRegistroListener(this);
        btnNuevoRegistro.addActionListener(listener);
        btnRegistrado.addActionListener(listener);
        btnCancelar.addActionListener(listener);
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
      //agregando botones a la ventana interna
      pnlSur = new JPanel(); 
      btnNuevoRegistro = new JButton("Registrar");
      btnRegistrado = new JButton("Paciente ya registrado");
      btnCancelar = new JButton("Cancelar");
      pnlSur.add(btnNuevoRegistro);
      pnlSur.add(btnRegistrado);
      pnlSur.add(btnCancelar);
      contentPane.add(pnlSur, BorderLayout.SOUTH);
      //agregando elementos al panel central de la ventana interna
      pnlCenter = new JPanel(new GridLayout(10,2));
      contentPane.add(pnlCenter, BorderLayout.CENTER);
      lblNombre = new JLabel("Nombre: ");
      pnlCenter.add(lblNombre);
      txtNombre = new JTextField();
      pnlCenter.add(txtNombre);
      lblApellidos = new JLabel("Apellidos: ");
      pnlCenter.add(lblApellidos);
      txtApellidos = new JTextField();
      pnlCenter.add(txtApellidos);
      lblTelefono = new JLabel("Teléfono: ");
      pnlCenter.add(lblTelefono);
      txtTelefono = new JTextField();
      pnlCenter.add(txtTelefono);
      lblCedula = new JLabel("Cedula: ");
      pnlCenter.add(lblCedula);
      txtCedula = new JTextField();
      pnlCenter.add(txtCedula);
      lblCiudad = new JLabel("Ciudad: ");
      pnlCenter.add(lblCiudad);
      txtCiudad = new JTextField();
      pnlCenter.add(txtCiudad);
      lblCalle = new JLabel("Calle: ");
      pnlCenter.add(lblCalle);
      txtCalle = new JTextField();
      pnlCenter.add(txtCalle);
      lblNumero = new JLabel("Numero: ");
      pnlCenter.add(lblNumero);
      txtNumero = new JTextField();
      pnlCenter.add(txtNumero);
      lblCarnet = new JLabel("Carnet: ");
      pnlCenter.add(lblCarnet);
      txtCarnet = new JTextField();
      pnlCenter.add(txtCarnet);
      lblAlergico = new JLabel("Presenta alergias? " );
      pnlCenter.add(lblAlergico);
      cmbAlergico = new JComboBox(vAlergico);
      pnlCenter.add(cmbAlergico);
      lblVacunas = new JLabel("Numero de vacunas contra el covid:  ");
      pnlCenter.add(lblVacunas);
      cmbVacunas = new JComboBox(vVacunas);
      pnlCenter.add(cmbVacunas);       
    }

    public JButton getBtnNuevoRegistro() {
        return btnNuevoRegistro;
    }

    public void setBtnNuevo(JButton btnNuevoRegistro) {
        this.btnNuevoRegistro = btnNuevoRegistro;
    }

    public JButton getBtnRegistrado() {
        return btnRegistrado;
    }

    public void setBtnGuardar(JButton btnRegistrado) {
        this.btnRegistrado = btnRegistrado;
    }

    public JButton getBtnCancelar() {
        return btnCancelar;
    }

    public void setBtnCancelar(JButton btnCancelar) {
        this.btnCancelar = btnCancelar;
    }

    public JTextField getTxtNombre() {
        return txtNombre;
    }

    public void setTxtNombre(JTextField txtNombre) {
        this.txtNombre = txtNombre;
    }

    public JTextField getTxtApellidos() {
        return txtApellidos;
    }

    public void setTxtApellidos(JTextField txtApellidos) {
        this.txtApellidos = txtApellidos;
    }

    public JTextField getTxtTelefono() {
        return txtTelefono;
    }

    public void setTxtTelefono(JTextField txtTelefono) {
        this.txtTelefono = txtTelefono;
    }

    public JTextField getTxtCedula() {
        return txtCedula;
    }

    public void setTxtCedula(JTextField txtCedula) {
        this.txtCedula = txtCedula;
    }

    public JTextField getTxtCiudad() {
        return txtCiudad;
    }

    public void setTxtDireccion(JTextField txtCiudad) {
        this.txtCiudad = txtCiudad;
    }

    public JTextField getTxtCalle() {
        return txtCalle;
    }

    public void setTxtCalle(JTextField txtCalle) {
        this.txtCalle = txtCalle;
    }

    public JTextField getTxtNumero() {
        return txtNumero;
    }

    public void setTxtNumero(JTextField txtNumero) {
        this.txtNumero = txtNumero;
    }

    public JTextField getTxtCarnet() {
        return txtCarnet;
    }

    public void setTxtCarnet(JTextField txtCarnet) {
        this.txtCarnet = txtCarnet;
    }

    public JComboBox getCmbAlergico() {
        return cmbAlergico;
    }

    public void setCmbAlergico(JComboBox cmbAlergico) {
        this.cmbAlergico = cmbAlergico;
    }

    public JComboBox getCmbVacunas() {
        return cmbVacunas;
    }

    public void setCmbVacunas(JComboBox cmbVacunas) {
        this.cmbVacunas = cmbVacunas;
    }        
}
