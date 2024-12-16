public class Automovil {

    private String fabricante;
    private String modelo;
    private Color color = Color.GRIS;
    private double cilindrada;
    private int capacidadTanque = 40;

    private TipoAutomovil tipo;

    public static final Integer VELOCIDAD_MAX_CARRETERA = 120;
    public static final int VELOCIDAD_MAX_CIUDAD = 60;


    static Color colorPatente = Color.NARANJA;

    public Automovil() {
    }

    // constructor

    public Automovil(String fabricante, String modelo) {
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    public Automovil(String fabricante, String modelo, Color color) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.color = color;
    }

    public Automovil(String fabricante, String modelo, Color color, double cilindrada) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.color = color;
        this.cilindrada = cilindrada;
    }

    public Automovil(String fabricante, String modelo, Color color, double cilindrada, int capacidadTanque) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.color = color;
        this.cilindrada = cilindrada;
        this.capacidadTanque = capacidadTanque;
    }

    public String verDetalle() {

        return "automovil.fabricante = " + this.fabricante +
                "\nautomovil.modelo = " + this.modelo +
                "\nautomovil.tipo = " + this.getTipo().getDescripcion() +
                "\nautomovil.color = " + this.color.getColor() +
                "\nautomovil.colorPatente = " + colorPatente.getColor() +
                "\nautomovil.cilindrada = " + this.cilindrada;
    }

    public String acelerar(int rpm) {
        return "auto " + this.fabricante + " acelerado a " + rpm + " RPM";
    }

    public String frenar() {
        return "auto " + this.fabricante + " frenando";
    }

    public float calcularConsumo(int km,float porcentajeGasolina){
        return km / (capacidadTanque * porcentajeGasolina);
    }

    public TipoAutomovil getTipo() {
        return tipo;
    }

    public void setTipo(TipoAutomovil tipo) {
        this.tipo = tipo;
    }

    public float calcularConsumo(int km, int porcentajeGasolina){
        return km / (capacidadTanque * (porcentajeGasolina/100f));
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    public int getCapacidadTanque() {
        return capacidadTanque;
    }

    public void setCapacidadTanque(int capacidadTanque) {
        this.capacidadTanque = capacidadTanque;
    }

    @Override
    public boolean equals(Object obj) {
        Automovil a =(Automovil)obj;
        return (this.fabricante != null && this.modelo !=null && this.fabricante.equals(a.getFabricante()) && this.modelo.equals(a.getModelo()));
    }

    @Override
    public String toString() {
        return "Automovil{" +
                "fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", colorPatente='" + colorPatente + '\'' +
                ", cilindrada=" + cilindrada +
                ", capacidadTanque=" + capacidadTanque +
                '}';
    }
}
