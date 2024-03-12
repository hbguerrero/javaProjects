package inheritance;

public class Person {
    protected String nombre;
    protected char genero;
    protected int  edad;
    protected String direccion;    

    public Person(String nombre) {
        this.nombre = nombre;
    }

    public Person(String nombre, char genero, int edad, String direccion) {
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
        this.direccion = direccion;
    }

    
    public String obtenerDetalles() {
        return "Name: %s, Age: %d ".formatted(this.nombre, this.edad);
}

            
//    public String getNombre() {
//        return this.nombre;
//    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getGenero() {
        return this.genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Person{");
        sb.append("nombre=").append(nombre);
        sb.append(", genero=").append(genero);
        sb.append(", edad=").append(edad);
        sb.append(", direccion=").append(direccion);
        sb.append('}');
        return sb.toString();   
    
    }    
}