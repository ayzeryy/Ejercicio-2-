public class CentroDeEventos {
    private Salon[] salones;
    private Reserva[] reservas;
    private Evento[] listaEspera;
    private int countSalones;
    private int countReservas;
    private int countEspera;

    public CentroDeEventos(int maxSalones, int maxReservas, int maxEspera) {
        salones = new Salon[maxSalones];
        reservas = new Reserva[maxReservas];
        listaEspera = new Evento[maxEspera];
        countSalones = 0;
        countReservas = 0;
        countEspera = 0;
    }

    public void agregarSalon(Salon salon) {
        if (countSalones < salones.length) {
            salones[countSalones++] = salon;
        }
    }

    public void recibirEvento(Evento evento) {
        if (countEspera < listaEspera.length) {
            listaEspera[countEspera++] = evento;
        }
    }

    public void asignarSalon(Evento evento) {
        for (int i = 0; i < countSalones; i++) {
            Salon s = salones[i];
            if (s != null) {
                if (s.getTipo().equals("Grande") && evento.getTipo().equals("Normal")) {
                    continue; // regla: Grandes solo VIP
                }
                // regla: fecha/hora disponibles
                boolean ocupado = false;
                for (int j = 0; j < countReservas; j++) {
                    if (reservas[j].toString().contains(evento.getFecha()) && 
                        reservas[j].toString().contains(evento.getHora())) {
                        ocupado = true;
                        break;
                    }
                }
                if (!ocupado && countReservas < reservas.length) {
                    reservas[countReservas++] = new Reserva(evento, s, evento.getFecha(), evento.getHora());
                    reservas[countReservas - 1].confirmar();
                    return;
                }
            }
        }
        recibirEvento(evento); 
    }

    public void verDisponibles() {
        for (int i = 0; i < countSalones; i++) {
            System.out.println(salones[i]);
        }
    }

    public void verReservas() {
        for (int i = 0; i < countReservas; i++) {
            System.out.println(reservas[i]);
        }
    }

    public void verListaEspera() {
        for (int i = 0; i < countEspera; i++) {
            System.out.println(listaEspera[i]);
        }
    }
}
