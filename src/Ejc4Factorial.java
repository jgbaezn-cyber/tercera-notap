import java.util.Scanner;

public class Ejc4Factorial {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese un número");
        int numero = teclado.nextInt();

        int factorial = 1;
        int i = 1;

        while (i <= numero) {
            factorial *= i;
            i++;
        }

        System.out.println("El factorial de " + numero + " es: " + factorial);

        teclado.close();
    }
}
