import java.util.Scanner;

public class Arrays_Ej15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[][] equipos = new String[15][2]; // 15 partidos x 2 equipos
        int[][] resultados = new int[15][2];    // 15 partidos x 2 resultados (goles)
        char[] quiniela = new char[15];         // 15 resultados de quiniela (1, X, 2)
        
        System.out.println("=== GESTIÓN DE QUINIELA DE FÚTBOL ===");
        System.out.println("Introduce los datos de los 15 partidos:\n");
        
        for (int partido = 0; partido < 15; partido++) {
            System.out.println("--- Partido " + (partido + 1) + " ---");
            
            System.out.print("Equipo local: ");
            equipos[partido][0] = scanner.nextLine();
            
            System.out.print("Equipo visitante: ");
            equipos[partido][1] = scanner.nextLine();
            
            System.out.print("Goles del equipo local (" + equipos[partido][0] + "): ");
            resultados[partido][0] = scanner.nextInt();
            
            System.out.print("Goles del equipo visitante (" + equipos[partido][1] + "): ");
            resultados[partido][1] = scanner.nextInt();
            scanner.nextLine();
            
            System.out.println();
        }
        
        for (int partido = 0; partido < 15; partido++) {
            if (resultados[partido][0] > resultados[partido][1]) {
                quiniela[partido] = '1'; // Victoria local
            } else if (resultados[partido][0] < resultados[partido][1]) {
                quiniela[partido] = '2'; // Victoria visitante
            } else {
                quiniela[partido] = 'X'; // Empate
            }
        }
        
        System.out.println("\n" + "=".repeat(80));
        System.out.println("RESULTADOS COMPLETOS DE LA QUINIELA");
        System.out.println("=".repeat(80));
        
        System.out.printf("%-4s %-25s %-25s %-10s %-6s%n", 
                         "Nº", "EQUIPO LOCAL", "EQUIPO VISITANTE", "RESULTADO", "QUINIELA");
        System.out.println("-".repeat(80));
        
        for (int partido = 0; partido < 15; partido++) {
            System.out.printf("%-4d %-25s %-25s %d - %-6d %-6c%n",
                            (partido + 1),
                            equipos[partido][0],
                            equipos[partido][1],
                            resultados[partido][0],
                            resultados[partido][1],
                            quiniela[partido]);
        }
        
        mostrarEstadisticas(quiniela, equipos, resultados);
        
        scanner.close();
    }
    
    public static void mostrarEstadisticas(char[] quiniela, String[][] equipos, int[][] resultados) {
        System.out.println("\n" + "=".repeat(50));
        System.out.println("ESTADÍSTICAS");
        System.out.println("=".repeat(50));
        
        int victoriasLocal = 0, empates = 0, victoriasVisitante = 0;
        
        for (int i = 0; i < 15; i++) {
            switch (quiniela[i]) {
                case '1': victoriasLocal++; break;
                case 'X': empates++; break;
                case '2': victoriasVisitante++; break;
            }
        }
        
        System.out.println("\nDistribución de resultados:");
        System.out.println("1 (Victoria local): " + victoriasLocal);
        System.out.println("X (Empate): " + empates);
        System.out.println("2 (Victoria visitante): " + victoriasVisitante);
        
        int maxGoles = 0;
        int partidoMasGoles = 0;
        for (int i = 0; i < 15; i++) {
            int totalGoles = resultados[i][0] + resultados[i][1];
            if (totalGoles > maxGoles) {
                maxGoles = totalGoles;
                partidoMasGoles = i;
            }
        }
        
        System.out.println("\nPartido con más goles:");
        System.out.println(equipos[partidoMasGoles][0] + " " + resultados[partidoMasGoles][0] + " - " + 
                          resultados[partidoMasGoles][1] + " " + equipos[partidoMasGoles][1] + 
                          " (" + maxGoles + " goles)");
        
        System.out.println("\nCOMBINACIÓN DE LA QUINIELA:");
        System.out.print("| ");
        for (int i = 0; i < 15; i++) {
            System.out.print(quiniela[i] + " | ");
        }
        System.out.println();
    }
}