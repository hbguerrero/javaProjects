package abstractas;

public class Rectangle extends FiguraGeometrica {

    public Rectangle(String tipoFigura) {
        super(tipoFigura);
    }

    @Override
    public void dibujar() {      
        System.out.println("Se dibuja un: "+getClass().getSimpleName());
    }        
}
