public class Libro {
    String autor = "howard phillip lovecraft";
    String titulo = "las montañas de la locura";
    int numeroPaginas = 152;

    public Libro() {
        String autor;
        String titulo;
        int numeroPaginas;
    }

    public Libro(String autor, String titulo, int numeroPaginas) {
        this.autor = "howard phillip lovecraft";
        this.titulo = "las montañas de la locura";
        this.numeroPaginas = 152;
    }

    public static void main(String[] args) {
        Libro datosLibro = new Libro();
        System.out.println(
                "Los detalles del libro son: " + datosLibro.titulo + " el nombre del autor es " + datosLibro.autor
                        + " y el numero de paginas son " + datosLibro.numeroPaginas);
    }
}
