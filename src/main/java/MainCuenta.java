import java.util.Scanner;

public class MainCuenta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre, numero;
        double tipo, importe;

//se crea objeto cuenta1 sin parámetros
//se ejecuta el constructor por defecto

        System.out.print("Nombre : ");
        nombre = sc.nextLine();
        System.out.print("Número de cuenta : ");
        numero = sc.nextLine();
        System.out.print("Tipo de interes : ");
        tipo = sc.nextDouble();
        System.out.print("Saldo: ");
        importe = sc.nextDouble();

        Cuenta cuenta1 = new Cuenta(nombre, numero, tipo, importe);

//se crea el objeto cuenta2 con los valores leidos por teclado
//se ejecuta el constructor con parámetros
        Cuenta cuenta2 = new Cuenta("Juan Ferrández Rubio", "12345678901234567890", 1.75, 300);

//se crea cuenta3 como copia de cuenta1
//se ejecuta el constructor copia
        Cuenta cuenta3 = new Cuenta(cuenta1);

//mostrar los datos de cuenta1
        System.out.println(cuenta1.toString());
        System.out.println();

//se realiza un ingreso en cuenta1
        cuenta1.ingreso(4000);

//mostrar el saldo de cuenta1 después del ingreso
        System.out.println("Saldo: " + cuenta1.obtainSaldo());

//mostrar los datos de cuenta2
        System.out.println("Saldo: " + cuenta2.toString());
        System.out.println();

//mostrar los datos de cuenta3
        System.out.println(cuenta3.toString());
        System.out.println();

//realizar una transferencia de 10€ desde cuenta3 a cuenta2
        cuenta3.transferencia(cuenta2, 10);

//mostrar el saldo de cuenta2
        System.out.println("Saldo de la cuenta 2");
        System.out.println("Saldo: " + cuenta2.obtainSaldo());
        System.out.println();

//mostrar el saldo de cuenta3
        System.out.println("Saldo de la cuenta 3");
        System.out.println("Saldo: " + cuenta3.obtainSaldo());
        System.out.println();
    }
}
