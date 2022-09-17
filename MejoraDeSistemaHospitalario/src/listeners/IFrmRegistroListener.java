/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listeners;

import gui.Archivo;
import gui.IFrmRegistro;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

import modelo.Direccion;
import modelo.Paciente;
import modelo.Persona;
import modelo.Telefono;

/**
 *
 * @author Jair Javier Fernandez Almeida 
 *         Yeffrey Jair Carbajal Barcia 
 */
public class IFrmRegistroListener implements ActionListener{
    private IFrmRegistro iFrameR;
    
    public IFrmRegistroListener(){}
    
    public IFrmRegistroListener(IFrmRegistro iFrameR){
        this.iFrameR = iFrameR;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == iFrameR.getBtnNuevoRegistro()){
            Archivo archivo = new Archivo();
            archivo.crearArchivo();
            try{
             if(iFrameR.getTxtNombre().getText().equals("") || iFrameR.getTxtApellidos().getText().equals("")
                     || iFrameR.getTxtTelefono().getText().equals("") || iFrameR.getTxtCedula().getText().equals("")
                     || iFrameR.getTxtCarnet().getText().equals("")|| iFrameR.getTxtCiudad().getText().equals("")
                     || iFrameR.getTxtCalle().getText().equals("") || iFrameR.getTxtNumero().getText().equals("")
                     || iFrameR.getCmbAlergico().getSelectedItem().equals("--Seleccione--")
                     || iFrameR.getCmbVacunas().getSelectedItem().equals("--Seleccione--")){
                JOptionPane.showMessageDialog(null, "Por favor rellene los campos");
            }else{ 
            String nombre = iFrameR.getTxtNombre().getText();
            String apellidos = iFrameR.getTxtApellidos().getText();
            String telefono = iFrameR.getTxtTelefono().getText();
            String cedula = iFrameR.getTxtCedula().getText();
            String carnet = iFrameR.getTxtCarnet().getText();        
            String ciudad;
            String calle;
            String numero;
            ciudad = iFrameR.getTxtCiudad().getText(); 
            calle = iFrameR. getTxtCalle().getText();
            numero = iFrameR. getTxtNumero().getText();
            Direccion direccion = new Direccion(ciudad, calle, numero);
            String esAlergico = (String)iFrameR.getCmbAlergico().getSelectedItem();
            String totalVacunasCovid = (String) iFrameR.getCmbVacunas().getSelectedItem();
        
            Paciente p = new Paciente(nombre, apellidos, telefono, cedula, carnet, direccion, esAlergico, totalVacunasCovid);
            archivo.escribirArchivo(p);
            
            JOptionPane.showMessageDialog(null, "Registro de paciente guardado"); 
            nuevo();
            }
            }catch(NumberFormatException ex){System.out.println("No se introdujeron datos");}   
            return;
        }
        if(e.getSource() == iFrameR.getBtnRegistrado()){
            
        }
        if(e.getSource() == iFrameR.getBtnCancelar()){
            iFrameR.dispose();
        }
    } 
    
    private void nuevo() {
		iFrameR.getTxtNombre().setText("");
		iFrameR.getTxtApellidos().setText("");
		iFrameR.getTxtTelefono().setText("");
		iFrameR.getTxtCedula().setText("");
                iFrameR.getTxtCarnet().setText("");
                iFrameR.getTxtCiudad().setText(""); 
                iFrameR.getTxtCalle().setText(""); 
                iFrameR.getTxtNumero().setText(""); 
                iFrameR.getCmbAlergico().setSelectedItem("--Seleccione--"); 
                iFrameR.getCmbVacunas().setSelectedItem("--Seleccione--");
		iFrameR.getTxtNombre().requestFocus();
	}
}
