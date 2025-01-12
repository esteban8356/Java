package org.esteban.poointerfaces.imprenta.modelo;

import java.util.ArrayList;
import java.util.List;

public class Curriculo extends Hoja implements Imprimible {

    private String persona;
    private String carrera;
    private List<String> experiencia;

    public Curriculo(String persona, String carrera,String contenido) {
        super(contenido);
        this.persona = persona;
        this.carrera = carrera;
        this.experiencia = new ArrayList<String>();

    }

    public void addExperiencia(String exp) {
        experiencia.add(exp);
    }
    @Override
    public String imprimir() {
        StringBuilder sb = new StringBuilder("Nombre: ");
        sb.append(persona).append("\n")
        .append("Resumen: ").append(contenido).append("\n")
        .append("Carrera: ").append(carrera).append("\n")
        .append("Experiencia:  \n");
        for (String exp : this.experiencia) {
            sb.append(exp).append("\n");
        }
        return sb.toString();
    }
}
