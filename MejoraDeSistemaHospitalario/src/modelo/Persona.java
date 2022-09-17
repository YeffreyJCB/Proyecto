/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;

/**
 * 
 * @author Jair Javier Fernandez Almeida 
 *         Yeffrey Jair Carbajal Barcia 
 */
public abstract class Persona  {
    
    protected String nombre;  
    protected String apellidos;
    protected String cedula;
    protected String carnet;
    protected Direccion direccion;
    protected String telefono;
    

    public Persona() {
    }

    public Persona(String nombre, String apellidos, String telefono, String cedula, String carnet, Direccion direccion) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.cedula = cedula;
        this.carnet = carnet;
        this.direccion = direccion;
    }
    
    public abstract void ponerCarnet();
    
    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getCedula() {
        return cedula;
    }

    public String getCarnet() {
        return carnet;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
