// Luis Eduardo Gutiérrez 25182
// POO - Sección 10

public class Principal {
    public static void main(String[] args) {
        CentroDeEventos modelo = new CentroDeEventos(10, 20, 10);
        Controlador controlador = new Controlador(modelo);
        Vista vista = new Vista();

        // Agregar salones iniciales
        modelo.agregarSalon(new Salon(1, 50, 100.0, "Pequeño"));
        modelo.agregarSalon(new Salon(2, 100, 200.0, "Mediano"));
        modelo.agregarSalon(new Salon(3, 200, 500.0, "Grande"));
        modelo.agregarSalon(new Salon(4, 80, 150.0, "Mediano"));

        int opcion;
        do {
            opcion = vista.mostrarMenu();
            switch (opcion) {
                case 1 -> modelo.verDisponibles();
                case 2 -> {
                    Evento evento = vista.ingresarEvento();
                    controlador.procesarSolicitud(evento);
                }
                case 3 -> modelo.verReservas();
                case 4 -> modelo.verListaEspera();
                case 5 -> System.out.println("Saliendo del sistema...");
                default -> System.out.println("Opción inválida.");
            }
        } while (opcion != 5);
    }
}
