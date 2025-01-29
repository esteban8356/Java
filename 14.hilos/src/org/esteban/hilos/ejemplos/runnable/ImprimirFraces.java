package org.esteban.hilos.ejemplos.runnable;

import static org.esteban.hilos.ejemplos.EjemploSincronizaconTheread.imprimirFrases;

public class ImprimirFraces implements Runnable {

    String frase1, frase2;

    public ImprimirFraces(String frase1, String frase2) {
        this.frase1 = frase1;
        this.frase2 = frase2;
    }

    @Override
    public void run() {
        imprimirFrases(this.frase1, this.frase2);
    }
}
