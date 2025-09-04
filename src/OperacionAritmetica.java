import java.util.Scanner;

public class OperacionAritmetica {
    public static void main(String[] args) {
        int num1, num2;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese el primer número");
        num1 = teclado.nextInt();

        System.out.println("Ingrese el segundo número");
        num2 = teclado.nextInt();

        int suma = num1 + num2;
        int resta = num1 - num2;
        int multiplicacion = num1 * num2;
        int division = num1 / num2;
        int modulo = num1 % num2;

        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La multiplicación es: " + multiplicacion);
        System.out.println("La división es: " + division);
        System.out.println("El modulo es: " + modulo);

        teclado.close();
    }
}
