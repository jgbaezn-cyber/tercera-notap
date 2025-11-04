import java.util.Scanner;

public class Arrays_Ej14 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        double[] precios = new double[5];
        int[][] cantidades = new int[4][5];
        double[][] recaudacionSucursal = new double[4][5];
        
        System.out.println("=== SISTEMA DE GESTIÓN DE VENTAS ===");
        
        System.out.println("\n--- PRECIOS DE LOS ARTÍCULOS ---");
        for (int i = 0; i < 5; i++) {
            System.out.print("Precio del artículo " + (i + 1) + ": ");
            precios[i] = teclado.nextDouble();
        }
        
        System.out.println("\n--- CANTIDADES VENDIDAS ---");
        for (int sucursal = 0; sucursal < 4; sucursal++) {
            System.out.println("\nSucursal " + (sucursal + 1) + ":");
            for (int articulo = 0; articulo < 5; articulo++) {
                System.out.print("  Artículo " + (articulo + 1) + ": ");
                cantidades[sucursal][articulo] = teclado.nextInt();
                
                recaudacionSucursal[sucursal][articulo] = cantidades[sucursal][articulo] * precios[articulo];
            }
        }
        
        System.out.println("\n" + "=".repeat(50));
        System.out.println("INFORME FINAL");
        System.out.println("=".repeat(50));
        
        System.out.println("\n1. CANTIDADES TOTALES DE CADA ARTÍCULO:");
        for (int articulo = 0; articulo < 5; articulo++) {
            int totalArticulo = 0;
            for (int sucursal = 0; sucursal < 4; sucursal++) {
                totalArticulo += cantidades[sucursal][articulo];
            }
            System.out.printf("  Artículo %d: %d unidades\n", (articulo + 1), totalArticulo);
        }
        
        System.out.println("\n2. CANTIDAD DE ARTÍCULOS EN LA SUCURSAL 2:");
        int totalSucursal2 = 0;
        for (int articulo = 0; articulo < 5; articulo++) {
            totalSucursal2 += cantidades[1][articulo];
        }
        System.out.println("  Total: " + totalSucursal2 + " unidades");
        
        System.out.println("\n3. CANTIDAD DEL ARTÍCULO 3 EN LA SUCURSAL 1:");
        System.out.println("  " + cantidades[0][2] + " unidades");
        
        System.out.println("\n4. RECAUDACIÓN TOTAL DE CADA SUCURSAL:");
        double[] recaudacionTotalSucursal = new double[4];
        for (int sucursal = 0; sucursal < 4; sucursal++) {
            double totalSucursal = 0;
            for (int articulo = 0; articulo < 5; articulo++) {
                totalSucursal += recaudacionSucursal[sucursal][articulo];
            }
            recaudacionTotalSucursal[sucursal] = totalSucursal;
            System.out.printf("  Sucursal %d: $%.2f\n", (sucursal + 1), totalSucursal);
        }
        
        System.out.println("\n5. RECAUDACIÓN TOTAL DE LA EMPRESA:");
        double recaudacionTotalEmpresa = 0;
        for (int sucursal = 0; sucursal < 4; sucursal++) {
            recaudacionTotalEmpresa += recaudacionTotalSucursal[sucursal];
        }
        System.out.printf("  Total: $%.2f\n", recaudacionTotalEmpresa);
        
        System.out.println("\n6. SUCURSAL DE MAYOR RECAUDACIÓN:");
        int sucursalMayor = 0;
        double mayorRecaudacion = recaudacionTotalSucursal[0];
        for (int sucursal = 1; sucursal < 4; sucursal++) {
            if (recaudacionTotalSucursal[sucursal] > mayorRecaudacion) {
                mayorRecaudacion = recaudacionTotalSucursal[sucursal];
                sucursalMayor = sucursal;
            }
        }
        System.out.printf("  Sucursal %d con $%.2f\n", (sucursalMayor + 1), mayorRecaudacion);
        
        teclado.close();
    }
}