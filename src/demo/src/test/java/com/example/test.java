package com.example;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class test {

    @Test
    public void testBiblioteca() {
        Biblioteca biblioteca = new Biblioteca("El Quijote");
        assertEquals("El Quijote", biblioteca.getTitulo());
        assertFalse(biblioteca.isPrestado());

        biblioteca.prestar();
        assertTrue(biblioteca.isPrestado());

        biblioteca.devolver();
        assertFalse(biblioteca.isPrestado());
    }

    @Test
    public void testLibro() {
        Libro libro1 = new Libro("Cien Años de Soledad");
        assertEquals("Cien Años de Soledad", libro1.getTitulo());
        assertFalse(libro1.isPrestado());

        libro1.prestar();
        assertTrue(libro1.isPrestado());

        libro1.devolver();
        assertFalse(libro1.isPrestado());
    }
}
//Fin    