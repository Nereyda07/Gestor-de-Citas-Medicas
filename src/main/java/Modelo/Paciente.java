/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Det-Pc
 */
public class Paciente extends Persona{
    protected String numeroEmerg, diagnostico;

    public Paciente(String numeroEmerg, String diagnostico, String cedula, String nombre, String apellido, String celular, String contrsenia, String fechaNaci, String seguro) {
        super(cedula, nombre, apellido, celular, contrsenia, fechaNaci, seguro);
        this.numeroEmerg = numeroEmerg;
        this.diagnostico = diagnostico;
    }

    public String getNumeroEmerg() {
        return numeroEmerg;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public String getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCelular() {
        return celular;
    }

    public String getContrsenia() {
        return contrsenia;
    }

    public String getFechaNaci() {
        return fechaNaci;
    }

    public String getSeguro() {
        return seguro;
    }

    public void setNumeroEmerg(String numeroEmerg) {
        this.numeroEmerg = numeroEmerg;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public void setContrsenia(String contrsenia) {
        this.contrsenia = contrsenia;
    }

    public void setFechaNaci(String fechaNaci) {
        this.fechaNaci = fechaNaci;
    }

    public void setSeguro(String seguro) {
        this.seguro = seguro;
    }
    
}
