public class Salon {
    private int numero;
    private int capacidad;
    private double costoHora;
    private String tipo; 

    public Salon(int numero, int capacidad, double costoHora, String tipo) {
        this.numero = numero;
        this.capacidad = capacidad;
        this.costoHora = costoHora;
        this.tipo = tipo;
    }

    public int getNumero() { return numero; }
    public void setNumero(int numero) { this.numero = numero; }

    public int getCapacidad() { return capacidad; }
    public void setCapacidad(int capacidad) { this.capacidad = capacidad; }

    public double getCostoHora() { return costoHora; }
    public void setCostoHora(double costoHora) { this.costoHora = costoHora; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    @Override
    public String toString() {
        return "Salon #" + numero + " (" + tipo + "), Capacidad: " + capacidad + ", Costo/hora: Q" + costoHora;
    }
}
