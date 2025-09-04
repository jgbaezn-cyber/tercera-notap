import java.util.Scanner;

public class ProyectoMini {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingresa el primer número");
        double numero1 = teclado.nextDouble();

        System.out.println("Ingresa el segundo número");
        double numero2 = teclado.nextDouble();

        System.out.println("Ingresa el tercer número");
        double numero3 = teclado.nextDouble();

        double media = (numero1 + numero2 + numero3) / 3;
        System.out.println("La media es: " + media);

        teclado.close();
    }

}
