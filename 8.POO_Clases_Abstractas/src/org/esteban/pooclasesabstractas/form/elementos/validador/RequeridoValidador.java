package org.esteban.pooclasesabstractas.form.elementos.validador;

public class RequeridoValidador extends Validador {

    protected String mensaje = "el campo es requqerido";

    @Override
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String getMensaje() {
        return mensaje;
    }

    @Override
    public boolean esValido(String valor) {
        return (valor != null && !valor.isEmpty());
    }
}
