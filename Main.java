
public class Main {
    public static void main(String[] args) {
        Libro li1 = new Libro("HP lovecraft", "Cuentos de la cima", 34);
        Estudiante es1 = new Estudiante("josh", 15, 6);
        CuentaBancaria cu1 = new CuentaBancaria(43123, "Juridica", 45);

        System.out.println(cu1);
        System.out.println(li1);
        System.out.println(es1);
    }
}
