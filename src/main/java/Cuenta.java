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

    private boolean isValidMoneyAndBalance(int dinero) {
        return saldo > 0 && dinero > 0;
    }

    public boolean ingreso(int dinero) {
        if (isValidMoneyAndBalance(dinero)){
            saldo += dinero;
            return true;
        }
        return false;
    }

    public boolean reintegro(int dinero){
        if (isValidMoneyAndBalance(dinero)){
            saldo -= dinero;
            return true;
        }
        return false;
    }

    public String obtainSaldo() {
        return "El saldo es: " + this.saldo;
    }

    public void transferencia(Cuenta destino, int money) {
        if (this.saldo > money) {
            destino.ingreso(money);
            reintegro(money);
        }
    }

    @Override
    public String toString() {
        return "Datos de la cuenta{" +
                "nombre del titular='" + nombre + '\'' +
                ", numero de cuenta='" + numeroCuenta + '\'' +
                ", tipo de Interes=" + tipoInteres +
                ", saldo=" + saldo +
                '}';
    }
}
