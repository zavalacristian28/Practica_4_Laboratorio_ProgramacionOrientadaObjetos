package Practica4.app.src.main.java.practica4;

import java.util.ArrayList;

public class Catalogo {
     //atributo de la clase, se trata de un arreglo de objetos de tipo pelicula
    ArrayList<Pelicula> pelicula;
    //se crea un objeto de la clase Pelicula
    Pelicula pelicula_obj;

    //constructor vacio inicializa el ArrayList
    public Catalogo(){
        pelicula= new ArrayList<>();
    }
    //METODOS
    //este metodo agrega una pelicula al arreglo, recibe un objeto como parametro
    public void agregarPelicula(Pelicula pelicula_obj){
         pelicula.add(pelicula_obj);
    
    }
    //este metodo recibe un String como parametro, que se trata del titulo 
    // de la pelicula que se quiere buscar, si se encuentra se mostrara
    // su informacion
    public String buscarPeliculaPorTitulo(String titulo){
        for(int x=0; x<pelicula.size(); x++){
            if(pelicula.get(x).getTitulo().equalsIgnoreCase(titulo)){
                return pelicula.get(x).toString();
            }
        }
        return "No se encontró la película con título: Titanic";
    }
    //forma de representar la informacion de las peliculas guardadas
    public String getPeliculas(){
        String cadena="";
        int x;
        if(pelicula.size()==0){
            return "El catálogo está vacío";
        }else{
        for(x=0;x<pelicula.size();x++){
            cadena=cadena + pelicula.get(x).toString() + "\n";
            }
        return cadena;
        }
    }
    @Override
    public String toString(){
        return getPeliculas();
    }

    //Este metodo se agrego para la practica 4
    public int getNumeroPeliculas(){
        return pelicula.size();
    }
}
