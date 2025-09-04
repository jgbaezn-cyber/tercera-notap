public class ProBancoEjm {
    public static void main(String[] args) {
        final double BANCO = 1000;
        final double RETIRO = 200;
        final int SEMANAS = 4;

        System.out.println("== CUENTA BANCARIA ==");
        System.out.println("Saldo actual: " + BANCO);
        System.out.println("Retiro semanal de: " + RETIRO);
        System.out.println(" ");
        System.out.println("-----------------------");

        double dineroRetirado = RETIRO * SEMANAS;
        double dineroSobrante = BANCO - dineroRetirado;

        System.out.println("== ACTUALIZACIÓN ==");
        System.out.println("Movimiento de 4 semanas");
        System.out.println("Total retirado: " + dineroRetirado);
        System.out.println("Saldo actual: " + dineroSobrante );
    }

}
