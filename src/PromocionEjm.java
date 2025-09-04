import java.util.Scanner;

public class PromocionEjm {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        double precioCamisa = 0;
        double precioPantalon = 0;
        double totalCamisas = 0; 

        System.out.println("==PROMOCIÓN==");
        System.out.println("-Descuento del 15%-");
        System.out.println("¿Desea llevar una camisa?   SI/NO");
        String camisa = teclado.next();

        System.out.println("¿Desea llevar un pantalón?   SI/NO");
        String pantalon = teclado.next();

        if (camisa.equalsIgnoreCase("si")||
        camisa.equalsIgnoreCase("s")){
            precioCamisa = 25*(1 - 0.15);
            System.out.println("Precio total de camisa es: " + precioCamisa);
            totalCamisas = precioCamisa;
        } else{
            System.out.println("No hay descuento en camisa");
        }

        if (pantalon.equalsIgnoreCase("si")||
        pantalon.equalsIgnoreCase("s")){
            precioPantalon = 30*(1 - 0.15);
            System.out.println("Precio total de pantalón es: " + precioPantalon);
        } else{
            System.out.println("No hay descuento en pantalón");
        }
        System.out.println(" ");
        System.out.println("¿Desea llevar una segunda camisa?    SI/NO");
        System.out.println("Se aplicara un descuento de 5%");
        String camisa2 = teclado.next();

        if (camisa2.equalsIgnoreCase("si")||
        camisa2.equalsIgnoreCase("s")){
           double precioCamisa2 = 25*(1 - 0.05);
           totalCamisas = precioCamisa + precioCamisa2;
            System.out.println("Precio total en camisas es: " + precioCamisa2);
        } else{
            System.out.println("No hay descuento en segunda camisa");
        }

        System.out.println("-----------------------------");
        double totalPagar = precioPantalon + totalCamisas;
        System.out.println("El precio total a pagar de su compra es: " + totalPagar);

        teclado.close();
    }

}
