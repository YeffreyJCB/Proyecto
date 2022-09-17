/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listeners;

import gui.IFrmMedico;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author windos
 */
public class IFrmMedicoListener implements ActionListener{
    private IFrmMedico iFrameM;
    
    public IFrmMedicoListener(){}
    
    public IFrmMedicoListener(IFrmMedico iFrameM){
        this.iFrameM = iFrameM;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == iFrameM.getBtnNuevoRegistroM()){
            nuevoRegistro();
        }
        if(e.getSource() == iFrameM.getBtnRegistradoM()){
            
        }
        if(e.getSource() == iFrameM.getBtnCancelarM()){
            iFrameM.dispose();
        }        
    }
    
    private void nuevoRegistro(){
      
        
    }
    
}
