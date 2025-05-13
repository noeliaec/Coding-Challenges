package org.challenges;

public class Ejercicio9 {
    public static void main (String[] args){
        Libro libro = new Libro("Orgullo y prejuicio", "Jane Austen", 352);

        System.out.println("Título: "+libro.titulo);
        System.out.println("Autor: "+libro.autor);
        System.out.println("Páginas: "+libro.paginas);
        libro.mostrarDescripcion();

        System.out.println("Páginas por leer: "+libro.paginasRestante());

        if (libro.esLargo()){
            System.out.println("El libro es largo");
        } else {
            System.out.println("El libro es corto");
        }
    }
}

class Libro {
    String titulo;
    String autor;
    int paginas;

    public Libro (String titulo, String autor, int paginas){
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

     void mostrarDescripcion(){
        System.out.println("\"Orgullo y Prejuicio\" es una novela de Jane Austen que narra la historia de amor entre Elizabeth Bennet y el Sr. Darcy, quienes deben superar sus prejuicios iniciales y la influencia de la sociedad para encontrar la felicidad");
     }

     boolean esLargo(){
        return paginas >=300;
     }

    public int paginasRestante() {
        int leidas = 100;
        return paginas - leidas;
    }
}