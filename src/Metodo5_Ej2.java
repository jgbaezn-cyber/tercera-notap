class Persona {
    String nombre;
}

public class Metodo5_Ej2 {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.nombre = "Karen";
        cambiarNombre(persona);
        System.out.println("Nombre después del cambio de nombre: " + persona.nombre);
    }

    public static void cambiarNombre(Persona persona) {
        persona.nombre = "Cecilia";
    }
}
