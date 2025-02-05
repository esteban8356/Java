package org.esteban.hilos.ejemplosSync;

public class prueba {
    //esta es una prueba muy mala
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.print(i);
            if (i % 2 == 0 && i % 3 == 0) {
                System.out.println(" = FIZZ BUZZ");
            } else if (i % 3 == 0) {
                System.out.println(" = BUZZ");
            } else if (i % 2 == 0) {
                System.out.println(" = FIZZ");
            }
        }
    }
}
