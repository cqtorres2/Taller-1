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
        this.curso = curso;
    }
    @Override
    public String toString() {
        return "El nombre del estudiante es " + nombre + " tiene " + Edad + " años y asiste a " + curso + " grado";
    }
}
