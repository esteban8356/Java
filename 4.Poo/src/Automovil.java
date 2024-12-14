public class Automovil {

    String fabricante;
    String modelo;
    String color = "gris";
    double cilindrada;

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

}
