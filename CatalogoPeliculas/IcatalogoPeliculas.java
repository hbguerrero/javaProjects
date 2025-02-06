package peliculas.modelo;

public interface IcatalogoPeliculas {
    void insertarPelicula(Pelicula nombrePelicula);
    void listarPelicula();
    void buscarPelicula(String nombrePelicula);            
}