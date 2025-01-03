package org.esteban.pooherencia;

public class Profesor extends Persona {
    private String asignatura;

    public Profesor(){
        System.out.println("Profesor: Inciando Contructor");
    }

    public Profesor(String Nombre, String apellido) {
        super(Nombre, apellido);
    }

    public Profesor(String Nombre, String apellido, String asignatura) {
        super(Nombre, apellido);
        this.asignatura = asignatura;
    }


    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }
}
