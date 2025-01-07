package org.esteban.pooclasesabstractas.form.elementos;

public class TexareaForm extends ElementoForm {

    private int filas;
    private int columnas;

    public TexareaForm(String nombre) {
        super(nombre);
    }

    public TexareaForm(String nombre, int filas, int columnas) {
        super(nombre);
        this.filas = filas;
        this.columnas = columnas;
    }

    public int getFilas() {
        return filas;
    }

    public void setFilas(int filas) {
        this.filas = filas;
    }

    public int getColumnas() {
        return columnas;
    }

    public void setColumnas(int columnas) {
        this.columnas = columnas;
    }

    @Override
    public String dibujarHtml() {
        return "<textarea name='" + this.nombre + "' cols='"
                + this.columnas + "' rows='" + this.filas + "'>"
                + this.valor + "</textarea>";
    }
}

