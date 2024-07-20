/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Det-Pc
 */
public class ModeloAgendarC {
    private String servicios, fecha, horario, hora;
    
    public ModeloAgendarC(){
        //Constructor vacio
    }

    public ModeloAgendarC(String servicios, String fecha, String horario, String hora) {
        this.servicios = servicios;
        this.fecha = fecha;
        this.horario = horario;
        this.hora = hora;
    }

    public String getServicios() {
        return servicios;
    }

    public String getFecha() {
        return fecha;
    }

    public String getHorario() {
        return horario;
    }

    public String getHora() {
        return hora;
    }

    public void setServicios(String servicios) {
        this.servicios = servicios;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
    
}
