public class AsignacionVariables {
    public static void main(String[] args) throws Exception {
        int edad = 17;
        double altura = 1.65;
        String nombre = "Jerix";
        
        System.out.println("=== INFORMACIÓN DE LA PERSONA ===");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Altura: " + altura + " metros");
        System.out.println("¿Es mayor de edad? " + (edad >= 18));

    }
}
