package test;

import interfaces.*;

public class TestInterface {

    public static void main(String[] args) {
        BaseDatos datos = new ImplementarMySQL();
        datos.actualizar();
    }    
}