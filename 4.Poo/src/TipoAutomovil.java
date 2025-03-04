public enum TipoAutomovil {
    SEDAN("Sedan", "Auto mediano", 4),
    STATION_WARGON("Station wargon" ,"Auto grande", 4),
    HATCHBACK("Hatchback","Auto compacto", 4),
    PICKUP("Pickup", "Camioneta", 4),
    COUPE("Coupe", "Auto pequeño", 2),
    CONVERTIBLE("Convertible", "Auto deportivo",2),
    FURGON("Furgon","Autoutilitario",4);

    private final String nombre;
    private final int numeroPuerta;
    private final String descripcion;

    TipoAutomovil(String nombre, String descripcion, int numeroPuerta) {
        this.nombre = nombre;
        this.numeroPuerta = numeroPuerta;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumeroPuerta() {
        return numeroPuerta;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
