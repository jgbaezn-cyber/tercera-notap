import java.util.Scanner;

public class ActividadDinamica {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("=== ¿CUÁL ES EL NÚMERO MÁS GRANDE? ===");
        
        System.out.print("Ingresa el primer número: ");
        int num1 = teclado.nextInt();
        
        System.out.print("Ingresa el segundo número: ");
        int num2 = teclado.nextInt();
        
        System.out.print("Ingresa el tercer número: ");
        int num3 = teclado.nextInt();
        
        int maximo = encontrarMaximo(num1, num2, num3);
        System.out.println("-----------------------"); 
        System.out.println(" ");       
        System.out.println("Resultado");
        System.out.println("El número más grande es: " + maximo);

        teclado.close();
    }
    
    public static int encontrarMaximo(int a, int b, int c) {

        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        }
    }
}