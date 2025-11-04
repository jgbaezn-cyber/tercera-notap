import java.util.Scanner;

public class Arrays_Ej13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("¿Cuántos conductores tiene la empresa? ");
        int numConductores = teclado.nextInt();
        teclado.nextLine();
        
        String[] nombres = new String[numConductores];
        double[][] kms = new double[numConductores][7];
        double[] totalKms = new double[numConductores];
        
        System.out.println("\n=== REGISTRO DE DATOS ===");
        
        for (int i = 0; i < numConductores; i++) {
            System.out.println("\n--- Conductor " + (i + 1) + " ---");
            System.out.print("Nombre: ");
            nombres[i] = teclado.nextLine();
            
            System.out.println("Kilómetros por día (Lunes a Domingo):");
            for (int dia = 0; dia < 7; dia++) {
                String nombreDia = obtenerNombreDia(dia);
                System.out.print("  " + nombreDia + ": ");
                kms[i][dia] = teclado.nextDouble();
            }
            teclado.nextLine();
        }
        
        for (int i = 0; i < numConductores; i++) {
            double total = 0;
            for (int dia = 0; dia < 7; dia++) {
                total += kms[i][dia];
            }
            totalKms[i] = total;
        }
        
        System.out.println("\n=== INFORME FINAL ===");
        System.out.println("CONDUCTOR\t\tKILÓMETROS TOTALES");
        System.out.println("----------------------------------------");
        
        for (int i = 0; i < numConductores; i++) {
            System.out.printf("%-15s\t\t%.2f km\n", nombres[i], totalKms[i]);
        }
        
        teclado.close();
    }
    
    public static String obtenerNombreDia(int dia) {
        String[] diasSemana = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
        return diasSemana[dia];
    }
}