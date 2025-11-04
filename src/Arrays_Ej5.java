import java.util.Arrays;
import java.util.Random;

public class Arrays_Ej5 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] vector = new int[10];
        
        System.out.println("Generando números aleatorios...");
        for (int i = 0; i < vector.length; i++) {
            vector[i] = random.nextInt(100) + 1;
        }
        
        System.out.println("\n===VECTOR ORIGINAL===");
        System.out.println(Arrays.toString(vector));
        
        ordenarBurbuja(vector);
        
        System.out.println("\n===VECTOR ORDENADO DE MENOR A MAYOR===");
        System.out.println(Arrays.toString(vector));
    }
    
    public static void ordenarBurbuja(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}