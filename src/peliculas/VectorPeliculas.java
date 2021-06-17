package src.peliculas;
import src.tienda.*;

public class VectorPeliculas {
    //declarando nuestro arreglo de peliculas
    private Pelicula[] peliculas = new Pelicula[50];
    private int sigCodigoPelicula;
    public VectorPeliculas()
    {
        sigCodigoPelicula = 1;
    } 
    public void agregarPeliculas(int idPeli,String nombrePeli, int anioPeli, String catPeli, boolean dispoPeli )
    {
        if (sigCodigoPelicula > 50){
            System.out.println("Límite de clientes alcanzado");
        }
        else{
            peliculas[(sigCodigoPelicula-1)] = new Pelicula(sigCodigoPelicula,nombrePeli,anioPeli,catPeli,dispoPeli);
        }
        sigCodigoPelicula++;
    }  
    public void agregarPeli(){
        String nombre = IngresoDatos.getTexto("Ingrese el nombre de la Pelicula");
        int anioP = IngresoDatos.getEntero("Ingrese el anio de creacion de la pelicula", false);
        String catP = IngresoDatos.getTexto("Ingrese la categoria  de la pelicula");
        Boolean dispoP = IngresoDatos.getBoolean("La peli esta disponible ",true );
        agregarPeliculas(0, nombre, anioP, catP, dispoP);
    }

    public void mostrarPelis(){
        System.out.println("\n\n Peliculas de memorabilia");
        for (int i = 0; i < (sigCodigoPelicula-1); i++) {
            System.out.println("-"+i+") "+peliculas[i].getInformacionPelicula());        
        }

        System.out.println("\n\n");
    }
    //Ordenamiento
    public void ordenarPorNombrePelicula(boolean ascendente){
        boolean cambio = true;
        for (int i = 1; i < (sigCodigoPelicula-1); i++) {
            for (int j = 0; j < (sigCodigoPelicula-1-i); j++) {
                //  String.compareTo(String)
                //   [-oo , + oo]
                if (ascendente)
                    cambio= (peliculas[j].getNombre().compareTo(peliculas[j+1].getNombre()) > 0 );
                else 
                    cambio= (peliculas[j].getNombre().compareTo(peliculas[j+1].getNombre()) < 0 );

                if(cambio ){
                    //clientes i va antes que clientes j <0 descendente
                    Pelicula aux = peliculas[j];
                    peliculas[j] = peliculas[j+1];
                    peliculas[j+1]= aux;
                }
            }
        }

    }
 
}
