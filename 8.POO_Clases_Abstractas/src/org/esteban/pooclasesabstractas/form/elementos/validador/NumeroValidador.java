package org.esteban.pooclasesabstractas.form.elementos.validador;

public class NumeroValidador extends Validador {

    protected String mensaje = "el campo debe ser un numero";
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
        try {
            Integer.parseInt(valor);
            return true;
        }catch(NumberFormatException e) {
            return false;
        }
    }
}
