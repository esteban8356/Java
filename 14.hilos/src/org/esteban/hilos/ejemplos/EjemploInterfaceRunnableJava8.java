package org.esteban.hilos.ejemplos;

import org.esteban.hilos.ejemplos.runnable.ViajeTarea;

public class EjemploInterfaceRunnableJava8 {
    public static void main(String[] args) {

        Runnable viaje = () -> {
                for (int i = 0; i < 10; i++) {
                    System.out.println(i + " - " + Thread.currentThread().getName());
                    try {
                        Thread.sleep((long)(Math.random() * 1000));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("Finalmente me voy de viaje a: " + Thread.currentThread().getName());

        };

        //cada uno tiene su propia secuencia en paralelo
        new Thread(viaje, "Isla de San andres").start();
        new Thread(viaje, "Cali").start();
        new Thread(viaje, "Bucaramanga").start();
        new Thread(viaje, "Manizales").start();
    }
}
