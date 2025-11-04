import java.util.Scanner;

public class Arrays_Ej8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String[] nombres = new String[100];
        int[] edades = new int[100];
        int contador = 0;
        
        System.out.println("Introduce los datos de alumnos");
        System.out.println("Introduce el siguiente simbolo para terminar: *");
        
        while (true) {
            System.out.print("Nombre: ");
            String nombre = teclado.nextLine();
            if (nombre.equals("*")) break;
            
            System.out.print("Edad: ");
            int edad = teclado.nextInt();
            teclado.nextLine();
            
            nombres[contador] = nombre;
            edades[contador] = edad;
            contador++;
        }
        
        System.out.println("\nMAYORES DE EDAD:");
        for (int i = 0; i < contador; i++) {
            if (edades[i] >= 18) {
                System.out.println(nombres[i] + " - " + edades[i] + " años");
            }
        }
        
        if (contador > 0) {
            int maxEdad = edades[0];
            for (int i = 1; i < contador; i++) {
                if (edades[i] > maxEdad) maxEdad = edades[i];
            }
            
            System.out.println("\nALUMNOS CON MÁS EDAD (" + maxEdad + " años):");
            for (int i = 0; i < contador; i++) {
                if (edades[i] == maxEdad) {
                    System.out.println(nombres[i]);
                }
            }
        }
        
        teclado.close();
    }
}