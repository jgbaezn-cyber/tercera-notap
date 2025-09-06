import java.util.Scanner;

public class ListaFrutas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("¿Cuántas frutas desea ingresar? ");
        int cantidad = scanner.nextInt();
        scanner.nextLine();
        
        String listaCompleta = ""; 
        
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Fruta N°" + (i + 1) + ": ");
            String fruta = scanner.nextLine();
            listaCompleta += (i + 1) + ". " + fruta + "\n";
        }
        
        System.out.println("== LISTADO DE FRUTAS ==");
        System.out.print(listaCompleta);

        scanner.close();
    }
}