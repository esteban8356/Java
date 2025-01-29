package org.esteban.hilos.ejemplos;

import org.esteban.hilos.ejemplos.runnable.ImprimirFraces;

public class EjemploSincronizaconTheread {
    public static void main(String[] args) throws InterruptedException {
        new Thread(new ImprimirFraces("Hola ","Que tal")).start();
        new Thread(new ImprimirFraces("quien eres ","tu?")).start();
        Thread.sleep(100);
        Thread h3 = new Thread(new ImprimirFraces("muchas ","gracias amigo!"));

        h3.start();
        Thread.sleep(100);
        System.out.println(h3.getState());


    }
    public synchronized static void imprimirFrases(String frase1,String frase2){
        System.out.print(frase1);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
           e.printStackTrace();
        }
        System.out.println(frase2);
    }
}
