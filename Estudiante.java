public class Estudiante {
    String nombre;
    int Edad;
    int curso;

    public Estudiante() {
        String nombre;
        int Edad;
        int curso;
    }

    public Estudiante(String nombre, int Edad) {
        this.nombre = nombre;
        this.Edad = Edad;
    }

    public Estudiante(String nombre, int Edad, int curso) {
        this(nombre, Edad);
        this.curso = 7;
    }
}
