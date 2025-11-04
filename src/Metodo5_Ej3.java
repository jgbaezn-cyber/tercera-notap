class Estudiante {
    String nombre;
}

public class Metodo5_Ej3 {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante();
        estudiante1.nombre = "Camila";
        crearNuevoEstudiante(estudiante1);
        System.out.println("Nombre después de crear nuevo: " + estudiante1.nombre);
    }
    
    public static void crearNuevoEstudiante(Estudiante estudiante2) {
        estudiante2 = new Estudiante();
        estudiante2.nombre = "Pablito";
    }
}
