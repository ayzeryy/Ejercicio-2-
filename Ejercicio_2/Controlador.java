public class Controlador {
    private CentroDeEventos modelo;

    public Controlador(CentroDeEventos modelo) {
        this.modelo = modelo;
    }

    public void procesarSolicitud(Evento evento) {
        modelo.asignarSalon(evento);
    }

    public void mostrarEstado() {
        System.out.println("=== Salones Disponibles ===");
        modelo.verDisponibles();
        System.out.println("=== Reservas Confirmadas ===");
        modelo.verReservas();
        System.out.println("=== Lista de Espera ===");
        modelo.verListaEspera();
    }
}
