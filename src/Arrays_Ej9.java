import java.util.Scanner;

public class Arrays_Ej9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] tempMinima = new double[5];
        double[] tempMaxima = new double[5];
        double[] tempMedia = new double[5];
        
        System.out.println("=== REGISTRO DE TEMPERATURAS DE 5 DÍAS ===");
        
        for (int i = 0; i < 5; i++) {
            System.out.println("\n--- Día " + (i + 1) + " ---");
            System.out.print("Temperatura mínima: ");
            tempMinima[i] = scanner.nextDouble();
            System.out.print("Temperatura máxima: ");
            tempMaxima[i] = scanner.nextDouble();
            
            tempMedia[i] = (tempMinima[i] + tempMaxima[i]) / 2;
        }
        
        System.out.println("\n=== TEMPERATURA MEDIA DE CADA DÍA ===");
        for (int i = 0; i < 5; i++) {
            System.out.printf("Día %d: %.2f°C\n", (i + 1), tempMedia[i]);
        }
        
        System.out.println("\n=== DÍAS CON MENOS TEMPERATURA ===");
        double minTemp = tempMinima[0];
        for (int i = 1; i < 5; i++) {
            if (tempMinima[i] < minTemp) {
                minTemp = tempMinima[i];
            }
        }
        
        System.out.println("Temperatura mínima registrada: " + minTemp + "°C");
        System.out.print("Días con esta temperatura: ");
        boolean hayMinimos = false;
        for (int i = 0; i < 5; i++) {
            if (tempMinima[i] == minTemp) {
                System.out.print("Día " + (i + 1) + " ");
                hayMinimos = true;
            }
        }
        System.out.println();
        
        System.out.println("\n=== BUSCAR POR TEMPERATURA MÁXIMA ===");
        System.out.print("Introduce una temperatura máxima a buscar: ");
        double tempBuscada = scanner.nextDouble();
        
        System.out.println("Días con temperatura máxima de " + tempBuscada + "°C:");
        boolean encontrado = false;
        for (int i = 0; i < 5; i++) {
            if (tempMaxima[i] == tempBuscada) {
                System.out.println("- Día " + (i + 1) + " (Mínima: " + tempMinima[i] + "°C)");
                encontrado = true;
            }
        }
        
        if (!encontrado) {
            System.out.println("No hay ningún día con esa temperatura máxima.");
        }
        
        scanner.close();
    }
}