public class CuentaBancaria {
   int numeroCuenta;
   double saldo;
   String tipoCuenta;

   public CuentaBancaria() {
      int numeroCuenta;
      double saldo;
      String tipoCuenta;
   }
   public CuentaBancaria(int numeroCuenta, String tipoCuenta) {
      this.tipoCuenta = tipoCuenta;
      this.numeroCuenta = numeroCuenta;
   }

   public CuentaBancaria(int numeroCuenta, String tipoCuenta, double saldo) {
      this.tipoCuenta = tipoCuenta;
      this.numeroCuenta = numeroCuenta;
      this.saldo = saldo;
   }

   @Override
   public String toString() {
      return "El numero de cuenta es " + numeroCuenta + " Dispone de un saldo inicial de " + saldo
            + " Dolares y es una cuenta de tipo " + tipoCuenta;
   }
}
