import java.util.Scanner;

public class Arrays_Ej6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        String[] nombresMeses = {
            "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
            "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"
        };
        
        int[] diasMeses = {
            31, 28, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31
        };
        
        System.out.print("Introduce un número de mes (1-12): ");
        int numeroMes = teclado.nextInt();
        
        if (numeroMes >= 1 && numeroMes <= 12) {
            int indice = numeroMes - 1;
              
            System.out.println("\n--- RESULTADO ---");
            System.out.println("Mes: " + nombresMeses[indice]);
            System.out.println("Días: " + diasMeses[indice]);
        } else {
            System.out.println("Error: El número debe estar entre 1 y 12.");
        }
        
        teclado.close();
    }
}