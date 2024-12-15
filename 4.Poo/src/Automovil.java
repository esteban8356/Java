public class Automovil {

    private String fabricante;
    private String modelo;
    private String color = "gris";
    private double cilindrada;
    private int capacidadTanque = 40;

    public Automovil() {
    }

    // constructor

    public Automovil(String fabricante, String modelo) {
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    public Automovil(String fabricante, String modelo, String color) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.color = color;
    }

    public Automovil(String fabricante, String modelo, String color, double cilindrada) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.color = color;
        this.cilindrada = cilindrada;
    }

    public Automovil(String fabricante, String modelo, String color, double cilindrada, int capacidadTanque) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.color = color;
        this.cilindrada = cilindrada;
        this.capacidadTanque = capacidadTanque;
    }

    public String verDetalle() {

        return "automovil.fabricante = " + this.fabricante +
                "\nautomovil.modelo = " + this.modelo +
                "\nautomovil.color = " + this.color +
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

    public float calcularConsumo(int km,int porcentajeGasolina){
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
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

}
