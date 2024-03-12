package test;

import inheritance.*;
import java.util.Date;
public class InheritanceTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee(1, 3000, "Alex", 'M', 32, "Facatativa");
        System.out.println(employee1);
        Employee employee2 = new Employee(2, 3450, "Alicia", 'F', 41, "Madrid");
        System.out.println(employee2);
        
        var fecha = new Date();
        
        Cliente cliente1 = new Cliente(fecha, true, "HBG", 'M', 46, "Bogota");
        System.out.println(cliente1);
        
        var fecha1 = new Date();
        
        Cliente cliente2 = new Cliente(fecha1, false, "Carla", 'F', 43, "Cota");
        System.out.println(cliente2);
        
        Person persona1 = new Person("Fabio", 'M', 25, "Madrid");
        imprimir(persona1);
//        System.out.println("Detalles persona 1: " + persona1.obtenerDetalles());
        
        System.out.println("Detalles cliente 1: " + cliente1.obtenerDetalles());
        System.out.println("Detalles empleado 1: " + employee1.obtenerDetalles());

//        Person person1 = new Person("Henry B.", 'M', 46, "Bogota");
    
    
//        //Casting de Objetos 
//        //Downcasting 
    
        Person persona2 = new Employee(3, 4567, "Alex", 'M', 37, "Teusaquillo");
        Employee empleado1 = (Employee) persona2;
        System.out.println(empleado1.obtenerDetalles());
//        
        //Upcasting 
        Person persona3 = empleado1;
        System.out.println(persona3.obtenerDetalles());                

}        
    public static void imprimir(Person persona) {
        System.out.println(persona.obtenerDetalles());
   
    }

////Código instance of en java 
//    public static void determinarTipo(Object objeto){
//        if(objeto instanceof Employee){
//            System.out.println("Es de Tipo Empleado");
//        }else if (objeto instanceof Cliente){
//            System.out.println("Es de tipo Cliente");
//        }else if (objeto instanceof Person){
//            System.out.println("Es de Tipo Persona");
//        }else if (objeto instanceof Object){
//            System.out.println("Es de tipo Object");
//        }
    
    //        
//        String nombre = "Henry";
//        determinarTipo(employee1);        
        
}      