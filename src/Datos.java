import java.util.Scanner;

public class Datos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingresa tu nombre: ");
        String nombre = teclado.nextLine();

        System.out.println("Ingresa tu edad: ");
        int edad = teclado.nextInt();

        System.out.println("Ingresa tu altura en metros: ");
        double altura = teclado.nextDouble();

        System.out.println("Gusto es concerte " + nombre + ". Tienes " + edad + " años y mides " + altura + " metros.");
        
        teclado.close();
    }
}
