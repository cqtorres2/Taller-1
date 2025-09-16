public class Libro {
    String autor;
    String titulo;
    int numeroPaginas;

    public Libro() {
        String autor;
        String titulo;
        int numeroPaginas;
    }

    public Libro(String autor, String titulo, int numeroPaginas) {
        this.autor = autor;
        this.titulo = titulo;
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public String toString() {
        return "Los detalles del libro son: " + titulo + " el nombre del autor es " + autor
                + " y el numero de paginas son " + numeroPaginas;
    }

    public static void main(String[] args) {
        Libro datosLibro = new Libro();
        System.out.println(
                "Los detalles del libro son: " + datosLibro.titulo + " el nombre del autor es " + datosLibro.autor
                        + " y el numero de paginas son " + datosLibro.numeroPaginas);
    }
}
