/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;



/**
 *
 * @author Jair Javier Fernandez Almeida 
 *         Yeffrey Jair Carbajal Barcia 
 */
public class Medico extends Persona{
    protected String licencia;
    protected Especialidad especialidad;
    protected int year;
    protected int meses;
    protected int horaInicio;
    protected int horaFin;

    public Medico() {
    }

    public Medico(String nombre, String apellidos, String telefono, String cedula, String carnet, Direccion direccion, String licencia, Especialidad especialidad, int year, int meses, int horaInicio, int horaFin) {
        super(nombre, apellidos, telefono,cedula,carnet,direccion);
        this.licencia = licencia;
        this.especialidad = especialidad;
        this.year = year;
        this.meses = meses;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
    }

    public String getLicencia() {
        return licencia;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public int getYear() {
        return year;
    }

    public int getMeses() {
        return meses;
    }

    public int getHoraInicio() {
        return horaInicio;
    }

    public int getHoraFin() {
        return horaFin;
    }

    public void setLicencia(String licencia) {
        this.licencia = licencia;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMeses(int meses) {
        this.meses = meses;
    }

    public void setHoraInicio(int horaInicio) {
        this.horaInicio = horaInicio;
    }

    public void setHoraFin(int horaFin) {
        this.horaFin = horaFin;
    }

    @Override
    public void ponerCarnet() {
        String cedula1 = cedula;        
        String nombre1 = nombre;
        String apellidos1 = apellidos;
        int numeroR = (int)Math.floor(Math.random()*100+10);        
        cedula1.substring(2);                
        cedula1.subSequence(2, 2);
        
    }
   
 
    
}
