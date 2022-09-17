/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.Paciente;

/**
 *
 * @author Jair Javier Fernandez Almeida 
 *         Yeffrey Jair Carbajal Barcia 
 */
public class Archivo {
    
    File archivo;
    
    
    public void crearArchivo(){
        try {
            archivo = new File("./src/Reporte de pacientes.txt");
            if(archivo.createNewFile()){
                JOptionPane.showMessageDialog(null, "Archivo creado");
            }
        }catch (IOException ex) {
            System.out.println("No se ha creado el archivo");
        }
    }
    
    
    public void escribirArchivo(Paciente paciente){
       try{
           FileWriter escribir = new FileWriter(archivo, true);
           escribir.write(paciente.getNombre() + "; ");
           escribir.write(paciente.getApellidos() + "; ");
           escribir.write(paciente.getCedula() + "; ");
           escribir.write(paciente.getCarnet()+ "; ");
           escribir.write(paciente.getDireccion()+ "; ");
           escribir.write(paciente.getTelefono() + "; ");
           escribir.write(paciente.getEsAlergico() + "; ");
           escribir.write(paciente.getTotalVacunasCovid()+ ". \r\n");
           escribir.close();
       }catch(IOException e){
           System.out.println(e);
       } 
    } 
    
}
