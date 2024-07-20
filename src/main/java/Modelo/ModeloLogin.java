/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Det-Pc
 */
public class ModeloLogin {
    private String cedula, contrsenia;
    
    public ModeloLogin(){
        //Constructor vacio
    }

    public ModeloLogin(String cedula, String contrsenia) {
        this.cedula = cedula;
        this.contrsenia = contrsenia;
    }

    public String getUsuario() {
        return cedula;
    }

    public String getContrsenia() {
        return contrsenia;
    }

    public void setUsuario(String usuario) {
        this.cedula = usuario;
    }

    public void setContrsenia(String contrsenia) {
        this.contrsenia = contrsenia;
    }
    
}
