import java.util.Scanner;

public class Ejc5Tablas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese un número");
        int numero = teclado.nextInt();

        System.out.println("== TABLA DEL " + numero + " ==");

        for (int i = 1; i <= 10; i++){
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
        teclado.close();
    }
}
