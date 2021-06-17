package src.peliculas;

public class Pelicula {
        private int idPelicula;
        private String nombrePelicula;
        private int anioPelicula;
        private String categoriaPelicula;
        private boolean disponibilidadPelicula;
        //constructor de peliculas
        public Pelicula(int id, String nombre, int anio, String categoria, boolean disponible )
        {   
            //igualando atributos a parametros que seran recibidos 
            this.idPelicula = id;
            this.nombrePelicula = nombre;
            this.anioPelicula = anio;
            this.categoriaPelicula = categoria;
            this.disponibilidadPelicula = disponible;
        }
         //metodo que devuelve el id
         public int getId()
         {
             return idPelicula;
         }
         //metodo que envia el id para almacenarse
         public void  setId(int id)
         {
             idPelicula = id;
         }
         //metodo que devuelve el nombre de la pelicula 
         public String getNombre()
         {
             return nombrePelicula;
         }
         //metodo que envia el nombre de la pelicula para almacenarse
         public void setNombre(String nombre)
         {
             nombrePelicula = nombre;
         }
         // metodo que devuelve el anio de la pelicula
         public int getanio()
         {
             return anioPelicula;
         }
         //metodo que envia el anio para almacenarse
         public void setAnio(int anio)
         {
             anioPelicula = anio;
         }
         //metodo que devuelve la categoria
         public String getCategoria()
         {
             return categoriaPelicula;
         }
         //metodo que permite almacenar la categoria
         public void setCategoria(String categoria)
         {
             categoriaPelicula = categoria;
         }
         //metodo que devuelve la disponibilidad de la pelicula 
         public boolean getDisponibilidad()
         {
             return disponibilidadPelicula;
         }
         //metodo que envia la disponibilidad para almacenarla o la modifica
         public void setDisponibilidad(boolean dispo)
         {
             disponibilidadPelicula = dispo;
         }
         //metodo que permite mostrar informacion 
         public String getInformacionPelicula()
         {
            String infoPeli = " ID: "+idPelicula+" NOMBRE DE LA PELICULA: "+nombrePelicula+" Año: "+anioPelicula+" Categoria: "+categoriaPelicula+ " Estado de disponibilidad: "+disponibilidadPelicula;
            return infoPeli;
         }
 }
    
