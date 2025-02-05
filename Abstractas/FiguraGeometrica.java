package abstractas;

public abstract class FiguraGeometrica {
    protected String tipoFigura;

    public FiguraGeometrica(String tipoFigura) {
        this.tipoFigura = tipoFigura;
    }
    
    public abstract void dibujar();

    public String getTipoFigura() {
        return tipoFigura;
    }

    public void setTipoFigura(String tipoFigura) {
        this.tipoFigura = tipoFigura;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FiguraGeometrica{");
        sb.append("tipoFigura=").append(tipoFigura);
        sb.append('}');
        return sb.toString();
    }
}
   
