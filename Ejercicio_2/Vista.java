import java.util.Scanner;

public class Vista {
    private Scanner sc = new Scanner(System.in);

    public int mostrarMenu() {
        System.out.println("\n--- MENÚ CENTRO DE EVENTOS ---");
        System.out.println("1. Ver salones disponibles");
        System.out.println("2. Hacer una reserva");
        System.out.println("3. Ver reservas confirmadas");
        System.out.println("4. Ver lista de espera");
        System.out.println("5. Salir");
        System.out.print("Seleccione una opción: ");
        return sc.nextInt();
    }

    public Evento ingresarEvento() {
        sc.nextLine(); // limpiar buffer
        System.out.print("Encargado: ");
        String encargado = sc.nextLine();
        System.out.print("Nombre del evento: ");
        String nombre = sc.nextLine();
        System.out.print("Tipo (Normal/VIP): ");
        String tipo = sc.nextLine();
        System.out.print("Fecha: ");
        String fecha = sc.nextLine();
        System.out.print("Hora: ");
        String hora = sc.nextLine();
        return new Evento(encargado, nombre, tipo, fecha, hora);
    }
}
