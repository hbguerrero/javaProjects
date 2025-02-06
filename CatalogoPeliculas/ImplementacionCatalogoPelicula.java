package peliculas.modelo;

import java.util.ArrayList;
import javax.swing.*;

public class ImplementacionCatalogoPelicula implements IcatalogoPeliculas {
    
    private final ArrayList<String> listaPeliculas;

    public ImplementacionCatalogoPelicula() {
        this.listaPeliculas = new ArrayList<>();
    }
    
    @Override
    public void insertarPelicula(Pelicula nombrePelicula) {
        JOptionPane.showMessageDialog(null, this.listaPeliculas, "LISTA DE PELICULAS",
                JOptionPane.INFORMATION_MESSAGE);
    }

    @Override
    public void listarPelicula() {
        JOptionPane.showMessageDialog(null,this.listaPeliculas, 
                "LISTA PELICULAS", JOptionPane.INFORMATION_MESSAGE);
    }

    @Override
    public void buscarPelicula(String nombrePelicula) {
        String resultado = null;
        for(var pelicula: this.listaPeliculas) {
            if (pelicula.equals(nombrePelicula)) {
               resultado = pelicula;
               break;
            } else {
                resultado = pelicula;
            }
            
            if (nombrePelicula.equals(resultado)) {
               JOptionPane.showMessageDialog(null, "Resultado: " + resultado,
                       "BUSCAR PELICULA", JOptionPane.QUESTION_MESSAGE);            
            } else {
                JOptionPane.showMessageDialog(null, "Película no encontrada: " 
                        + nombrePelicula, "BUSCAR PELICULA", 
                        JOptionPane.WARNING_MESSAGE);            
            }                           
        }        
    }          
}