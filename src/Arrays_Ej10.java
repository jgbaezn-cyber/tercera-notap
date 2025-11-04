import java.util.Random;

public class Arrays_Ej10 {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] matriz = new int[5][5];
        
        System.out.println("=== MATRIZ 5x5 CON VALORES ALEATORIOS (1-10) ===");
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = random.nextInt(10) + 1;
            }
        }
        
        System.out.println("\n=== MATRIZ ===");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("%4d", matriz[i][j]);
            }
            System.out.println();
        }
        
        System.out.println("\n=== SUMA DE FILAS ===");
        int[] sumaFilas = new int[5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                sumaFilas[i] += matriz[i][j];
            }
            System.out.printf("Fila %d: %d\n", i, sumaFilas[i]);
        }
        
        System.out.println("\n=== SUMA DE COLUMNAS ===");
        int[] sumaColumnas = new int[5];
        for (int j = 0; j < 5; j++) {
            for (int i = 0; i < 5; i++) {
                sumaColumnas[j] += matriz[i][j];
            }
            System.out.printf("Columna %d: %d\n", j, sumaColumnas[j]);
        }
    }
}