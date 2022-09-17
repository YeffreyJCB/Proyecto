package listeners;

import gui.FrmPrincipal;
import gui.IFrmMedico;
import gui.IFrmRegistro;
import gui.IFrmReporteMedico;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jair Javier Fernandez Almeida 
 *         Yeffrey Jair Carbajal Barcia 
 */
public class FrmPrincipalListener implements ActionListener{
    private FrmPrincipal frame;
    private IFrmRegistro iFrameR;
    private IFrmMedico iFrameM;
    private IFrmReporteMedico iFrameRM;

    public FrmPrincipalListener() {}

    public FrmPrincipalListener(FrmPrincipal frame){
        this.frame = frame;       
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == frame.getRegistro()){
            iFrameR = new IFrmRegistro();
            frame.getEscritorio().add(iFrameR);
            iFrameR.setVisible(true); 
            return;
        }
        if(e.getSource() == frame.getMedico()){ 
            iFrameM = new IFrmMedico();
            frame.getEscritorio().add(iFrameM);
            iFrameM.setVisible(true);
            return;
        }
        if(e.getSource() == frame.getPantallaPrincipal()){
            frame.getEscritorio().add(iFrameR);
            iFrameR.setVisible(false);
            frame.setVisible(true);
        }    
        if(e.getSource() == frame.getReportesP()){
            
        }
        if(e.getSource() == frame.getReportesM()){
            iFrameRM = new IFrmReporteMedico();
            frame.getEscritorio().add(iFrameRM);
            iFrameRM.setVisible(true);            
        }
    }    
}
