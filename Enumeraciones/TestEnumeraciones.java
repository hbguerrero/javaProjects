package test;


import enumeraciones.*;

public class TestEnumeraciones {
    public static void main(String[] args){
        System.out.println(Dias.DOMINGO);
        System.out.println(Dias.LUNES);       
        
        System.out.println(Continentes.AFRICA);
        
        System.out.println(Continentes.EUROPA.getPaises());
        
        Continentes continente = Continentes.AMERICA;
        System.out.println(continente.getPaises());
        
    }      
}