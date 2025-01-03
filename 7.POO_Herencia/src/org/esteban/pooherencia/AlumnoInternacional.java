package org.esteban.pooherencia;

public class AlumnoInternacional extends Alumno {
    private String pais;
    private double notaIdiomas ;

    public AlumnoInternacional(){
        System.out.println("AlumnoInternacional: Iniciando contructor");
    }

    public AlumnoInternacional (String Nombre, String apellidos) {
        super(Nombre, apellidos);
    }

    public AlumnoInternacional(String Nombre, String apellidos, String pais) {
        super(Nombre, apellidos);
        this.pais = pais;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public double getNotaIdiomas() {
        return notaIdiomas;
    }

    public void setNotaIdiomas(double notaIdiomas) {
        this.notaIdiomas = notaIdiomas;
    }
}
