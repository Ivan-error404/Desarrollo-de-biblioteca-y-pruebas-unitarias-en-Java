package com.example;

public class App {

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca("El Quijote");
        Libro libro1 = new Libro("Cien Años de Soledad");

        biblioteca.prestar();
        biblioteca.devolver();

        libro1.prestar();
        libro1.devolver();
    }
}
