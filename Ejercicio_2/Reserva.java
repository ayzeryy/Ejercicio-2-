public class Reserva {
    private Evento evento;
    private Salon salon;
    private String fecha;
    private String hora;
    private boolean confirmada;

    public Reserva(Evento evento, Salon salon, String fecha, String hora) {
        this.evento = evento;
        this.salon = salon;
        this.fecha = fecha;
        this.hora = hora;
        this.confirmada = false;
    }

    public void confirmar() { confirmada = true; }
    public void cancelar() { confirmada = false; }

    @Override
    public String toString() {
        return "Reserva: " + evento.getNombre() + " en " + salon.toString() + 
               " | " + fecha + " " + hora + " | " + (confirmada ? "CONFIRMADA" : "PENDIENTE");
    }
}
