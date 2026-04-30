package com.example;

public class App {

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca(5);

        Libro libro1 = new Libro("Cien Años de Soledad");
        Libro libro2 = new Libro("El Quijote");

        biblioteca.addLibro(libro1);
        biblioteca.addLibro(libro2);

        System.out.println("Total de libros en la biblioteca: " + biblioteca.getTotalLibros());

        libro1.prestar();
        libro1.devolver();
    }
}
// Fin 