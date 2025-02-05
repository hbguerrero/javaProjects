package interfaces;

public interface BaseDatos {
    int MAXIMO_DATOS = 10;
    
    void insertar();
    void listar();
    void actualizar();
    void eliminar();
}