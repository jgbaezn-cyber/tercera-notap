import java.util.Scanner;

public class Ejc3Menu {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);

        System.out.println("Ingresa la operación de su elección");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");

        int operacion = teclado.nextInt();
         
        if (operacion == 1 || operacion == 2 || operacion ==3 || operacion == 4 ){
        System.out.println("Ingresa el primer número");
        int num1 = teclado.nextInt();
        System.out.println("Ingresa el segundo número");
        int num2 = teclado.nextInt();

        switch (operacion) {
            case 1:
                System.out.println("El resultado es: " + (num1 + num2));
                break;
            case 2:
                System.out.println("El resultado es: " + (num1 - num2));
                break;
            case 3:
                System.out.println("El resultado es: " + (num1 * num2));
                break;
            case 4:
            if (num2 != 0){
                System.out.println("El resultado es: " + (num1 / num2));
            } else {
                System.out.println("Error: División por cero");
            }
                break;
        }
        } else {
             System.out.println("Opción no válida, intente nuevamente");

        }
        teclado.close();
    }
}