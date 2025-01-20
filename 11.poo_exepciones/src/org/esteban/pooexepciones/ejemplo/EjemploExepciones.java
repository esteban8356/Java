package org.esteban.pooexepciones.ejemplo;

import javax.swing.*;

public class EjemploExepciones {
    public static void main(String[] args) {

        Calculadora cal = new Calculadora();
        String numerador = JOptionPane.showInputDialog("Ingrese un entero numerador");
        String denominador = JOptionPane.showInputDialog("Ingrese un entero denominador");

        try {
            double divicion2 = cal.dividir(numerador,denominador);
            System.out.println("divicion2 = " + divicion2);
        }
        catch (FormatoNumeroException e){
            System.out.println("Se detecto una exepcion: ingrese un numero valido : " + e.getMessage());
            e.printStackTrace(System.out);
        }
        catch (DivisionPorZeroException ae) {
            System.out.println("capturamos la exepcion en tiempo de ejecucion " + ae.getMessage());
            main(args);
        }finally {
            System.out.println("es opcional, pero se ejecuta  siempre con o sin exepcion ");
        }
        System.out.println("Continuamos la ejecucion");

    }
}
