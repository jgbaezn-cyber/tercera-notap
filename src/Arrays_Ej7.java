import java.util.Scanner;

public class Arrays_Ej7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] vector1 = new int[5];
        int[] vector2 = new int[5];
        int[] vector3 = new int[5];
        
        System.out.println("Ingresa los valores para los vectores:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Vector1[" + i + "] = ");
            vector1[i] = teclado.nextInt();
            System.out.print("Vector2[" + i + "] = ");
            vector2[i] = teclado.nextInt();
            System.out.println();
        }
        
        System.out.println("=== CÁLCULO DE LA SUMA ===");
        for (int i = 0; i < 5; i++) {
            vector3[i] = vector1[i] + vector2[i];
            System.out.println("Vector3[" + i + "] = " + vector1[i] + " + " + vector2[i] + " = " + vector3[i]);
        }
        
        System.out.println("\n=== VECTORES COMPLETOS ===");
        System.out.print("Vector1: [");
        for (int i = 0; i < 5; i++) {
            System.out.print(vector1[i] + (i < 4 ? ", " : ""));
        }
        System.out.println("]");
        
        System.out.print("Vector2: [");
        for (int i = 0; i < 5; i++) {
            System.out.print(vector2[i] + (i < 4 ? ", " : ""));
        }
        System.out.println("]");
        
        System.out.print("Vector3: [");
        for (int i = 0; i < 5; i++) {
            System.out.print(vector3[i] + (i < 4 ? ", " : ""));
        }
        System.out.println("]");
        
        teclado.close();
    }
}