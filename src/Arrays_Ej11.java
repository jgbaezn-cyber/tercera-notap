public class Arrays_Ej11 {
    public static void main(String[] args) {
        int[][] diagonal = new int[5][5];
        
        System.out.println("=== MATRIZ DIAGONAL 5x5 ===");
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == j) {
                    diagonal[i][j] = 1;
                } else {
                    diagonal[i][j] = 0;
                }
            }
        }
        
        System.out.println("\nContenido de la matriz:");
        mostrarMatriz(diagonal);
    }
    
    public static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}