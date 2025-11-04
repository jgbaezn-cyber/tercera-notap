public class interValores {
    public static void intercambiar(int numero1, int numero2) {
        int tempA = numero1;
        numero1 = numero2;
        numero2 = tempA;
        System.out.println("Dentro del metodo:");
        System.out.println("numero1 = " + numero1 + ";    metodo2 =" + numero2);
        System.out.println("-----------------------------------");
    }

    public static void main(String[] args) {
        int numero1 = 5;
        int numero2 = 10;
        System.out.println("Antes de llamar el metodo:");
        System.out.println("numero1 = " + numero1 + ";    numero2 = " + numero2);
        System.out.println("-----------------------------------");

        intercambiar(numero1, numero2);
        System.out.println("Despues de llamar el metodo:");
        System.out.println("numero2 = " + numero1 + ";    numero2 = " + numero2);
    }
}