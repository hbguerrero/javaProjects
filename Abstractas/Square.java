package abstractas;

public class Square extends FiguraGeometrica{

    public Square(String tipoFigura) {
        super(tipoFigura);
    }

    @Override
    public void dibujar() {
        System.out.println("Se dibuja un: "+this.getClass().getSimpleName());
    }        
}
