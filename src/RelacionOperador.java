import java.util.Scanner;

public class RelacionOperador {
    public static void main(String[] args) {
         Scanner teclado = new Scanner(System.in);

        System.out.println("Ingresa el primer número");
        int numero1 = teclado.nextInt();
        System.out.println("Ingresa el segundo número");
        int numero2 = teclado.nextInt();
        System.out.println("Ingresa el tercer número");
        int numero3 = teclado.nextInt();

        boolean resultado = (numero1 > numero2) && (numero1 < numero3);

        System.out.println("¿El primer número es mayor que el segundo y menor que el tercero? " + resultado);

        teclado.close();
    }
}
