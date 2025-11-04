public class MetodoPasoPorValor {

    public static int incrementar(int numero) {
        numero += 1;
        System.out.println("Dentro del método: x = " + numero);
        return numero;
    }

    public static void main(String[] args) {
        int numero = 5;
        System.out.println("Antes de llamar al método: x = " + numero);
        numero = incrementar(numero);
        System.out.println("Después de llamar al método: x = " + numero);
    }
}
