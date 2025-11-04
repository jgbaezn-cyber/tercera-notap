public class Metodo5_Ej1 {
    public static void main(String[] args) {
        int numero = 5;
        cambiarValor(numero);
        System.out.println("Número después de cambiar su valor es: " + numero);
    }
    
    public static void cambiarValor(int num) {
        num = num * 2;
    }
}
