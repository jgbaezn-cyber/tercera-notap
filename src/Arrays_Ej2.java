import java.util.Scanner;

public class Arrays_Ej2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String[] vectorOriginal = new String[5];
        String[] vectorInverso = new String[5];
        
        System.out.println("Introduce 5 cadenas de caracteres:");
        
        for (int i = 0; i < vectorOriginal.length; i++) {
            System.out.print("Cadena " + (i + 1) + ": ");
            vectorOriginal[i] = teclado.nextLine();
        }
        
        for (int i = 0; i < vectorOriginal.length; i++) {
            vectorInverso[i] = vectorOriginal[vectorOriginal.length - 1 - i];
        }
        
        System.out.println("\n--- VECTOR ORIGINAL ---");
        for (int i = 0; i < vectorOriginal.length; i++) {
            System.out.println("Posición " + i + ": " + vectorOriginal[i]);
        }
        
        System.out.println("\n--- VECTOR INVERSO ---");
        for (int i = 0; i < vectorInverso.length; i++) {
            System.out.println("Posición " + i + ": " + vectorInverso[i]);
        }
        
        teclado.close();
    }
}