public class Cuenta {
    private String nombre;
    private String numeroCuenta;
    private double tipoInteres;
    private double saldo;

    public Cuenta() {
    }

    public Cuenta(String nombre, String numeroCuenta, double tipoInteres, double saldo) {
        this.nombre = nombre;
        this.numeroCuenta = numeroCuenta;
        this.tipoInteres = tipoInteres;
        this.saldo = saldo;
    }

    public Cuenta(Cuenta cuenta){
        this.nombre = cuenta.nombre;
        this.numeroCuenta = cuenta.numeroCuenta;
        this.tipoInteres = cuenta.tipoInteres;
        this.saldo = cuenta.saldo;
    }



}
