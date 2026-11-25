public class main {
    public static void main(String[] args) {
        ProyectoSoftware proyecto = new ProyectoSoftware("Sistema de ventas", "Empresa ABC");

        System.out.println("Fase actual: " + proyecto.obtenerEstado());

        proyecto.avanzarFase();
        System.out.println("Fase actual: " + proyecto.obtenerEstado());

        proyecto.avanzarFase();
        System.out.println("Fase actual: " + proyecto.obtenerEstado());
    }
}
