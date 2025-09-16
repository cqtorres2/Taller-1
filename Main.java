import java.io.File;

public class Main {
    File file = new File("Estudiante.java");
    File file2 = new File("Libro.java");
    File file3 = new File("CuentaBancaria.java");
    String editorial;
    int carnet;
    String nombreBanco;

    public Main(String editorial, int carnet, String nombreBanco) {
        this.editorial = "Austral";
        this.carnet = 10334;
        this.nombreBanco = "Bancolombia";
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }
}
