public class CuentaBancaria {
    int numeroCuenta;
    double saldo;
    Boolean tipoCuenta;
 public CuentaBancaria(){
    int numeroCuenta;
    double saldo;
    //Boolean es para persona juridica o persona natural //
    boolean tipoCuenta;
 }
 public CuentaBancaria(int numeroCuenta, boolean tipoCuenta){
    this.tipoCuenta = tipoCuenta;
    this.numeroCuenta = numeroCuenta;
 }
 public CuentaBancaria(int numeroCuenta, boolean tipoCuenta, double saldo){
    this.tipoCuenta = true;
    this.numeroCuenta = 34123;
    this.saldo = 45;
 }
}
