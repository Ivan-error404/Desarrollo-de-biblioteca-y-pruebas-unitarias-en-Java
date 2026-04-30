package com.example;

public class Libro {
    private String titulo;
    private boolean prestado;

    public Libro(String titulo) {
        if (titulo == null || titulo.isBlank()) {
            this.titulo = "Título desconocido";
        } else {
            this.titulo = titulo;
        }
        this.prestado = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void prestar() {
        if (!prestado) {
            prestado = true;
        } else {
            System.out.println("El libro ya está prestado.");
        }
    }

    public void devolver() {
        if (prestado) {
            prestado = false;
        } else {
            System.out.println("El libro no está prestado.");
        }
    }
}
