public class ProyectoSoftware {
    private String nombreProyecto;
    private String clienteEmpresa;
    private int faseActual;

    public ProyectoSoftware(String nombreProyecto, String clienteEmpresa) {
        this.nombreProyecto = nombreProyecto;
        this.clienteEmpresa = clienteEmpresa;
        this.faseActual = 1;
    }

    public void avanzarFase() {
        if (faseActual < 3) {
            faseActual++;
        }
    }

    public String obtenerEstado() {
        if (faseActual == 1) {
            return "Analisis";
        } else if (faseActual == 2) {
            return "Desarrollo";
        } else {
            return "Despliegue";
        }
    }
}
