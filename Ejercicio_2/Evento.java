public class Evento {
    private String encargado;
    private String nombre;
    private String tipo; 
    private String fecha;
    private String hora;

    public Evento(String encargado, String nombre, String tipo, String fecha, String hora) {
        this.encargado = encargado;
        this.nombre = nombre;
        this.tipo = tipo;
        this.fecha = fecha;
        this.hora = hora;
    }

    public String getEncargado() { return encargado; }
    public void setEncargado(String encargado) { this.encargado = encargado; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public String getFecha() { return fecha; }
    public void setFecha(String fecha) { this.fecha = fecha; }

    public String getHora() { return hora; }
    public void setHora(String hora) { this.hora = hora; }

    @Override
    public String toString() {
        return "Evento: " + nombre + " (" + tipo + "), Encargado: " + encargado + ", Fecha: " + fecha + " " + hora;
    }
}
