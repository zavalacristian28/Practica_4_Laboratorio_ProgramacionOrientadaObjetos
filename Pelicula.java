package Practica4.app.src.main.java.practica4;

public class Pelicula {
     //atributos
    private String titulo; //nombre de la pelicula
    private String director; // nombre del director
    private int estreno; //año de estreno
    private String genero; //genero de la pelicula
    private int duracion; //duracion en minutos
    //constructor vacio inicializa los atributos
    public Pelicula(){
        titulo=" ";
        director=" ";
        estreno=1;
        genero=" ";
        duracion=1;
    }
    //constructor que recibe parametros
    public Pelicula(String titulo, String director, int estreno, String genero, int duracion){
        this.titulo=titulo;
        this.director=director;
        this.estreno=estreno;
        this.genero=genero;
        this.duracion=duracion;
    }
    //metodos getters
    public String getTitulo(){
        return titulo;
    }
    public String getDirector(){
        return director;
    }
    public int getEstreno(){
        return estreno;
    }
    public String getGenero(){
        return genero;
    }
    public int getDuracion(){
        return duracion;
    }
    //metodos setters
    public void setTitulo(String titulo){
        this.titulo=titulo;
    }
    public void setDirector(String director){
        this.director=director;
    }
    public void setEstreno(int estreno){
        this.estreno=estreno;
    }
    public void setGenero(String genero){
        this.genero=genero;
    }
    public void setDuracion(int duracion){
        this.duracion=duracion;
    }

    //METODOS

    //metodo que comprubea si tiene mas de 25 años
    //resta 2026 al año de estreno despues retorna el valor booleano de acuerdo a la comparacion
    public boolean esClasica(){
        int cant;
        cant=2026- estreno;
            return cant>25;
    }
    //forma de representar la informacion de una pelicula
    public String getInformacion(){
        return "Título: " + titulo + ", Director: " + director + ", Año: " + estreno +
           ", Género: " + genero + ", Duración: " + duracion + " min";
    }
    //metodo toString
    public String toString(){
       return "Nombre: " + titulo + "\n" +
           "Director: " + director + "\n" +
           "Año de estreno: " + estreno + "\n" +
           "Género: " + genero + "\n" +
           "Duración: " + duracion + " min\n";
    }   
}
