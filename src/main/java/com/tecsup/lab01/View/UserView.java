package com.tecsup.lab01.View;

public class UserViewe extends com.tecsup.lab01.Model.User{
    public void imprimir() {
		System.out.println("La persona ingresada es:");
		System.out.println(nombre+" "+apellidos);
		System.out.println("Su edad es:");
		System.out.println(edad);
	}

}
