import java.util.Scanner;

public class Arrays_Ej3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double[] notas = new double[5];
        
        System.out.println("Introduce las 5 notas del alumno (0-10):");
        
        for (int i = 0; i < notas.length; i++) {
            do {
                System.out.print("Nota " + (i + 1) + ": ");
                notas[i] = teclado.nextDouble();
                
                if (notas[i] < 0 || notas[i] > 10) {
                    System.out.println("Error: La nota debe estar entre 0 y 10. Inténtalo de nuevo.");
                }
            } while (notas[i] < 0 || notas[i] > 10);
        }
        
        double suma = 0;
        double notaMaxima = notas[0];
        double notaMinima = notas[0];
        
        for (int i = 0; i < notas.length; i++) {
            suma += notas[i];
            
            if (notas[i] > notaMaxima) {
                notaMaxima = notas[i];
            }
            
            if (notas[i] < notaMinima) {
                notaMinima = notas[i];
            }
        }
        
        double media = suma / notas.length;
        
        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Todas las notas: ");
        for (int i = 0; i < notas.length; i++) {
            System.out.println("  Nota " + (i + 1) + ": " + notas[i]);
        }
        
        System.out.printf("\nNota media: %.2f%n", media);
        System.out.println("Nota más alta: " + notaMaxima);
        System.out.println("Nota más baja: " + notaMinima);
        
        teclado.close();
    }
}