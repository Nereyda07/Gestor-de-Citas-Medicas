/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Det-Pc
 */
public class Persona {
    protected String cedula, nombre, apellido, celular, contrsenia, fechaNaci, seguro;

    public Persona(String cedula, String nombre, String apellido, String celular, String contrsenia, String fechaNaci, String seguro) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.celular = celular;
        this.contrsenia = contrsenia;
        this.fechaNaci = fechaNaci;
        this.seguro = seguro;
    }

}
