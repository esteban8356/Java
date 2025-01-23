package org.esteban.hilos.ejemplos;

import org.esteban.hilos.ejemplos.thereads.NombreTheread;

public class EjemploExtenderTheread {
    public static void main(String[] args) throws InterruptedException {

        Thread hilo = new NombreTheread("Jhon Doe");
        hilo.start();
       // Thread.sleep(2);

        Thread hilo2 = new NombreTheread("maria");
        hilo2.start();
        System.out.println(hilo.getState());

        NombreTheread hilo3 = new NombreTheread("pepe");
        hilo3.start();
        System.out.println(hilo.getState());

    }
}
