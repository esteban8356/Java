package org.esteban.hilos.ejemplos.thereads;

public class NombreTheread  extends Thread{

    public NombreTheread(String name) {
        super(name);
    }

    @Override
    public void run() {

        System.out.println("se inicia el metodo run del hilo " + getName());

        for (int i = 0; i < 10; i++) {
            System.out.println(this.getName() );
        }
        System.out.println("Finalizo el hilo");

    }
}
