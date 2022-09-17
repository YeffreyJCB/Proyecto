
package modelo;

import java.util.ArrayList;

/**
 *
 * @author Jair Javier Fernandez Almeida 
 *         Yeffrey Jair Carbajal Barcia 
 */
public class Paciente extends Persona{
    protected String esAlergico;
    protected String totalVacunasCovid;

    public Paciente() {
        super();
    }

    public Paciente(String nombre, String apellidos, String telefono, String cedula, String carnet, Direccion direccion, String esAlergico, String totalVacunasCovid) {
        super(nombre, apellidos, telefono, cedula, carnet, direccion);
        this.esAlergico = esAlergico;
        this.totalVacunasCovid = totalVacunasCovid;
    }

    
    public String getEsAlergico() {
        return esAlergico;
    }

    public String getTotalVacunasCovid() {
        return totalVacunasCovid;
    }

    public void setEsAlergico(String esAlergico) {
        this.esAlergico = esAlergico;
    }

    public void setTotalVacunasCovid(String totalVacunasCovid) {
        this.totalVacunasCovid = totalVacunasCovid;
    }

    @Override
    public void ponerCarnet() {
        
    }    
}
