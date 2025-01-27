package org.esteban.hilos.ejemplos;

import org.esteban.hilos.ejemplos.runnable.ViajeTarea;

public class EjemploInterfaceRunnable {
    public static void main(String[] args) {

        new Thread(new ViajeTarea("Isla de San andres")).start();
        new Thread(new ViajeTarea("Cali")).start();
        new Thread(new ViajeTarea("Bucaramanga")).start();
        new Thread(new ViajeTarea("Manizales")).start();
    }
}
