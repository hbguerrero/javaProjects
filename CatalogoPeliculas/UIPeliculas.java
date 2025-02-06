package peliculas.ui;

import peliculas.modelo.*;
import javax.swing.JOptionPane;

public class UIPeliculas {
    
  public static void interfazUsuario() {  
    IcatalogoPeliculas peliculas = new ImplementacionCatalogoPelicula();
    Pelicula pelicula;
    
    CERRAR:
    while (true) {
        
        String opcion = JOptionPane.showInputDialog(
                null,
                "1 - Insertar Pelicula" +
                "2 - Enlistar Pelicula" +
                "3 - Buscar Pelicula" +
                "4 - Salir",
                "Ingrese opción",
                3);
        
        int opcionInt = 0;
        
        try{
            opcionInt = Integer.parseInt(opcion);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(
                    null,
                    "Las opciones tienen que ser números enteros\n" + e,
                    "ERROR",
                    JOptionPane.ERROR_MESSAGE
            );
        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                    null,
                    e,
                    "ERROR",
                    JOptionPane.ERROR_MESSAGE
            );
        
        }
        
        switch (opcionInt) {
            case 1:
                String nombrePelicula = JOptionPane.showInputDialog(
                        null,
                        "Ingrese el nombre de la palícula",
                        "Entrada",
                        3);
                
            pelicula = new Pelicula(nombrePelicula);
            peliculas.insertarPelicula(pelicula);
            break;
            
            case 2:
                peliculas.listarPelicula();
                break;
                
            case 3:
                nombrePelicula = JOptionPane.showInputDialog(
                        null,
                        "INGRESE NOMBRE DE LA PELICULA",
                        "Ingrese",
                        3
                );
            
            case 4:
                break CERRAR;
            
            default:
                JOptionPane.showMessageDialog(
                        null,
                        "OPCION INCORRECTA\n" + 
                        "INGRESA UNA OPCION CORRECTA\n" + 
                        "LAS OPCIONES SON DE 1 a 4",
                        "ERROR",
                        JOptionPane.ERROR_MESSAGE
                );
        }
    }
  }    
    
    
    
}
