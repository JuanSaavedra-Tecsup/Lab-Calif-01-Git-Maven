package com.tecsup.lab01;

/**
 * Hello world!
 *
 */
public class App extends com.tecsup.lab01.Model.User
{
    public static void main( String[] args )
    {
        UserController x=new UserController();
    	x.registrar();
    	UserView u = new UserView();
        u.imprimir();
    }
}
