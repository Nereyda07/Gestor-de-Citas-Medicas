/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.ModeloLogin;
import Vista.Login;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Det-Pc
 */
public class ControladorLogin {
    public ConexionBD conexion;
    public Login vistaL;
    public ModeloLogin modeloL;
    public ControladorLogin(){
        vistaL = new Login();
        vistaL.setVisible(true);
        conexion = new ConexionBD("GestorDeCitasMedicas", "RegistroUsuario");
        vistaL.BtnIniciarS.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                String cedula = vistaL.TxtCedula.getText();
                String contrasenia =new String (vistaL.TxtContrasenia.getPassword());
                Validacion(cedula,contrasenia);
                
            }
        });
    }
    public void Validacion(String cedula, String contrasenia) {
        if (cedula.isEmpty() && contrasenia.isEmpty()) {
            vistaL.TxtValCedula.setText("*Campo obligatorio");
            vistaL.TxtValContrasenia.setText("*Campo obligatorio");
        }
        else {
            if (cedula.isEmpty() || contrasenia.isEmpty()) {
                vistaL.TxtValCedula.setText(" ");
                vistaL.TxtValContrasenia.setText(" ");
                if(cedula.isEmpty()) {
                    vistaL.TxtValCedula.setText("*Campo obligatorio");
                }
                if(contrasenia.isEmpty()) {
                    vistaL.TxtValContrasenia.setText("*Campo obligatorio");
                }
            }
            else {
                vistaL.TxtValCedula.setText(" ");
                vistaL.TxtValContrasenia.setText(" "); 
            }
        }
    }
}
