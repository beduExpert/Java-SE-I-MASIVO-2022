package org.bedu.java.jse.basico.sesion1.ejemplo4;

    public class Libro {
        private String titulo;
        private Autor autor;
        private int numeroPaginas;

        public String getTitulo() {
            return titulo;
        }

        public void setTitulo(String titulo) {
            this.titulo = titulo;
        }

        public Autor getAutor() {
            return autor;
        }

        public void setAutor(Autor autor) {
            this.autor = autor;
        }

        public int getNumeroPaginas() {
            return numeroPaginas;
        }

        public void setNumeroPaginas(int numeroPaginas) {
            this.numeroPaginas = numeroPaginas;
        }
    }
