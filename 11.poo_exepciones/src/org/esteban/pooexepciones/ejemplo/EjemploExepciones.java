package org.esteban.pooexepciones.ejemplo;

import javax.swing.*;

public class EjemploExepciones {
    public static void main(String[] args) {

        String valor = JOptionPane.showInputDialog("Ingrese un entero");
        int divisor;

        try {
            divisor =Integer.parseInt(valor);
            int division = 10 / divisor;
            System.out.println(division);
        }
        catch (NumberFormatException nfe) {
            System.out.println("se detecto una exepcion porfavor ingrese nuevamente el valor numerico " + nfe.getMessage());
            main(args);
        }
        catch (ArithmeticException ae) {
            System.out.println("capturamos la exepcion en tiempo de ejecucion " + ae.getMessage());
            main(args);
        }finally {
            System.out.println("es opcional, pero se ejecuta  siempre con o sin exepcion ");
        }
        System.out.println("Continuamos la ejecucion");

    }
}
