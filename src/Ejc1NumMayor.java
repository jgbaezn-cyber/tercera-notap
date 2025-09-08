import java.util.Scanner;

public class Ejc1NumMayor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingresa el primer número: ");
        int num1 = teclado.nextInt();
        System.out.print("Ingresa el segundo número: ");
        int num2 = teclado.nextInt();
        System.out.print("Ingresa el tercer número: ");
        int num3 = teclado.nextInt();

        if (num1 > num2 && num1 > num3){
            System.out.println("El número mayor es: " + num1);
        } else if (num2 > num1 && num2 > num3){
            System.out.println("El número mayor es: " + num2);
        } else {
            System.out.println("El número mayor es: " + num3);
        }

        teclado.close();
    }
}
