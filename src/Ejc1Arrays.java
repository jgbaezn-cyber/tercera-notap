import java.util.Scanner;
    public class Ejc1Arrays {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double[] numeros = new double[5];
        int suma = 0;

        System.out.println("Ingresa cinco números");

        for (int i  = 0; i < 5; i++ ){
            System.out.print("- Número "+ (i+1) + ": ");
            numeros[i] = teclado.nextDouble();
            suma += numeros [i];
        }

        double promedio = suma/5;
        System.out.println("El promedio es: " + promedio);

        teclado.close();
    }
}
