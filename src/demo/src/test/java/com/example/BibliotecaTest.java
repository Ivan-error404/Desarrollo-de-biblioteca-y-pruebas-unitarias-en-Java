
package com.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class BibliotecaTest {

    @Test
    public void libroReciénCreadoTieneTituloCorrectoYNoEstaPrestado() {
        Libro libro = new Libro("Cien Años de Soledad");

        assertEquals("Cien Años de Soledad", libro.getTitulo());
        assertFalse(libro.isPrestado());
    }

    @Test
    public void prestarLibroCambiaEstadoA_prestado() {
        Libro libro = new Libro("El Quijote");

        libro.prestar();

        assertTrue(libro.isPrestado());
    }

    @Test
    public void prestarLibroYaPrestadoNoCambiaElEstado() {
        Libro libro = new Libro("El Quijote");
        libro.prestar();

        libro.prestar();

        assertTrue(libro.isPrestado());
    }

    @Test
    public void devolverLibroPrestadoCambiaEstadoANoPrestado() {
        Libro libro = new Libro("Cien Años de Soledad");
        libro.prestar();

        libro.devolver();

        assertFalse(libro.isPrestado());
    }

    @Test
    public void devolverLibroNoPrestadoNoCambiaElEstado() {
        Libro libro = new Libro("Cien Años de Soledad");

        libro.devolver();

        assertFalse(libro.isPrestado());
    }

    @Test
    public void bibliotecaAñadeLibroYCuentaCorrectamente() {
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.addLibro(new Libro("Cien Años de Soledad"));

        assertEquals(1, biblioteca.getTotalLibros());
    }

    @Test
    public void bibliotecaCuentaDosLibrosTrasAñadirDosLibros() {
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.addLibro(new Libro("Cien Años de Soledad"));
        biblioteca.addLibro(new Libro("El Quijote"));

        assertEquals(2, biblioteca.getTotalLibros());
    }
}
