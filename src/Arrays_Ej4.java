import java.util.Scanner;

public class Arrays_Ej4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] vector = new int[10];
        int elementosIntroducidos = 0;
        
        System.out.println("Introduce números enteros (máximo 10). Introduce un negativo para terminar:");
        
        for (int i = 0; i < vector.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            int numero = teclado.nextInt();
            
            if (numero < 0) {
                System.out.println("Es un número negativo. Terminando programa..");
                break;
            }
            
            vector[i] = numero;
            elementosIntroducidos++;
        }
        
        System.out.println("\n--- ELEMENTOS INTRODUCIDOS ---");
        if (elementosIntroducidos == 0) {
            System.out.println("No se introdujeron números positivos.");
        } else {
            for (int i = 0; i < elementosIntroducidos; i++) {
                System.out.println("Posición " + i + ": " + vector[i]);
            }
        }
        
        System.out.println("Total de números introducidos: " + elementosIntroducidos);
        teclado.close();
    }
}