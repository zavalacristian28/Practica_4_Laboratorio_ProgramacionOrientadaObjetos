package Practica4.app.src.main.java.practica4;

public class Main {
      public static void main(String[] args) {
        String cadena="";
        Catalogo catalogo= new Catalogo();
        Pelicula pel1= new Pelicula("Toy Story","Pixar",1997,"animacion",120);
        Pelicula pel2= new Pelicula("Cars","Pixar",2004,"animacion",130);
        Pelicula pel3= new Pelicula("shrek","DreamWorks",2001,"animacion",110);
        catalogo.agregarPelicula(pel1);
        catalogo.agregarPelicula(pel2);
        catalogo.agregarPelicula(pel3);

        System.out.println("\nBuscar pelicula por titulo:");
    
        catalogo.buscarPeliculaPorTitulo("Cars");
        if(pel1.esClasica()){
            System.out.println("La pelicula 1 es clasica");
        }else{
            System.out.println("La pelicula 1 no es clasica");
        }

        if(pel2.esClasica()){
            System.out.println("La pelicula 2 es clasica");
        }else{
            System.out.println("La pelicula 2 no es clasica");
        }
        if(pel3.esClasica()){
            System.out.println("La pelicula 3 es clasica");
        }else{
            System.out.println("La pelicula 3 no es clasica");
        }
        System.out.println("\n");
        cadena=catalogo.getPeliculas();
        System.out.println("Informacion de las peliculas guardadas \n" + cadena);

    }
}
