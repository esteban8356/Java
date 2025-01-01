package org.esteban.pooherencia;

public class Alumno extends Persona{
    private String institucion;
    private double notaMatematicas;
    private String notaCastellano;
    private String notaHistoria;

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public double getNotaMatematicas() {
        return notaMatematicas;
    }

    public void setNotaMatematicas(double notaMatematicas) {
        this.notaMatematicas = notaMatematicas;
    }

    public String getNotaCastellano() {
        return notaCastellano;
    }

    public void setNotaCastellano(String notaCastellano) {
        this.notaCastellano = notaCastellano;
    }

    public String getNotaHistoria() {
        return notaHistoria;
    }

    public void setNotaHistoria(String notaHistoria) {
        this.notaHistoria = notaHistoria;
    }
}
