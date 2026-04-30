package com.example;

public class Biblioteca {
    private Libro[] libros;
    private int totalLibros;

    public Biblioteca() {
        this(10);
    }

    public Biblioteca(int capacidadInicial) {
        if (capacidadInicial <= 0) {
            capacidadInicial = 10;
        }
        this.libros = new Libro[capacidadInicial];
        this.totalLibros = 0;
    }

    public void addLibro(Libro libro) {
        if (libro != null) {
            ensureCapacity();
            libros[totalLibros++] = libro;
        } else {
            System.out.println("No se puede añadir un libro nulo.");
        }
    }

    private void ensureCapacity() {
        if (totalLibros >= libros.length) {
            Libro[] nuevo = new Libro[libros.length * 2];
            System.arraycopy(libros, 0, nuevo, 0, libros.length);
            libros = nuevo;
        }
    }

    public int getTotalLibros() {
        return totalLibros;
    }

    public Libro getLibro(int indice) {
        if (indice < 0 || indice >= totalLibros) {
            System.out.println("Índice fuera de rango: " + indice);
            return null;
        }
        return libros[indice];
    }
}
// FIn  