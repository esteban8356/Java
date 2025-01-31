package org.esteban.hilos.ejemplosSync;

public class Panaderia {
    private String pan;
    private boolean disponible;

    public synchronized void hornear(String masa) {
        while (disponible) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        this.pan = masa;
        System.out.println("Panadero hornea el pan: " + this.pan);
        this.disponible = true;
    }

    public synchronized String consumirpan(){
        while (!disponible) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Cliente consume : " + this.pan);
        this.disponible = false;
        notify();
        return pan;
    }
}
