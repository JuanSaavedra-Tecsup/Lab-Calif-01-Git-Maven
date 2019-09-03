package com.tecsup.lab01.Controller;

import javax.swing.JOptionPane;

public class UserController extends com.tecsup.lab01.Model.User {
    public void registrar(){
        nombre = JOptionPane.showInputDialog("Ingrese su Nombre");
        apellidos = JOptionPane.showInputDialog("Ingrese su Apellido Paterno");
        edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su Edad"));
    }


}
